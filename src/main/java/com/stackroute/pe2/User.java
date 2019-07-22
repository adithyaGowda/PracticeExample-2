package com.stackroute.pe2;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if(age >0 && age <100)
            this.age = age;
        else
            System.out.println("invalid age");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String isValidAge(int age){

        if (age > 18 && age < 60)
            return "within range";
        else
            return "not in range";
    }

    public String getFulName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        return this.firstName + " " +this.lastName;
    }
}
