package com.bhavana.resources;

import com.bhavana.beans.Address;
import com.bhavana.beans.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Employee createEmployee(){
        Employee employee = new Employee();
        employee.setEid(101);
        employee.setName("Sam");
        employee.setSalary(5700);
        Address address = createAddress();
        employee.setAddress(address);
        return employee;
    }
    @Bean
    public Employee createEmp(){
        Employee employee1 = new Employee();
        employee1.setEid(102);
        employee1.setName("Jam");
        employee1.setSalary(3400);
        Address address = createAddress();
        employee1.setAddress(address);
        return employee1;
    }

    @Bean(name = "address")
    public Address createAddress() {
        Address address = new Address();
        address.setAddressline1("Shivaji nagar");
        address.setAddressline2("Pune");
        return address;
    }
}
