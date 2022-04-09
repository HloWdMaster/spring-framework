package com.gxd.example.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class LC_D  implements LC_F{

	@Autowired
	LC_E e;

	public LC_E getE() {
		return e;
	}

	public void m0() {
		log.debug("LC_D#m0");
	}

}
