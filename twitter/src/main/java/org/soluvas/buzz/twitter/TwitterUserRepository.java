package org.soluvas.buzz.twitter;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TwitterUserRepository extends PagingAndSortingRepository<TwitterUser, Long> {
	
}
