package com.udemy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextt.xml");
	
	Employee e=context.getBean("employee1",Employee.class);
	e.displayInfo();
}
}
