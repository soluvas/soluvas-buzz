package org.soluvas.buzz.twitter;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterFollowerRepository extends PagingAndSortingRepository<org.soluvas.buzz.core.jpa.TwitterFollower, Long> {
	
}
