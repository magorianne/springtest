package com.ib.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ib.service.Hello;

public class FirstSpring {
	private static Logger logger = LoggerFactory.getLogger(FirstSpring.class);
	public static void main(String[] args) {
		
		//creation du conteneur leger
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("HelloApplicationContext.xml");
		Hello hello = applicationContext.getBean(Hello.class);
		logger.info("Reponse de la classe HelloImpl : {}", hello.sayHello());
		
		logger.info("Reponse de la classe HelloImpl (injection dans le constructeur): {}", hello.sayHelloParameter());
	}

}
