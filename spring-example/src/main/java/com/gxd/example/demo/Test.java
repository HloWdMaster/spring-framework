package com.gxd.example.demo;

import org.springframework.util.ClassUtils;

public class Test {
	public static void main(String[] args) {
		try {
			Class<?> aClass = ClassUtils.forName("com.gxd.example.demo.Outer.Inner", Test.class.getClassLoader());
			Object o = aClass.newInstance();
			System.out.println(aClass);
			System.out.println(o );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
