package com.example.ispnsample;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ceefour
 *
 */
@Stateless
public class CallerBean {

	private Logger log = LoggerFactory.getLogger(CallerBean.class);
	@Inject CachingBean repository;

	@Schedule(second="*/3", minute="*", hour="*")
	public void fetchData() {
		String data = repository.getUpper("Hendy Irawan");
		log.info("Repository returned {}", data);
	}
	
}
