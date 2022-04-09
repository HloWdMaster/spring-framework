package com.gxd.example.lifeCycle.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class LC_M {



	@Autowired
	LC_N n;

	public LC_M() {
		log.debug("LC_M create");
	}

	public void hello() {
		System.out.println("hello");
	}

	public LC_N getN() {
		System.err.println("getN");
		return n;
	}
}
