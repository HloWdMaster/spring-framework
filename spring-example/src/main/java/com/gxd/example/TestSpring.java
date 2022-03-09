package com.gxd.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

	public void test() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.refresh();

	}
}
