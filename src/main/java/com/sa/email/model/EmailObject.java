package com.sa.email.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailObject {
	
	EmailObject() {
		
	}

	private Student student;
	private String sentMailTo;
	private int selectedCourseId;
	private String requestedInfo;
	private String selectedCourseDesc;
}
