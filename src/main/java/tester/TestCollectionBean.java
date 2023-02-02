package tester;

import com.bhavana.beans.Address;
import com.bhavana.beans.Employee;
import com.bhavana.beans.EmployeeCollection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollectionBean {
    public static void main(String args[]){
//        setter injection as setters are used to set the value for the object
        ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("bhavana_collection_config.xml");
        EmployeeCollection employee = (EmployeeCollection) ac.getBean("empObject");
        System.out.println(employee);
        ac.close();
    }
}
