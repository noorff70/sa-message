package com.sa.email.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sa.email.model.EmailObject;
import com.sa.email.service.SendEmailService;



@RestController
public class EmailController {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SendEmailService sendMessage;
	
	@PostMapping("/email/sendEmail" )
	public boolean sendEmail (@RequestBody EmailObject message) {
		sendMessage.sendMail(message);
		
		return true;
	}
	
	/*@GetMapping ("/email/test")
	public boolean testController (@RequestParam("TEST") String desc) {
		
		return true;
		
	}*/

}
