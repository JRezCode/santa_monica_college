/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_Class_by_week.Week9to10;

/**
 *
 * @author JR
 */
public class AbstractClass {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {                
        APerson p1 = new APerson("Lisa","Smith","111-11-1111","Lisa@heaven.com",21);
        APerson p2 = new APerson("Jack","Smith",45);
        System.out.println(p2);
    }
}

class APerson
{
    private String fName;
    private String lName;
    private String sSN;
    private String eMail;
    private int age;
    private APerson hw;
    
    
    //A member inside of the class:
    public APerson(String fName, String lN, String s, String e,int a)
    {
      this.fName = fName; lName = lN; sSN = s;
      eMail = e; setAge(a);
    }
    public APerson(String fN, String lN, int a)
    {
        this(fN,lN,null,null,a);
    }
    
    public void setFName(String fN)
    {
        fName = fN;
    }
    public String getFName()
    {
        return fName;
    }
    public void setLName(String fN)
    {
        lName = fN;
    }
    public String getLName()
    {
        return lName;
    }
    public void setSSN(String fN)
    {
        sSN = fN;
    }
    public String getSSN()
    {
        return sSN;
    }
    
    public boolean isMarried()
    {
     return hw != null;   
    }
    
    
    
    
    public int getAge()
    {
        return age;
    }
    public void setAge(int a)
    {
        if (a >= 0)
            age = a;
    }
    public String toString()
    {
        return "First Name:"+fName+"\n"
              +"Last  Name:"+lName+"\n"
              +"SSN:"+sSN+"\n"
              +"Email:"+eMail+"\n"
              +"Age:"+age+"\n"
              +"Marital status: " + (isMarried() ? "Married" : "Avaiable")+"\n"
              +"Spouse First Name: " + ((isMarried() ? hw.getFName() : "Available")+"\n")
                ;
}
    
}   