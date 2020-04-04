package net.javaguides.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		((AbstractApplicationContext) context).close();
	}
}
