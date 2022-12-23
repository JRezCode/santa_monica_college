package app;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import ch08.maps.HMap;
import ch08.maps.MapInterface;


public class WordMappingClient {


	public static void main(String[] args) throws IOException {

		final int CAPACITY = 10000; // capacity of collection (dictionary/map)
//	    String fname = "constitution.txt";      // input file of text
	    String fname = "constitution2.txt";      // input file of text with no repeats (true dictionary)
	    String word;                 // current word
	    int numWords = 0;            // total number of words
	    int uniqWords;               // number of unique words
	    double density;              // vocabulary density
	    String[] dictionary_array = new String[5000];
	    
	    MapInterface<String, Object> words = new HMap<String, Object>(CAPACITY, 0.75);
	    
	    // Set up file reading
	    FileReader fin = new FileReader(fname);
	    Scanner wordsIn = new Scanner(fin);
	    wordsIn.useDelimiter("[^a-zA-Z']+");  // regex excluding delimiter (non-alphabet-characters)
	    
	    while (wordsIn.hasNext())      // while more words to process
	    {	    	
	      word = wordsIn.next();
	      word = word.toLowerCase();
	      //check word isn't already present and add it to the map
	      if (!words.contains(word)) {
	        words.put(word, null);			
	        //dictionary_array[numWords]=word;		//used this to print and extract the actual document constitution2.txt
	      }
	      else
	      {
	    	  System.out.println("Found a repeated word..." + numWords + " words into the file named " + fname);
	    	  System.exit(0);
	      }	
	      numWords++;
	    }

	    //This code below was only used to help create the constitution2.txt with no repeats
	    for (String e: dictionary_array) {
	    	if(e!=null)
	    		System.out.print(e+",");
	    }
	    
	    System.out.println();
	    System.out.println("If reached here no words are repeated!!!!");
	    System.out.println("You have read into dictionary " + numWords + " unique entries!");

	    //An alternative way to validate the output at this point is to check
	    if(numWords == words.size())
		    System.out.println("No words are repeated!!!!  " + numWords + " unique entries were made.");	    	
	}
}
