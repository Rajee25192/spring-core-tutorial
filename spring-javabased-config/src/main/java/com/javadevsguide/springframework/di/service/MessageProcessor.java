package com.javadevsguide.springframework.di.service;

import org.springframework.stereotype.Service;

@Service
public interface MessageProcessor {
	public void processMsg(String message);
}
