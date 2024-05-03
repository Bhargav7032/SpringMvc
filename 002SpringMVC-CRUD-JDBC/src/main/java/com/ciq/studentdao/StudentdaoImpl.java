package com.ciq.studentdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Student;

@Repository
public class StudentdaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void add(Student student) {
	jdbcTemplate.update("INSERT INTO  STUDENT VALUES(?,?,?)",new Object[] {student.getSid(),student.getSname(),student.getSfee()});
		
	}


	@Override
	public List<Student> FindAll() {
		return jdbcTemplate.query("SELECT * FROM STUDENT", new BeanPropertyRowMapper(Student.class));
 
	}
	@Override
	public Student findById(Integer sid) {
		return (Student) jdbcTemplate.queryForObject("SELECT * FROM Student WHERE SID = ?",new Object[] {sid}, new BeanPropertyRowMapper(Student.class));

		
	}

	@Override
	public void DeleteById(Integer sid) {
		jdbcTemplate.update("DELETE FROM STUDENT WHERE SID = ?", new Object[] {sid});
	}


	@Override
	
	public void UpdateById(Student student) {
	jdbcTemplate.update("UPDATE STUDENT SET SNAME = ?, SFee = ? WHERE SID = ? ",new Object[] {student.getSname(),student.getSfee(),student.getSid()});
		 
	}


	}


