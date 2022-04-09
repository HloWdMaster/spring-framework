package com.gxd.example.lifeCycle.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
public class ChangeAIjectModelPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition abd = (AbstractBeanDefinition) beanFactory.getBeanDefinition("LC_A");
		abd.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);

	}
}
