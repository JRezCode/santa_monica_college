//JavaScript code assignment Unit 4 Objects
//Student: Jonathan Reznik
//ID: 1654919
//Assignment: Homework Unit 4 (week 4)

/*
Description:  I'm explaining the program here because I decided to make some slight
functional change to one of the two animals (Cat).  The Dog behaves exactly as described
in the homework assignment description, which was a fun project overall. I chose to
make the Cat a little differently and hope that I won't lose points for this.  

Issues:  I am still confused too with regards to the general principle of modularity or
how to be structuring the code files itself.  It seems bizarre to me to just jump right into
interface declarations, and then again my assertions and tests are maybe in a global space 
right now and those could also maybe be improved by nesting inside a function to limit the
scope to them.

*/

//Interface for the Pets (part I)
var Pet = {
	eat: function(food) {
		var food_items = food.split(" ");
		var max_food_item="";		//the general case for pets is eat largest
		for (var e in food_items) {
			if(food_items[e].length > max_food_item.length){
				max_food_item=food_items[e];			
			}
		}
		return max_food_item; 		
	},
	speak: function(words) {
		//interface doesn't have to specify any body	since pets all speak differently
		console.log(words);
	}
}

//Create Dog and Cat to implement pet interfaces (part II)
var Dog = Object.create(Pet);
var Cat = Object.create(Pet);

//Pet eat behavior overriding for Cat
Cat.eat = function(food) {
		var food_items = food.split(" ");
		var min_food_item="";		//return variable initialized empty

		for (var e in food_items) {
			if(min_food_item=="" || food_items[e].length < min_food_item.length){
				min_food_item=food_items[e];			
			}
		}
		return min_food_item; 				
}

//Overriding pet speak for dog
Dog.speak = function(words) {
	//The local variable result is initialized with 1 woof
	var result = "woof";	
	//additional woofs are added at each character space, alternate solution could use split()
	for(character in words){
		if(words[character]==" ")
			result+=" woof";
			}
	return result;
}

//Overriding pet speak with Cat (simple formula varies the meow string each time)
Cat.speak = function(words) {
	return "M" + "e".repeat(Math.floor(1+Math.random()*4)) + "o".repeat(1+Math.random()*4) + "w".repeat(1+Math.random()*4);	
}

//Tests asserting Dog and Cat eat and speak (part III)

//assertion helper functions
function assertEqual(expected, actual){
	if(expected !== actual){console.log("Test failed");}
	else {console.log("Test passed.");}
	}

//Assertion for all Pet Speaking
function assertPetTalk(animal, expected, actual){
// with nested structure for tests
	if (animal=="CAT") {
	//For cat the test is based on these rules
		// 1 - starts with capital M and ends with lower case w
		if (actual.substr(0,1)!="M" || actual.substr(-1)!="w")
			console.log("Test failed");		
		// 2 - contains letters e o and w only with no spaces or other characters
		else {
			var inner_chars = actual.slice(1,-1);
			for(c in inner_chars){
				if(inner_chars[c]== "o" || "e" || "w")
					console.log("Test passed.");			
				else
					console.log("Test failed");
							}
							}
							}
							
	// For dog this just calls assertEqual() passing arguments forward
	else if (animal=="DOG"){
		assertEqual(expected, actual);
	}

	//Users of this assertion can know the limits of the test default cases
	else {
		return "Not setup to handle other pets besides cats or dogs.";
	}

}

/*
 * Testing is done below this line
 */

var food_test_item = "aaa b c d cc";
var speak_test_item = "i am pet object that eats and speak";

/*case 1 - asserts that dogs and cats eat correctly according to the rules*/
assertEqual("aaa",Dog.eat(food_test_item));
assertEqual("b",Cat.eat(food_test_item));

/*case 2 - asserts a simple sentence for dog and then a cat*/
assertPetTalk("DOG","woof woof", Dog.speak("hello mister"));
assertPetTalk("CAT","none",Cat.speak("i am the cat"));

/*case 3 - asserts a lengthier string for dog and cat*/
assertPetTalk("DOG","woof woof woof woof woof woof woof woof", Dog.speak(speak_test_item));
assertPetTalk("CAT","a",Cat.speak(speak_test_item));


