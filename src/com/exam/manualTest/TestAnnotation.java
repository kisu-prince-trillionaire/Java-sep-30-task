package com.exam.manualTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.exam.components.Exam;
import com.student.components.Student;

public class TestAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/exam/resources/Annotation.xml");
		Exam exam = (Exam)context.getBean("examObject");
		System.out.println(exam);
		Student student = (Student) context.getBean("studentObject");
		System.out.println(student);
		((ClassPathXmlApplicationContext) context).close();
	}

}
