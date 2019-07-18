package com.javatpoint;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	
	//1st way by using classpath resource and xml bean factory
	//Resource resource=new ClassPathResource("applicationContext.xml");
	//BeanFactory factory=new XmlBeanFactory(resource);
	
	//2nd way by using ClassPathXmlApplicationContext
	ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
	Student student=factory.getBean("studentbean", Student.class);
    student.display();  

}
}
