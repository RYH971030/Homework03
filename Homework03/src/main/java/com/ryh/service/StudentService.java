package com.ryh.service;

import java.util.List;

import com.ryh.bean.Student;

public interface StudentService {

	List<Student> findAll(); 
	
	void updateSt(Student st);
	
	void deleteSt(String ids);
	
	void addSt(Student st);
	
	List<Object> fetchSt(Integer onset, Integer page_size);
	
}
