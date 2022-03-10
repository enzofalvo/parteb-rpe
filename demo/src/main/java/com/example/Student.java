package com.example;
public class  Student {
    
    private String name;
    private int grade;
    
    
    // Create a constructor that takes in a name and a grade
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Create a getter for the name
    public String getName() {
        return name;
    }

    // Create a getter for the grade
    public int getGrade() {
        return grade;
    }

    // Create a setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Create a setter for the grade 
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // Create a toString method that returns the name and grade
    public String toString() {
        return "Name: " + name + " Grade: " + grade;
    }
}
