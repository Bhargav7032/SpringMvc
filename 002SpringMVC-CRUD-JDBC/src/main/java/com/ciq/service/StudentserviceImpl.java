package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.model.Student;
import com.ciq.studentdao.StudentDao;

@Service
public class StudentserviceImpl  implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public void add(Student student) {
	studentDao.add(student); 
		
	}

	@Override
	public List<Student> FindAll() {
		return studentDao.FindAll();
	}

	@Override
	public void DeleteById(Integer sid) {
		studentDao.DeleteById(sid);
		
	}

	@Override
	public void UpdateById(Student student) {
		studentDao.UpdateById(student);
		
	}

	@Override
	public Student findById(Integer sid) {
		return studentDao.findById(sid);
	}

}
