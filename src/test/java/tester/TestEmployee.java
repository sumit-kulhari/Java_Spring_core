package tester;

import com.bhavana.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {
    public static void main(String args[]){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bhavana_config.xml");
        Employee employee = (Employee)ac.getBean("employee");
        System.out.println(employee);
        Employee employee1 = (Employee)ac.getBean("employee1");
        System.out.println(employee1);

    }
}
