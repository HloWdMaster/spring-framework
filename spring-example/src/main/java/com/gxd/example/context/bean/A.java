package com.gxd.example.context.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class A {

	@Autowired
	private C c;

	public void setC(C c) {
		this.c = c;
	}

	public C getC() {
		log.info("c={}",c);
		return c;
	}
}
