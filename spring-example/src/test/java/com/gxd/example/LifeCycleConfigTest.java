package com.gxd.example;

import com.gxd.example.lifeCycle.bean.LC_F;
import com.gxd.example.lifeCycle.bean.LC_M;
import com.gxd.example.lifeCycle.bean.LC_N;
import com.gxd.example.lifeCycle.conf.LifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleConfigTest {

	@Test
	public void defaultCycle() {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(LifeCycleConfig.class);
//		LC_A lcA = ctx.getBean(LC_A.class);
//		lcA.m0();
		LC_F lcF = ctx.getBean(LC_F.class);
//		LC_D lcD = (LC_D) bean;
//		System.out.println(lcF.m0());
		lcF.m0();
//		LC_E lcE = ctx.getBean(LC_E.class);
//		lcE.m0();

	}

	@Test
	public void testCircleDependency() {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(LifeCycleConfig.class);
		LC_M bean = ctx.getBean(LC_M.class);
		LC_N n = bean.getN();
		bean.hello();
		System.out.println(n);

	}


}