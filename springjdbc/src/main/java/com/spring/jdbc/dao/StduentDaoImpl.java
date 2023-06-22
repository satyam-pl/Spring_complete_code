package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

// This is the implementation class of the interface methods;
// In this class We will crete the Object of JdbcTempalte using bean and with the help of this we will fire the queries;

public class StduentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	// Insert Method  body
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";

		int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		System.out.println("numbers of recordes inserted.." + result);
		return result;
	}

	
	
	// change method body 
	public int change(Student student) {
		String query = "update student set name =? where id= ?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getId());
		System.out.println("numbers of records updated" + result);
		return 0;
	}

	
	
	//delete method body
	public int delete(int StudentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query, StudentId);
		System.out.println("numbers of records deleted" + result);
		return 0;
	}

	
	
	
	//method to display a result
	public Student getStudent(int StudentId)
	{
		
	
		String query = "select * from student where id =?";
		
		
			RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper  ,StudentId);
		return student;
	
	}
	//created getter / setter of of jdbcTemplate to to craete its object using bean in config file
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public StduentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public StduentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
