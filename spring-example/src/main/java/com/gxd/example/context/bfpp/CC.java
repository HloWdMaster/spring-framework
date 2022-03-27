package com.gxd.example.context.bfpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

@Slf4j(topic = "e")
public class CC implements BeanDefinitionRegistryPostProcessor {

	/**
	 * 重写父类方法
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		log.debug("c-s api parent postProcessBeanFactory");
	}

	/**
	 * 重写子类方法
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		log.debug("c-s api subclass postProcessBeanDefinitionRegistry");
	}


}
