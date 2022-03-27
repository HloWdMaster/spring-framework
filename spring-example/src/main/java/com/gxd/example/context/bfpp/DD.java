package com.gxd.example.context.bfpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j(topic = "e")
public class DD implements BeanDefinitionRegistryPostProcessor {


	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		log.debug("d-s scan subclass postProcessBeanDefinitionRegistry");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(EE.class);
		registry.registerBeanDefinition("ee",builder.getBeanDefinition());
		builder = BeanDefinitionBuilder.genericBeanDefinition(FF.class);
		registry.registerBeanDefinition("ff",builder.getBeanDefinition());
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		log.debug("d-s scan  parent postProcessBeanFactory");

	}
}
