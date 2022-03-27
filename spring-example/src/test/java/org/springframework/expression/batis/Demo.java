package org.springframework.expression.batis;

import org.junit.Test;

import java.lang.reflect.Method;

// 覆盖的方法.getDeclaringClass 获取到的是当前类
public class Demo {
	@Test
	public void test() throws Exception {
		Method method = MyClass.class.getMethod("toString", null);
		System.out.println(method.getDeclaringClass());
	}
}
