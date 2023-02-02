package com.bhavana.resources;

import com.bhavana.beans.Address;
import com.bhavana.beans.Employee;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public Employee createEmployee(){
        Employee employee = new Employee();
        employee.setEid(101);
        employee.setName("Jam");
        employee.setSalary(5700);
        Address address = createAddress();
        employee.setAddress(address);
        return employee;

    }

    @Bean(name = "address")
    public Address createAddress() {
        Address address = new Address();
        address.setAddressline1("Shivaji nagar");
        address.setAddressline2("Pune");
        return address;
    }
}
