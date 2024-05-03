package com.ciq.service;

import java.util.List;

import com.ciq.model.Student;

public interface StudentService {
	
	public void add(Student student);
	
	public List<Student>FindAll();
	
	public Student findById(Integer sid);

	public void DeleteById(Integer sid);
	
	public void UpdateById(Student student);

}
