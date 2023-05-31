
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jon
 */
public class Random_0_1 {
    final double MAX_LENGTH=99.88;
    public Random_0_1(String s) {
        
    }
    public static void main(String[] args) {
        System.out.println("Java is neat".replaceAll("is", "AAA"));
        String text = " abc";
        System.out.println(text.trim());
        StringBuilder strbuf = new StringBuilder(4);
        strbuf.append("12345");
        System.out.println(strbuf.toString());
        System.out.println(strbuf);
        System.out.println(strbuf.toString().charAt(4));
        System.out.println(strbuf.length()-1);
        double d;
        d = (new Double("2.5")).doubleValue();
        Random_0_1 test = new Random_0_1("ABC");
        System.out.println(test);
}
}
/*
    TV myTV = new TV();
    TV myTValt = new TV();
    myTV.setFrequencyOn();    
    myTValt.setFrequencyOn();
}
}

class TV {
    boolean freq;
    public void TV() {        
    }
    public void setFrequencyOn() 
    {
        freq = true;
        System.out.println("Nothings wrong");
    }
    
}



    /*
    int i=0, sum=0;
    while(i<50) {
        if (i % 3 == 0) {
            i++;
            continue;
        }
        sum+=i;
        i++;
        System.out.println(i);
        System.out.println(sum);

    }*/
    //int[][]matrix = new int[5][5];
    //for (int column = 0; column < matrix[4].length; column++) {
    
    
    
    /*
    nPrintln("Welcome to Java!", 5);
}
public static void nPrintln(String message, int n) {
//n = \;
for (int i = 0; i < n; i++)
System.out.println(message);
}
    
    */
        


//public class Random_0_1 {
    
  //  public static void main(String [] args) {

    //}
    //Another standard approach to declaring and assigning on two lines
    //instead of one for the Scanner object with args or call to System.in
    /*   
    java.util.Scanner input;
        input = new java.util.Scanner(System.in);
        //Now a simple test for the character data type and reading characters
        //from a string with charAt() method follows.
        char ch1;
        char ch2;
        String str = "abcde";
	ch1 = str.charAt(0);
	ch2 = str.charAt(1);
    //An example of a string method for startsWith() that also uses
    //the string "Welcome to Java" as a literal for invoking the method
    //in an unusual way
        boolean startsWith = "Welcome to Java".startsWith("We");
        //The output of the various tests up until now
        System.out.print(ch1);
        System.out.println(ch2);
        System.out.println(startsWith);
    //A final fun test that works by setting a new variable to true, and then
    //changing it to false 50% of the time.
        boolean randbool = true;        
        randbool = Math.random()>=0.5;
        //By doing the math random approach as done above there is significant
        //amount of code saved in not having to do an if statement that checks
        //the condition of the boolean and also eliminates the decision altogether
        //from the programs algorithm in use
        
        System.out.println("Your random boolean value is" + randbool);
		
//  This is a simple example of an augmented assignment that performs
// some tricky process of doubling the number and adding one, which also
// possibly saves time instead of using the *= operator and then having to
// use a second line with augmented assignment to do the += 1 portion
//        double a = 6.5;
//        a += a + 1;
//        System.out.println(a);

        System.out.println((int)(76.025175*100)/100);

        System.out.println("Chapter 4:\n");
        //checking format MissingFormatWidthException if replacing with  
        //System.out.printf("%.2f\n%0.3f\n", 1.23456, 2.34);
        System.out.printf("%.2f\n%.3f\n", 1.23456, 2.34);
        //checking format FormatFlagsConversionMisMatchException if replacing with
        //System.out.printf("%08s\n", "Java");
        System.out.printf("%8s\n", "Java");
        System.out.println("Chapter 6:\n");
        //a simplified way of coding a random lower case letter
        char rand = (char)('a' + Math.random()*26);
        System.out.println(rand);
        //for random characters in general remember to make variables of character values
     */
    
/*        System.out.println("))");
//        System.exit((0));
        System.out.println("Results from smallest to largest: " + (0.01+0.02+0.03+0.04+.05+.06));
        System.out.println("Restults from largest to smallest: " + (100000000.0+.000000001));
        
        double sum = 0;
        for (double d = 0; d<5;) {
            d += .4;
            sum += sum + d;
            
        }
        System.out.println(sum);
        }*/
        /*
int count = 0;
while (++count < 10) {
         System.out.println("1");
     }   
     System.out.println("2");
    
    
    for (int i = 0; i < 15; i++) 
    {
    if (i%4 == 1)
        System.out.print(i + "");
}
 */
//}
