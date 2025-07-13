package assignmentArray2;

public class Student {
    private String name;
    private int age;
    private int gpa;
    public Student(String name, int age, int gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayinfo() {
        System.out.println("assignmentArray2.Student name : " +name);
        System.out.println("assignmentArray2.Student age : " +age);
        System.out.println("assignmentArray2.Student gpa : " +gpa);
    }

    public void study (){
        System.out.println( name + " is studying");
    }


    public void setname (String name ) {
        this.name = name;
    }
    public void setage (int age ) {
        this.age = age;
    }
    public void setgpa (int gpa) {
        this.gpa = gpa;
    }

    public String getname (){
        return name;
    }
    public int getage (){
        return age;
    }
    public int getgpa () {
        return gpa;
    }

}
