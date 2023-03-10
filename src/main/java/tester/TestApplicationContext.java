package tester;

import com.bhavana.beans.Address;
import com.bhavana.beans.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String args[]){
//        setter injection as setters are used to set the value for the object
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("bhavana_config.xml");
//        Employee employee = (Employee)ac.getBean("employee");
//        System.out.println(employee);
        Employee employee1 = (Employee)ac.getBean("employee1");
        System.out.println(employee1);
//        Using constructor injection
        Employee employee2 = (Employee)ac.getBean("empObject");
        System.out.println(employee2);
        Address address = (Address)ac.getBean("address");
        System.out.println(address);
        Employee employee3 = (Employee)ac.getBean("employee3");
        Address address1 = employee3.getAddress();
        System.out.println(employee3);
//        System.out.println(employee1);
        ac.close();
    }
}
