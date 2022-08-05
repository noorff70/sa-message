package com.sa.email.service;

import com.sa.email.model.EmailObject;

public interface SendEmailService {
	
	public boolean sendMail(EmailObject msg);

}
