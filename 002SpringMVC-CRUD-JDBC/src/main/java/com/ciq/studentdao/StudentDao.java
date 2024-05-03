package com.ciq.studentdao;

import java.util.List;

import com.ciq.model.Student;

public interface StudentDao {
	
	public void add(Student student);
	
	public List<Student>FindAll();
	
	public Student findById(Integer sid);

	public void DeleteById(Integer sid);
	
	public void UpdateById(Student student);
}
