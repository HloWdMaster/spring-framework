package org.springframework.expression;

import com.gxd.example.context.bean.A;
import com.gxd.example.context.bean.C;
import com.gxd.example.context.bfpp.BB;
import com.gxd.example.context.bfpp.CC;
import com.gxd.example.context.config.ContextConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextTest {
	@Test
	public void defalultContext() {

//		DefaultListableBeanFactory beanFactory =
//				new DefaultListableBeanFactory();
//		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(A.class);
//		// 自动注入 set autowired 都会生效
////		builder.getBeanDefinition().setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
//		beanFactory.registerBeanDefinition("a", builder.getBeanDefinition());
//
//		builder = BeanDefinitionBuilder.genericBeanDefinition(C.class);
//		beanFactory.registerBeanDefinition("c", builder.getBeanDefinition());
//
//		// 使 autowired 注解生效
////		AutowiredAnnotationBeanPostProcessor autowiredAnnotationBeanPostProcessor = new AutowiredAnnotationBeanPostProcessor();
////		autowiredAnnotationBeanPostProcessor.setBeanFactory(beanFactory);
////		beanFactory.addBeanPostProcessor(autowiredAnnotationBeanPostProcessor);
//
//		C c = beanFactory.getBean(C.class);
//		A a = beanFactory.getBean(A.class);
//		a.getC();

//		AnnotationConfigApplicationContext context
//				= new AnnotationConfigApplicationContext(ContextConfig.class);
//
//		context.getBean(A.class).getC();

	}

	@Test
	public void testBfPP() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.gxd.example.context.bfpp");
		ctx.addBeanFactoryPostProcessor(new BB());
		ctx.addBeanFactoryPostProcessor(new CC());
		ctx.refresh();

	}
}
