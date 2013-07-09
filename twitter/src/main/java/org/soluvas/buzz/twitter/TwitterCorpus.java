package org.soluvas.buzz.twitter;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
	public TwitterFollower ensureFollower(TwitterFollower entity) {
		em.persist(entity);
		return entity;
	}

}
