package objects;


/*
 * 
 * From in class exercise describing Objects (for APerson class)
 *
 * Review for the following interesting features:
 * 		uses of Constructors and Methods inside the APerson class
 * 		use of private or public in the data fields and methods of APerson class
 * 		How each object is declared in the beginning of main, and the overrided toString method called
 * 		
 */

public class ObjectAPerson {

    public static void main(String[] args) 
    {
	//Show Person object 
	APerson p1 = new APerson("Lisa","Smith","111-11-1111","Lisa@heaven.com",21);
    APerson p2 = new APerson("Jack","Smith",45);
    System.out.println(p2);
    System.out.println();
    System.out.println(p1);
    
    // TODO code application logic here
    }
}

class APerson
{
    private String fName;
    private String lName;
    private String sSN;
    private String eMail;
    private int age;
    
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
              +"Age:"+age+"\n";
    }
    
    
}
