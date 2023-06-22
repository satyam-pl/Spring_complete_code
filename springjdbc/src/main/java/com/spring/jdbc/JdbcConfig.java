package com.spring.jdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StduentDaoImpl;

@Configuration
public class JdbcConfig {

	
	
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Root");
		
		return dataSource;
		
	}
	
	
	@Bean
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
        return template;		
		
	}
	
	
	@Bean
	public StduentDaoImpl getStudentImpl()
	{
		                                                      //Instead of creating the object of studetDaoImpl we can also inject
		                                                     // it directly using autowired also
		StduentDaoImpl student = new StduentDaoImpl();       // Step 1  : remove StudenetDaoImpl Bean
		                                                     // step 2: add Another annotation @ComponentScan(basePackeges= {com.spring.jdbc.dao})
		                                                      // step 3: add @Component tag above StudentDaoImpl class
		                                                      // step 4. Add @Autowired annotation aboe public JdbcTemplate jdbcTemplate variable
		                                                   // now run
		                                                     //  here object or studentDaoImpl will be automatically created by IOC container
		student.setJdbcTemplate(getTemplate());

		return student;
		
		
		//
		
	}
}
