package com.exam.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.ExamDao;

@Service
public class ExamService {
	@Autowired
	ExamDao examDao;
	
	public void addExam() {
		examDao.addExam();
	}
}
