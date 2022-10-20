/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showarrays;

import java.math.BigInteger;

/**
 *
 * @author dehkhoda_abbas
 */
public class ShowArrays 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        int num=0, total=0;
        BigInteger product = new BigInteger("1");
        
        for(int i = 1; i <=100; i++)
        {
            total+= i;
            product = product.multiply(BigInteger.valueOf(i));
         //   
        }
        System.out.println("Total:"+ total);
         System.out.println("Product:"+ product);
        System.out.println(Integer.MAX_VALUE);
        
        
        
      /*    APerson p1 = new APerson("Lisa","Smith","111-11-1111","Lisa@heaven.com",21);
        APerson p2 = new APerson("Jack","Smith",45);
        System.out.println(p2);
        // TODO code application logic here
     
       MyPoint    [] points = {new MyPoint(3,4),new MyPoint(10,20),new MyPoint(20,60)};
        
       for(int i=0; i < points.length; i++)
           System.out.println(points[i].toString());
        
      MyPoint  x = new MyPoint();
      x.setXPos(20);
      MyPoint y = new MyPoint();
      y.setXPos(200);
      
      System.out.println(x.toString() + " "+y);
*/
    }
    
}

class MyPoint
{
   private int xPos;
   private int yPos;
   
   // constructor
   public MyPoint(int x, int y)
   {
       xPos = x; yPos = y;
   }
   public MyPoint()
   {
       
   }
   public void setXPos(int x)
   {
       this.xPos = x;
   }
   public void setYPos(int x)
   {
       yPos = x;
   }
   public int getXPos()
   {
       return xPos;
   }
   public int getYPos()
   {
       return yPos;
   }
   
   public String toString()
   {
       
      return "Point["+xPos+","+yPos+"]\n";
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











