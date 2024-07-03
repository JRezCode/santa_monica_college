/**
 * Name - Jonathan Reznik
 * Project - CS55 assignment 2 part 2
 * Project Name - Encode and Decode
 * 
 * Program encodes and decodes messages.
 * Each method is commented to explain parameters and return values.
*/


import java.util.Scanner;
        
public class SecretMessage {
    public static void main(String[] args)
    {
        
        //Take user input for operating mode (enccode/decode/quit)
        int operatingMode = 0;
        Scanner input = new Scanner(System.in);

        while (operatingMode !=3) {

            System.out.println("Enter 1 to encode, 2 to decode, 3 to quit");
            operatingMode = input.nextInt();    

            switch (operatingMode) {
                case 1:
                    System.out.println("Enter the text to encode: ");
                    int result;                
                    result = encodeString();
                    System.out.println(result + " characters were encoded");
                    break;
                case 2:
                    System.out.println("Enter the text to decode: ");
                    String decoding = input.nextLine(); 
                    decodeString(decoding);
                    break;
                default:
                    System.out.println("Invalid entry.  Goodbye");
                    break;
            }
        }
    }

    
    public static int encodeString() { 
    //Method has no parameters and returns a value for # of characters encoded.        
    //Side effect calls codeChar() with encode flag and prints to screen

        Scanner encode_input = new Scanner(System.in);  //new scanner object
        
        String encoding = encode_input.nextLine();      //user data input

        int spaces=0;
        for (int i=0; i < encoding.length(); i++) {
            char ch = encoding.charAt(i); 
            if(ch == ' ') {
                System.out.print(' ');            
                spaces = spaces +1;
            }
            else {
                System.out.print(codeChar(ch,true));   //boolean flag to encode
            }    
        }
        System.out.println("\n");
        return (encoding.length()-spaces);      //return # of converted characters
    }    

    public static void decodeString(String args)     {
    //Method accepts String parameter and no return value.
    //Side effect calls codeChar() with decode flag and prints to screen

        Scanner decode_input = new Scanner(System.in);
        String decoding = decode_input.nextLine();
        
        for (int i=0; i < decoding.length(); i++) {
            char ch = decoding.charAt(i);
            if(ch == ' ')
                System.out.print(' ');
            else
                System.out.print(codeChar(ch,false));
        }
        
        System.out.println();             //insert a line break

    }

    
    public static char codeChar(char code,boolean encode_decode) {
    //The method accepts parameters of a character and boolean.  
    //Boolean Key:   true = Encodes     OR          false = Decodes                
        
        //Create string literals and assign for keycode
        String dec_characters = "abcdefghijklmnopqrstuvwxyz"; //alphabetized
        String enc_characters = "kngcadsxbvfhjtiumylzqropwe"; //encoded

        //Check whether to encode or decode
        if (encode_decode) {
            //look at character index and return encoded charAt in string
            int encoded_location = dec_characters.indexOf(code);
            return enc_characters.charAt(encoded_location);        
        }
        else {
            //look at character index and return decoded charAt in string
            int decoded_location = enc_characters.indexOf(code);
            return dec_characters.charAt(decoded_location);
        }
    }
}
