package com.sa.email.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.sa.email.model.EmailObject;
import com.sa.email.service.SendEmailService;

@Service
public class SendEmailImpl implements SendEmailService{
	
	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public boolean sendMail(EmailObject email) {
		
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("studyaid.ca@gmail.com");
        msg.setFrom(email.getStudent().getStudentEmail());
        msg.setSubject("Course Id: " + email.getSelectedCourseId() + ", Course Description: " +  email.getSelectedCourseDesc() );
        msg.setText(email.getRequestedInfo());

        javaMailSender.send(msg);
		
		return true;
	}

}
