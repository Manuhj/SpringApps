package com.dev;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Manager2 {
public static void main(String[] args) {
	BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("config.xml"));
	Person ob1=(Person)beanFactory.getBean("p2");
	System.out.println(ob1.getFname());
	System.out.println(ob1.getLname());
	System.out.println("done");
}
}
