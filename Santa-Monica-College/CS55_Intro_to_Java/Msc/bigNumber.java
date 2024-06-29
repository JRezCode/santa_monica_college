import java.math.BigInteger;

/**
 *
 * @author dehkhoda_abbas
 */
public class bigNumber {

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
        
        
       }
}