package Mypackage;

public class Student {
    private String name;
    private int rollNumber;
    private static int totalStudents;

    public Student(String name, int rollNumber) {
        this.name=name;
        this.rollNumber=rollNumber;
        totalStudents++;
    }

    public String getName() 
    {
        return name;
    }

    public int getRollNumber() 
    {
        return rollNumber;
    }

    public void displayDetails() 
    {
        System.out.println("Student name:"+getName());
        System.out.println("Student Rollnumber:"+getRollNumber());
    }

    public static int getTotalStudents() 
    {
        return totalStudents;
    }

    public static void main(String[] args) 
    {
        Student s1=new Student("Ravi",101);
        Student s2=new Student("Alex",105);
        s1.displayDetails();
        s2.displayDetails();
        System.out.println("Total students:"+getTotalStudents());
    }
}
