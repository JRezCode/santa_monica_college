/**
 *
 * @author dehkhoda_abbas
 */
public class GeometricShapeArray {


    /**
	This code makes use of the override see bottom of code
	*/
    public static void main(String[] args) 
    {
        // TODO code application logic here
        MyRect [] aR = new MyRect[100];
        for(int i = 0; i < aR.length; i++)
        {
            
           // aR[i] = new MyRect(10,20)
        }
        MyPoint p1 = new MyPoint(30,60);
        /*
        p1.setXPos(10);
       */ 
        MyRect r1 = new MyRect(50,100);
        System.out.println(r1);
        r1.setOrigin(50,50);
        p1.setXPos(300);
        System.out.println(r1);
        
     /*  
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
   
   @Override
   public String toString()
   {
       
      return "Point["+xPos+","+yPos+"]";
   }
   
}

class MyRect 
{
    private int width;
    private int height;
    private MyPoint origin;
    
    
    public MyRect(int width, int height)
    {
        this.width = width; this.height = height;
        origin = new MyPoint();
        
    }
    
    
    public void setWidth(int w)
    {
        width = w;
    }
    public int getWidth()
    {
        return width;
    }
    public void setHeight(int h)
    {
        height = h;
    }
    public int getHeight()
    {
        return height;
    }
    
    public int getArea()
    {
        return width * height;
    }
    public void setOrigin(int x, int y)
    {
        origin.setXPos(x);origin.setYPos(y);
    }
    
    @Override
    public String toString()
    {
        return "I am Rectangle\nWidth:"+width+
                "\nHeight:"+height+"\nArea:"+getArea()+
                "\nOrigin:"+"Point["+origin.getXPos()+","+origin.getYPos()+"]";
    }
    
    
}