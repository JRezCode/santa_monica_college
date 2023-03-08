/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jon
 */
class TuesdayCS55NewClass {
    public static void main(String[] args) {
        // TODO code application logic here
        RandomCharacter r = new RandomCharacter();
        for (int i = 0; i < 120; i++) {
            System.out.print(RandomCharacter.getRandomChar('a','z'));
        //for ((i+1)%50==0)
          //  System.out.println();
            
            }    
        
    }
    
}

class RandomCharacter {
    
    public static char getRandomChar(char ch1, char ch2) {
        return (char)(Math.random()*(ch2-ch1) + ch1);
    }
    
    public static char getRandomLowerCase() {
        return getRandomChar('a','z');
    }

    public static char getRandomUpperCase() {
        return getRandomChar('A','Z');
    }

    public static char getRandomDigit() {
        return getRandomChar('0','9');
    }
}