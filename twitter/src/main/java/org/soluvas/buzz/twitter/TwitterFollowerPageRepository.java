package org.soluvas.buzz.twitter;

import org.soluvas.buzz.core.jpa.TwitterFollowerPage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TwitterFollowerPageRepository extends PagingAndSortingRepository<TwitterFollowerPage, Long> {
	
}
