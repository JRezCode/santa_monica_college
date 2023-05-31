/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name - Jonathan Reznik
 * Project - CS55 assignment 2 part 2
 * Project Name - Encode and Decode
 * 
 * 
 * @author jon
 */

import java.util.Scanner;
        
public class SecretMessage {
/* A simple program that encodes and decodes messages.  Each method explained 
*  in-line for parameters and return values.  There is error handling (to some 
*  extent) with final outputted messages as well as with user input.
*  This was a assignment that was more fun than challenging.  Thanks//
*/

//Changes to Project Made:  
	//(1) accomodate uppercase letters, and lower case (without altering the given String
	//(2) work to make the Scanner more efficient
	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  
        Scanner code = new Scanner(System.in);  

        //Do a menu and a while loop to run
        int operatingMode = 0;
        while (operatingMode !=3) {
        System.out.println("Enter 1 to encode, 2 to decode, and 3 to quit");
        operatingMode = input.nextInt();    
        switch (operatingMode) {
            case 1:
                System.out.println("Enter the text to encode: ");

                //Initialized variable for including some facts about the # of characters processed by the method
                int result;                
                result = encodeString(code);
                System.out.println("By the way would you like to know " + result + " characters were encoded");

                break;
            case 2:
                
                System.out.println("Enter the text to decode: ");
                //Error handling to make sure data type is string before decoding
                String decoding = input.nextLine(); 
                decodeString(decoding, code);
                
                break;
            default:
            	//This is used not only to handle option '3' quit but also for exception handling at the initial user input selection                
                System.out.print("I don't know why you do not want me to do encode or decode.  Good bye");
                
                break;
        }
        }
        input.close();
    }

    
    		//Method has no parameters and returns a value for # of characters that it encoded/decoded.
    		//The steps involved are listed in line            
    public static int encodeString(Scanner u) 
    {

    	//1. create scanner object
//    	Scanner encode_input = new Scanner(System.in);  
        String encoding = u.nextLine();
        int spaces=0;

        //2. iterate through each character of string
        for (int i=0; i < encoding.length(); i++)
        {
        	//3. call codeChar method with true flag so it knows to Encode 
        	if(encoding.charAt(i)==' ')
        	{
        		System.out.print(' ');            
        		spaces = spaces +1;
        		}	
        	else {
        		if(encoding.charAt(i)<=90)
        		{ char ch = encoding.toLowerCase().charAt(i);
            	System.out.print(upperConvert(codeChar(ch,true)));        }
        	else {
        		char ch = encoding.charAt(i);        	
            	System.out.print(codeChar(ch,true));
            	}
        		}
        	}
        System.out.println("\n");
  //      encode_input.close();
        return (encoding.length()-spaces);      //5.  returns number of converted characters HOPEFULLY!!!
    }    

    public static char upperConvert(char c) {
    	return ((char)((int)c-32));
    }
    
    public static String decodeString(String args, Scanner u) 
    //Basically a replica of the other method but accepting parameter String args and this method has no (null) return.  
    {
//        Scanner decode_input = new Scanner(System.in);
        String decoding = u.nextLine();
        for (int i=0; i < decoding.length(); i++)
        {
        char ch = decoding.charAt(i);
        if(ch == ' ')
                      System.out.print(' ');
        else {
        System.out.print(codeChar(ch,false));
        }
        }
    //    decode_input.close();
        System.out.println("");             //Following the loop and before exiting and returning insert a line break
        return null;
    }


    //The method accepts parameters for character and boolean flags.  
    //Each character handled from input is converted into another character depending on mode selected in main method.  
    //Boolean Key:   true = Encodes     OR          false = Decodes                
        public static char codeChar(char code,boolean encode_decode) 
        {
        	//1.  Creating the strings to hold the keycode or keys
        String dec_characters = "abcdefghijklmnopqrstuvwxyz"; //decoded or regular alphabetized string
        String enc_characters = "kngcadsxbvfhjtiumylzqropwe"; //encoded or irregular string

        	//2.  An if-else structure checks whether to encode or decode
        if (encode_decode) {
            //2a.  ENCODING PROCESS BEGINS looking at character index and encoding with charAt method based on similar location/index in other string
            int encoded_location = dec_characters.indexOf(code);
            return enc_characters.charAt(encoded_location);        
        }
        else {
            //2b.  DECODING PROCESS BEGINS looking at character index and decoding with charAt method based on location in the alphabetized string
            int decoded_location = enc_characters.indexOf(code);
            return dec_characters.charAt(decoded_location);
        }
        }
    
//Need to create a method to check case of letter and return the 
//Please ignore below this portion was my failed attempt to make another solution involving array of characters
        public static String [] printArray(char[] args)
    {
  /*
 //           arrayCharacter[0] = encodeString().charAt(i);  
//                printArray(arrayCharacter);                */

        System.out.println(args);
        return null;
    }

}
