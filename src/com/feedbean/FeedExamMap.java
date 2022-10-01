package com.feedbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("feedExamMap")
public class FeedExamMap {
	List<String> subject;
	Map<String, Integer> markRecord;
	
	public FeedExamMap() {
	    markRecord=new HashMap<String,Integer>();
	    markRecord.put("math", 95);
	    markRecord.put("Cse", 90);
	    markRecord.put("Dsa", 75);
	    markRecord.put("Os", 85);
	    
	    subject = new ArrayList<String>();
		subject.add("Math");
		subject.add("Physics");
		subject.add("Chemistry");
		subject.add("Computer");
	}

	public Map<String, Integer> getMarkRecord() {
		return markRecord;
	}

	public void setMarkRecord(Map<String, Integer> markRecord) {
		this.markRecord = markRecord;
	}

	public List<String> getSubject() {
		return subject;
	}

	public void setSubject(List<String> subject) {
		this.subject = subject;
	}
	
	
}
