package org.soluvas.buzz.twitter;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Operations dealing with twitter friend and follower lists.
 * @author ceefour
 */
@Repository
public class TwitterFollowerManager {
	
	private static final Logger log = LoggerFactory
			.getLogger(TwitterFollowerManager.TwitterUnfetchedFollowerPage.class);
	
	public static class TwitterUnfetchedFollowerPage {
		long snapshotId;
		long unfetchedCursor;
		long refCursor;
		int pageSize;
		long userId;
		String screenName;
		DateTime refCreationTime;
		
		public TwitterUnfetchedFollowerPage(long snapshotId,
				long unfetchedCursor, long refCursor, int pageSize,
				long userId, String screenName, DateTime refCreationTime) {
			super();
			this.snapshotId = snapshotId;
			this.unfetchedCursor = unfetchedCursor;
			this.refCursor = refCursor;
			this.pageSize = pageSize;
			this.userId = userId;
			this.screenName = screenName;
			this.refCreationTime = refCreationTime;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "TwitterUnfetchedFollowerPage ["
					+ (screenName != null ? "screenName=" + screenName + ", "
							: "")
					+ "snapshotId=" + snapshotId + ", "
							+ "unfetchedCursor=" + unfetchedCursor + "]";
		}
		
	}
	
	@PersistenceContext
	private EntityManager em;

	/**
	 * 
	 * SELECT snapshot_id, nextcursor unfetchedcursor, pagecursor refcursor, pagesize, userid, screenname, creationtime refcreationtime
	 * FROM buzz.twitterfollowerpage tfp
	 * WHERE NOT EXISTS (
	 *   SELECT pagecursor FROM buzz.twitterfollowerpage
	 *   WHERE snapshot_id=tfp.snapshot_id AND pagecursor=tfp.nextcursor)
	 * ORDER BY creationtime
	 * 
	 */
	@Transactional(readOnly=true)
	public List<TwitterUnfetchedFollowerPage>findAllUnfetchedFollowerPages() {
		List<Object[]> result = em.createNativeQuery(
				  "SELECT snapshot_id, nextcursor unfetchedcursor, pagecursor refcursor, pagesize, userid, screenname, creationtime refcreationtime"
				+ " FROM buzz.twitterfollowerpage tfp"
				+ " WHERE NOT EXISTS ("
				+ "   SELECT pagecursor FROM buzz.twitterfollowerpage"
				+ "   WHERE snapshot_id=tfp.snapshot_id AND pagecursor=tfp.nextcursor)"
				+ " ORDER BY creationtime").getResultList();
		ArrayList<TwitterUnfetchedFollowerPage> pages = new ArrayList<>();
		for (Object[] row : result) {
			TwitterUnfetchedFollowerPage rowPage = new TwitterUnfetchedFollowerPage(
					((BigInteger) row[0]).longValue(), ((BigInteger) row[1]).longValue(), ((BigInteger) row[2]).longValue(), ((BigInteger) row[3]).intValue(),
					((BigInteger) row[4]).longValue(), (String) row[5], new DateTime(row[6]));
			pages.add(rowPage);
		}
		log.info("Got {} unfetched follower pages: {}", pages.size(), pages);
		return pages;
	}
	
}
