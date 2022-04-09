package com.gxd.example;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ModelTest {
	@Test
	public void testOrder() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.gxd.example.autoModel.order");
		ctx.refresh();

	}
}
