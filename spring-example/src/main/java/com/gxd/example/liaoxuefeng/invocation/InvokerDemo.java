package com.gxd.example.liaoxuefeng.invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class InvokerDemo {

	public static void main(String[] args) {

		InvocationHandler handler = new InvocationHandler(){

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method);
				if (method.getName().equals("morning")) {
					System.out.println("Good Morning:"+args[0]);
				}
				return null;
			}
		};

		Hello hello = (Hello)Proxy.newProxyInstance(
				Hello.class.getClassLoader(),
				new Class[]{Hello.class},
				handler
		);

		hello.morning("sir");
	}

}
