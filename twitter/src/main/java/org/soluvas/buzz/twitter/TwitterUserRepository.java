package org.soluvas.buzz.twitter;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterUserRepository extends PagingAndSortingRepository<org.soluvas.buzz.core.jpa.TwitterUser, Long> {
	
	public org.soluvas.buzz.core.jpa.TwitterUser findOneByScreenName(String screenName);
	
}
