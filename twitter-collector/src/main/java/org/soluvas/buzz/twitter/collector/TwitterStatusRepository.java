package org.soluvas.buzz.twitter.collector;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by ceefour on 28/04/2015.
 */
@Repository
public interface TwitterStatusRepository extends PagingAndSortingRepository<TwitterStatus, Long> {

    @Query("SELECT DISTINCT(LOWER(rt.userScreenName)) FROM Tweet rt")
    Set<String> findAllDistinctScreenNames();

    @Query("SELECT DISTINCT(LOWER(rt.userScreenName)) FROM Tweet rt WHERE LOWER(rt.userScreenName) NOT IN (:exclusionsLower)")
    Set<String> findAllDistinctScreenNamesExcluding(@Param("exclusionsLower") Set<String> exclusionsLower);

    @Query("SELECT rt FROM Tweet rt WHERE rt.lat IS NOT NULL OR rt.placeBoundingBoxSwLat IS NOT NULL")
    Page<TwitterStatus> findAllWithLocation(Pageable pageable);

}
