package com.gxd.example.lifeCycle.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j(topic = "e")
public class MultiAspect {

	@Pointcut("within(com.gxd.example.lifeCycle.bean.LC_M)")
	private void pointcut(){}

	@Before("pointcut()")
	public void before2() {
		log.debug("MultiAspect aop before");
	}
}
