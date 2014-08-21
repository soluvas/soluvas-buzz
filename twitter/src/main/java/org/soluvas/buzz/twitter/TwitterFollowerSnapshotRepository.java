package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.jpa.TwitterFollowerSnapshot;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterFollowerSnapshotRepository extends PagingAndSortingRepository<TwitterFollowerSnapshot, Long> {
	
	public TwitterFollowerSnapshot findOneByScreenName(String screenName);
	
}
