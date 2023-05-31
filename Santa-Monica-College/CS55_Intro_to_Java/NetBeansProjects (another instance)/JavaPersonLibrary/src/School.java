import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
public class School {
    public static void main(String[] args) {
        System.out.println("Create a database of people in the school, so that includes Students and Faculty" +
                "which would you like to add?\n(1) Faculty\n(2) Student");
   
        
        //Simulate the addition of 10 New students and 10 New faculty
        Student[] studentArray = new Student[10];
        List<String>years=Arrays.asList("junior","sophomore","freshman","senior");
        for(int i=0;i<10;i++) {
            //Need to generate new student Unique Student Id's within the loop (consider calling a method)
            studentArray[i]=new Student(generateStudentID(),years.get((int) (Math.random()*4)));
        }

        Faculty[] facultyArray = new Faculty[10];
        List<String>departments=Arrays.asList("Mathematics","Computer Science","Business","Physics","English");
        for(int i=0;i<10;i++) {
            //Need to generate new student Unique Student Id's within the loop (consider calling a method)
            facultyArray[i]=new Faculty(generateFacultyID(),departments.get((int) (Math.random()*departments.size())));
        }
        
        System.out.println(studentArray[0]);
        System.out.println(facultyArray[0]);
        System.out.println(studentArray[9]);
        System.out.println(facultyArray[9]);
//        Student study=new Student(111111,"Sophomore");
//        Faculty fac1=new Faculty(1212,"Mathematics");
//        System.out.println(study);        
//        System.out.println(fac1);                
    }
    
    
    public static int generateStudentID() {
        int id = (int)(Math.random()*10000000);
        return id;
    }
    
    public static int generateFacultyID() {
        int id = (int)(Math.random()*10000);
        return id;
    }



}

abstract class Person {
    private String name;
    private String email;
    private java.util.Date dateCreated;
    protected boolean studentStatus;
    protected boolean employeeStatus;
    public String status;
    
    protected Person() {
        this.name = "Joe Smith";
        this.email = "joe.smith@google.yahoo.ebay.com";
        dateCreated=new java.util.Date();
    }
    
    public Person(String firstName, String lastName, String emailAddress) {
    //May need to go back and add the parameters and overloaded constructor
        this.name=firstName + " " +lastName;
        this.email=emailAddress;
    }
    
    
    public void setStatus() {
        if(this.studentStatus==true)
            this.status="Student";
        else if(this.employeeStatus==true)
            this.status="Faculty";
        else
            this.status="none";
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    private java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    @Override
    public String toString() {
        return "\nName: " + name + "\nStatus: " +status+ "\nContact: " +email+"\nDate Added: " +dateCreated;
    }
}

class Student extends Person {
    private int studentID;
    private String studentYear;
    
/*    public Student() {
        super();        
        super.studentStatus=true;
        super.setStatus();
    }
  */  
    public Student(int id, String year) {
        super();
        this.studentID=id;
        this.studentYear=year;
        super.studentStatus=true;
        super.setStatus();
    }
    
    @Override
    public String toString() {
        return "\nStudent id#" + studentID + "\nYear: " + studentYear + super.toString();
    }
}

class Faculty extends Person {
    private int employeeID;
    private String department;
    private int yearsEmployed;
    
/*    public Faculty() {
        super();        
        super.employeeStatus=true;
    }
  */  
    public Faculty(int id, String dept) {
        super();
        this.employeeID=id;
        this.department=dept;
        super.employeeStatus=true;
        super.setStatus();
    }
    
    public void setYearsEmp(int yrs) {
        this.yearsEmployed=yrs;
    }
    
    @Override
    public String toString() {
        return "\nEmployee id#" + employeeID + "\nDepartments: " + department + "\nYears Employed: " + yearsEmployed + super.toString();
    }
}