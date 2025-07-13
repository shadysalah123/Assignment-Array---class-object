package assignmentArray2;

import java.util.Scanner;

public class assignmentArray2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st student name : ");
        String name = sc.nextLine();
        System.out.println("enter the 1st student age : ");
        int age = sc.nextInt();
        System.out.println("enter the 1st student gpa : ");
        int gpa = sc.nextInt();
        System.out.println("enter the 2nd student name : ");
        String name2 = sc.nextLine();
        String name3 = sc.nextLine();
        System.out.println("enter the 2nd student age : ");
        int age2 = sc.nextInt();
        System.out.println("enter the 2nd student gpa : ");
        int gpa2 = sc.nextInt();
        Student student1 = new Student(name,age,gpa);
        Student student2 = new Student(name3,age2,gpa2);

        student1.displayinfo();
        student1.study();
        System.out.println();
        student2.displayinfo();
        student2.study();
    }
}


