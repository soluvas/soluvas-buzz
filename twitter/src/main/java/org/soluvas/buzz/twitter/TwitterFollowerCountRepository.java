package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.TwitterCountKey;
import org.soluvas.buzz.core.jpa.TwitterFollowerCount;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterFollowerCountRepository extends PagingAndSortingRepository<TwitterFollowerCount, TwitterCountKey> {
	
}
