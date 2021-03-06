package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.TwitterCountKey;
import org.soluvas.buzz.core.jpa.TwitterListedCount;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterListedCountRepository extends PagingAndSortingRepository<TwitterListedCount, TwitterCountKey> {
	
}
