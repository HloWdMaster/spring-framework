package com.gxd.example.lifeCycle.bean;

import org.springframework.stereotype.Component;

@Component
public class LC_C {

	public void m0() {
		System.out.println(this.getClass().getName()+":m0");
	}

}
