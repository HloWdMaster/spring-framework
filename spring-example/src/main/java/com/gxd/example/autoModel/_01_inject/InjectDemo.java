package com.gxd.example.autoModel._01_inject;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InjectDemo {

	@Test
	public void  testAutowired() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.gxd.example.autoModel._01_inject");
		ctx.refresh();
		A bean = ctx.getBean(A.class);
//		System.out.println(bean.lb);

	}
	@Test
	public void  testResource() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.gxd.example.autoModel._01_inject");
		ctx.refresh();
		A bean = ctx.getBean(A.class);
		System.out.println(bean.lb);
//		System.out.println(bean.lb);

	}
}
