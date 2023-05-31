/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR30DayChallenge11;
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
public class SolutionDay11ArraysMath {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int SQUAREMATRIXSIZE=4; int s=SQUAREMATRIXSIZE;
        int[][] arr = new int[s][s];
        int[][] result = new int[s-2][s-2];
        for (int i = 0; i < s; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < s; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        int max=-7*s;
        for(int i=0; i<s-2; i++) {
            for(int j=0; j<s-2;j++) {
            result[i][j]=(arr[i+1][j+1]+arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            if(result[i][j] > max)
                max = result[i][j];
                }
            }
        System.out.println(max);
        scanner.close();
    }
}


//Other Solutions Offerred
/*

private static void maximumHourGlassSum(int[][] arr)   {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length-2; i++) {
            for(int j =0; j < arr[i].length-2; j++)   {
                int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
                        +arr[i+1][j+1]
                        +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                list.add(sum);
            }
        }
        System.out.println(list.stream().max(Comparator.comparingInt(Integer::intValue)).get());
    }
*/