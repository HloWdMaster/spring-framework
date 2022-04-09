package com.gxd.example.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class LC_B {

	public void m0() {
		log.debug("bm0");
	}

}
