package com.gxd.example.ruyuan.demo;

import com.gxd.example.ruyuan.entity.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryDemmo {
	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(
				new ClassPathResource("application.xml"));
		Student student = (Student) beanFactory.getBean("student");
		System.out.println(student.getName());

	}
}
