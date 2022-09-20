package org.example;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == "") throw new RuntimeException("Name has to have a letter");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) throw new RuntimeException("Number has to be positive");
        this.age = age;
    }
}
