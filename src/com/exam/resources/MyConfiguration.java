package com.exam.resources;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.exam.components.Exam;
import com.feedbean.FeedExamMap;

@Configuration
public class MyConfiguration {
	@Bean
	public Exam createExam() {
		Exam exam = new Exam();
		exam.seteId(1111);
		exam.setName("Physics");
		exam.setMarks(98);
		FeedExamMap fem = new FeedExamMap();
		exam.setSubject((List<String>) fem);
		return exam;
	}
	
}
