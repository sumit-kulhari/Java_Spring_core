package com.bhavana.beans;

public class Address {
    private String Addressline1;
    private String Addressline2;

    @Override
    public String toString() {
        return "Address{" +
                "Addressline1='" + Addressline1 + '\'' +
                ", Addressline2='" + Addressline2 + '\'' +
                '}';
    }

//    Bean lifecycle methods
//    Bean initialization method
    public void init(){
        System.out.println("Bean is going through init.");
    }
//    Bean destroy method
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
    public String getAddressline1() {
        return Addressline1;
    }

    public void setAddressline1(String addressline1) {
        Addressline1 = addressline1;
    }

    public String getAddressline2() {
        return Addressline2;
    }

    public void setAddressline2(String addressline2) {
        Addressline2 = addressline2;
    }

    public Address(String addressline1, String addressline2) {
        Addressline1 = addressline1;
        Addressline2 = addressline2;
    }
}
