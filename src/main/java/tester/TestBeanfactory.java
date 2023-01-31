package tester;

import com.bhavana.beans.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanfactory {
    public static void main(String args[]){
        BeanFactory factory = new ClassPathXmlApplicationContext("bhavana_config.xml");
        Employee employee = (Employee)factory.getBean("employee");
        System.out.println(employee);
        Employee employee1 = (Employee)factory.getBean("employee1");
        System.out.println(employee1);
    }
}
