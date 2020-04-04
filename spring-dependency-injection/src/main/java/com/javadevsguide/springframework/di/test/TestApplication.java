package com.javadevsguide.springframework.di.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javadevsguide.springframework.di.config.AppConfiguration;
import com.javadevsguide.springframework.di.constructor.ConstructorBasedInjection;
import com.javadevsguide.springframework.di.field.FieldBasedInjection;
import com.javadevsguide.springframework.di.service.SimpleSpringClass;
import com.javadevsguide.springframework.di.setter.SetterBasedInjection;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
		SimpleSpringClass  fieldBasedInjection = applicationContext.getBean(SimpleSpringClass.class);
		fieldBasedInjection.processMsg("twitter message sending dependency injection");
	}
}
