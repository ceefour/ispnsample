package com.example.ispnsample;

import javax.cache.annotation.CacheResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CachingBean {

	private transient Logger log = LoggerFactory.getLogger(CachingBean.class);
	
	@CacheResult
	public String getUpper(String input) {
		log.info("Uppercasing {}", input);
		return input.toUpperCase();
	}
}
