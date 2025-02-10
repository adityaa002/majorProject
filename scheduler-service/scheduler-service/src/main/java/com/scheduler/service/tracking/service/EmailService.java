package com.scheduler.service.tracking.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
	 public void sendSimpleEmail(String to, String subject, String text); 
		 
	 }
