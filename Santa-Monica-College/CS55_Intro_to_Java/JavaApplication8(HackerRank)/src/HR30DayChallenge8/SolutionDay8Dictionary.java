package HR30DayChallenge8;
import java.util.*;
import java.io.*;

/**
 *
 * @author JR
 */
//Complete this code or write your own from scratch

public class SolutionDay8Dictionary{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myPhonebook;
        myPhonebook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            myPhonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(myPhonebook.containsKey(s)) {
                System.out.println(s+"="+myPhonebook.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

