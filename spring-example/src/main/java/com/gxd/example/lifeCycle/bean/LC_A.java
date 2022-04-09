package com.gxd.example.lifeCycle.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j(topic = "e")
public class LC_A implements BeanNameAware, ApplicationContextAware, InitializingBean {

	public LC_A() {
		log.debug("LC_A constructor");
	}

	@Autowired
	LC_B field;

	LC_C c;

	public void m0() {
		log.debug("am0");
//		System.out.println(this.getClass().getName() + ":m0");
	}


	public void setCA(LC_C c) {
		log.debug("bytype wired:[{}]",c);
		this.c = c;
	}



	@Override
	public void setBeanName(String name) {
		log.debug("BeanNameAware#setBeanName");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.debug("InitializingBean#afterPropertiesSet");

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		log.debug("ApplicationContextAware#setApplicationContext");
	}

	@PostConstruct
	public void postConstruct() {
		log.debug("@PostConstruct");

	}

}
