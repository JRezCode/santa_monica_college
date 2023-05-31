package objects;


/**
 *
 * @author dehkhoda_abbas
 */
public class ObjectArray 
{

    /**
     * @param args the command line arguments
     */
    public static void main(    String   [] args) 
    {
        //Declaring multiple objects in an array of objects
        MyPoint [] points = {new MyPoint(3,4),new MyPoint(10,20),new MyPoint(20,60)};        
        for(int i=0; i < points.length; i++)
        	System.out.println("The "+points[i].toString());
        
        //Declaring new objects individually to reference variable, i.e. x or y
        MyPoint      x = new MyPoint();
        x.setYPos(20);
        MyPoint y = new MyPoint();
        y.setXPos(200);        
        System.out.println("First " + x + "Second " + y);

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
       
      return "Point("+xPos+","+yPos+")\t";
   }
   
}










