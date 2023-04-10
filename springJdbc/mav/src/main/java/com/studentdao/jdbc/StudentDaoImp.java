package com.studentdao.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jj.student.Student;


public class StudentDaoImp implements StudentDao {
	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		String query="insert into student(id,STudent_name,city) value(?,?,?)";
		int r=this.jdbctemplate.update(query,student.getId(),student.getStudent_name(),student.getCity());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	

}
