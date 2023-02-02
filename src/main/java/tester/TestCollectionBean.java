package tester;

import com.bhavana.beans.EmployeeCollection;
import com.bhavana.resources.Configuration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionBean {
    public static void main(String args[]){
//        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("bhavana_collection_config.xml");
//        EmployeeCollection employee = (EmployeeCollection) ac.getBean("empObject");
//        System.out.println(employee);
////        autowire example
//        EmployeeCollection employee1 = (EmployeeCollection)ac.getBean("employee1");
//        System.out.println(employee1);
        Configuration configuration = new Configuration();
        System.out.println(configuration.createEmployee());
        System.out.println(configuration.createAddress());
//        ac.close();
    }
}
