package com.example;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] a = new int[10];
        int[] b = {2,2, 4,5,6,6,6,7,8,9};
        // populate array a using a for loop
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        // print array a using a for each loop
        for (int i : a) {
            System.out.println(i);
        }

        // calculate the median of array a using the function median
        System.out.println(median(a));
        System.out.println(mode(b));

        // create 50 students and add them to the list
        Student[] students = new Student[50];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Student " + i, i);
        }

        // create a student manager and add the students to the list
        StudantManager studentManager = new StudantManager(students);
        studentManager.addStudent(new Student("Student 50", 50));
        
        // print the number of students in the list
        System.out.println("Number of students: " + studentManager.getNumberOfStudents());

        // remove a student from the list
        studentManager.removeStudent(students[0]);

        // print the number of students in the list
        System.out.println("Number of students: " + studentManager.getNumberOfStudents());
    }

    // function to calculate aritimetic median
    public static double median(int[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    // 'mode' is the number that results in the most occurences in the given array
    // loop through the array and count the occurences of each number
    // return the number that results in the most occurences
    public static int mode(int[] arr) {
        int mode = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mode = arr[i];
            }
        }
        return mode;
    }

}
