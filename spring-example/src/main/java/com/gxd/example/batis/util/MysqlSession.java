package com.gxd.example.batis.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MysqlSession {
	public static <T> T getMapper(Class<T> clz) {
		ClassLoader classLoader = MysqlSession.class.getClassLoader();
		Class[] classes = new Class[]{clz};
		Object proxy = Proxy.newProxyInstance(classLoader,classes, new MyTestInvovationHandler());
		return (T) proxy;
	}


	@Slf4j(topic = "e")
	static class MyTestInvovationHandler implements InvocationHandler {
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			log.info(this.getClass().getName());
			if (method.getDeclaringClass().equals(Object.class)) {
				return  method.invoke(this,args);
			}
			Select select = method.getAnnotation(Select.class);
			String sql = select.value()[0];
			log.info("正在执行:"+sql);
			return null;
		}
	}

}
