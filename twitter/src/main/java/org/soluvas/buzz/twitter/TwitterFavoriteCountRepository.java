package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.TwitterCountKey;
import org.soluvas.buzz.core.jpa.TwitterFavoriteCount;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterFavoriteCountRepository extends PagingAndSortingRepository<TwitterFavoriteCount, TwitterCountKey> {
	
}
