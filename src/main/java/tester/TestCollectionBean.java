package tester;

import com.bhavana.beans.Employee;
import com.bhavana.beans.EmployeeCollection;
import com.bhavana.resources.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionBean {
    public static void main(String args[]){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Employee emp1 = applicationContext.getBean("createEmployee",Employee.class);
        Employee emp2 = applicationContext.getBean("createEmp",Employee.class);
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
