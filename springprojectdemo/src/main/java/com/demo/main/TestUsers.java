package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.UserBean;

public class TestUsers {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBean bean=(UserBean) context.getBean("userBean");
		System.out.println(bean.getName()+" : "+bean.getBalance());
		bean.deposit(2024);
		System.out.println(bean.getName()+" : "+bean.getBalance());
	
	
	
	}
	
	
}
