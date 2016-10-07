package com.yogendra.springHibernate;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
public class InsertTest {  
public static void main(String[] args) {  
      
    Resource r=new ClassPathResource("applicationContext.xml");
	//ApplicationContext context = new XmlClassPathApplicationContext("applicationContext.xml");
    BeanFactory factory=new XmlBeanFactory(r);  
      
    EmployeeDao dao=(EmployeeDao)factory.getBean("d");  
      
    Employee e=new Employee();  
    e.setId(115);  
    e.setName("varun");  
    e.setSalary(50000);  
       
    dao.saveEmployee(e);
    //dao.deleteEmployee(e);
    
      
}  
}  