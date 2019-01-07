package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.InforService;
import com.service.imp.InforHelloServicImpl;

public class InforAction {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InforService bean = (InforService) ac.getBean("inforService");
		bean.say();
	 InforHelloServicImpl	hello=(InforHelloServicImpl) ac.getBean("hello");
	 hello.hello();
		
	}

/*	public void Testsay() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		InforService bean = (InforService) ac.getBean("inforService");
		bean.say();
		InforHello hello = (InforHello) ac.getBean("hello");
		hello.hello();
	}*/

}
