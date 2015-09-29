package com.dev;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager3 {
	public static void main(String[] args) {
		//BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config.xml"));
		ClassPathResource cpr=new ClassPathResource("config.xml");
		BeanFactory beanFactory=new XmlBeanFactory(cpr);
		Employee ob2 = (Employee) beanFactory.getBean("p3");
		System.out.println(ob2.getEname());
		System.out.println(ob2.getAge());
		
	}
}
