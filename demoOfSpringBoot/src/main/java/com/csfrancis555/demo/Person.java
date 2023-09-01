
package com.csfrancis555.demo;


public class Person {
    private String name;
    private int age;
    private String town;

    public Person() {
    }

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "a people object";
    }
    
    
    
    
}
