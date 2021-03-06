package com.skilldistillery.jpabeer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpabeer.entities.BeerComments;

class BeerCommentsTest {
	private EntityManagerFactory emf;
	private EntityManager em;

	@BeforeEach
	void setUp() throws Exception {
		emf = Persistence.createEntityManagerFactory("BeerApp");
		em = emf.createEntityManager();
	}

	@Test
	@DisplayName("Test beer comment user mappings")
	void test_beer_comment_user_mappings() {
		BeerComments bc = em.find(BeerComments.class, 1);
		int i = bc.getUser().getId();
		assertEquals(1, i);
		int j = bc.getBeer().getId();
		assertEquals(1, j);
	}
	
	@Test
	@DisplayName("Test timestamp for comment")
	void test_timestamp_for_comment() {
		
		BeerComments bc = em.find(BeerComments.class, 1);
		Date d = bc.getDateTime();
		assertEquals("2018-04-27 10:10:02.0", d.toString());
		
	}

	@AfterEach
	void tearDown() throws Exception {

		em.close();
		emf.close();
	}

}
