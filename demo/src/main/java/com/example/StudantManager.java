package com.example;
public class StudantManager {

    private  Student[] students = new Student[100];
    
    // Monstructor that takes in a list of students
    public StudantManager(Student[] students) {
        this.students = students;
    }

    // Method that adds a student to the list
    public void addStudent(Student student) {
        if (!studentsIsFUll()){
            Student[] newStudents = new Student[students.length + 1];
            for (int i = 0; i < students.length; i++) {
                newStudents[i] = students[i];
            }
            newStudents[students.length] = student;
            students = newStudents;
        }
    }

    // Method that removes a student from the list
    public void removeStudent(Student student) {
        Student[] newStudents = new Student[students.length - 1];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != student) {
                newStudents[j] = students[i];
                j++;
            }
        }
        students = newStudents;
    }

    // Method that returns the number of students in the list
    public int getNumberOfStudents() {
        return students.length;
    }

    // Method to emit an alert if the list is full
    public boolean studentsIsFUll() {
        if (students.length == 100) {
            System.out.println("The list is full");
            return true;
        }
        return false;
    }


    
}
