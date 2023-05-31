package HR30DayChallenge10;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * @author JR
 */
public class SolutionDay10BinaryOneCount {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int max = 1;
        String bin = Integer.toBinaryString(n);
        int count = 1;
        for(int i=1;i<bin.length();i++) {
            if(bin.charAt(i)=='1' && bin.charAt(i-1)=='1') {
                    count++;
                    if(count>max)max=count;
                }
            else count=1;
        }
        System.out.println(max);
        scanner.close();
    }
}


//Some other solutions provided by users
/*

Using split method to create an Array from String GOOD!
public static void main(String[] args) {
        int n = scanner.nextInt();
        String bin[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(bin);
        System.out.println(bin[bin.length-1].length());
        scanner.close();
    }

Also using the numeric property of binary numbers to calculate more specifically!
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int counter = 0, max =0;
while (n > 0) {
    counter = ++counter * (n%2);
    max = Math.max(counter, max);
    n/=2;
}
System.out.println(max);

*/