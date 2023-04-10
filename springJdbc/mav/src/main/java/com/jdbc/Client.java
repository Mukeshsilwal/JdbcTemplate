package com.jdbc;
import com.studentdao.jdbc.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.jj.student.Student;

public class Client {
	public static void main(String args[]) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/jdbc/conf.xml");
	StudentDao studentDao=(StudentDao)context.getBean("studentDao");
	Student student=new Student();
	student.setId(100);
	student.setCity("Lalitpur");
	student.setStudent_name("Ram");
	int result=studentDao.insert(student);
	System.out.println(result);
	}

}
