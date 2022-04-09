package com.gxd.example.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class LC_N implements InitializingBean {

	@Autowired
	LC_M m;

	public LC_N() {
		log.debug("LC_N create");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("afterPropertiesSet");
	}

	@Override
	public String toString() {
		return "LC_N{" +
				"m=" + m +
				'}';
	}
}
