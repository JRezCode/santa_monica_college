import java.util.Random;

//Math random testing
public class JavaRandom{
    
    public static void main(String[] args){
        for (int i =0 ; i<10000; i++) {
    		System.out.println(randInt(9,11));
    	}
    	System.exit(0);

        }
    public static int randInt(int min, int max) {
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min)+1)+min;
    return(randomNum);
    }
}
