package com.javatpoint.constructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextt.xml");
	Employee emp=(Employee) context.getBean("e1");
	emp.show();
}
}
