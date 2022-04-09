package com.gxd.example.lifeCycle.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class JDKProxyBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 返回null 则使用原有对象
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("LC_D".equals(beanName)) {
			ClassLoader classLoader = this.getClass().getClassLoader();
			Class<?>[] interfaces = bean.getClass().getInterfaces();
			Object proxy = Proxy.newProxyInstance(classLoader, interfaces, new MyInvocationHandler(bean));
			return proxy;
		}
		return null;
	}

	@Slf4j(topic = "e")
	static class MyInvocationHandler implements InvocationHandler{

		Object object;

		public MyInvocationHandler(Object object) {
			this.object = object;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			log.debug("aop ----------before---------------");
			Object result = method.invoke(object, args);
			log.debug("aop ----------after---------------");
			return result;
		}
	}
}
