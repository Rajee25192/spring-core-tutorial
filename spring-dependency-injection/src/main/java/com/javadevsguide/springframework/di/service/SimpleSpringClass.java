package com.javadevsguide.springframework.di.service;

import org.springframework.beans.factory.annotation.Autowired;

public class SimpleSpringClass {

	@Autowired
	private MessageService messageService;
	
	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}
