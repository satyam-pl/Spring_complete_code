package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "my program started" );
        
        
        
        // Using Xml Based Congiguration file
       // ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        
        
        //Using JavaBased Coinfiguration
        
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao stu=context.getBean("getStudentImpl",StudentDao.class);
        
        
        
        Student st = new Student();
        st.setId(7887);
        st.setName("Nishi");
        st.setCity("Arniya");
    
        
        //Use insert Method to insert values into database
        
        //stu.insert(st);
        
        
        //Use change mathod to update the  values into the database
   
        // stu.change(st);
         
         
         // Use delete method to delete the record from the database;
         // stu.delete(456);

        
        
      System.out.println(stu.getStudent(999));


//int result = template.update(query,456,"Vedansh Patel","Ashta");

    
    }
}
