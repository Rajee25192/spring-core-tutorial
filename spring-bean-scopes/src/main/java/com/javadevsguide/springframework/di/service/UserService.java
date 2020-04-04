package com.javadevsguide.springframework.di.service;

import org.springframework.beans.factory.annotation.Required;

public class UserService {
	
	private String name;

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}
}
