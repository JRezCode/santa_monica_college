/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JR
 */
public class CountOfEven {
    public static void main(String[] args){
        int newArray[] = {1,2,3,4,5,6,7,8,9,10};
        int even = 0;
        for(int i=0;i< newArray.length; i++){
            if(newArray[i] % 2 == 0) {
                even++;
            }            
    }
        System.out.println("There are " + even + " evens in the list.");
    }
}

