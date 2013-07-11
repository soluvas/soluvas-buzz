package org.soluvas.buzz.twitter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;

import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ceefour
 *
 */
@Repository
public class TwitterCorpus {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public TwitterFollower ensureFollower(TwitterFollower follower) {
		em.persist(follower);
		return follower;
	}

	@Transactional
	public TwitterFollowing ensureFollowing(TwitterFollowing following) {
		em.persist(following);
		return following;
	}

	@Transactional
	public TwitterUser ensureUser(TwitterUser user) {
		em.persist(user);
		return user;
	}

	/**
	 * Get the latest {@link TwitterUser}.
	 * @param screenName May be mixed case, this will be normalized during query.
	 * @param minFetchTime
	 * @return
	 */
	public TwitterUser findOneUserLatest(String screenName) {
		final TypedQuery<TwitterUser> query = em.createQuery("SELECT tu FROM TwitterUser tu"
				+ " WHERE lower(screenName) = :screenName ORDER BY fetchTime DESC", TwitterUser.class);
		query.setParameter("screenName", screenName.toLowerCase());
		return query.getSingleResult();
	}

	/**
	 * Get a {@link TwitterUser} with a {@link TwitterUser#getFetchTime()}
	 * equal or later than minFetchTime.
	 * @param screenName May be mixed case, this will be normalized during query.
	 * @param minFetchTime
	 * @return
	 */
	public TwitterUser findOneUser(String screenName, DateTime minFetchTime) {
		final TypedQuery<TwitterUser> query = em.createQuery("SELECT tu FROM TwitterUser tu"
				+ " WHERE lower(screenName) = :screenName AND fetchTime > :minFetchTime ORDER BY fetchTime DESC", TwitterUser.class);
		query.setParameter("screenName", screenName.toLowerCase());
		query.setParameter("minFetchTime", minFetchTime.toDate(), TemporalType.TIMESTAMP);
		return query.getSingleResult();
	}

}
