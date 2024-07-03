//Student ID: 1654919
//Name: Jonathan Reznik
//assignment1.js
 /* 
 Write a function that obscures the words according to the steps outlined and producing the results as follows, with Arguments "the", "the goat", and "I want the money", return statements is "the goat I want the goat goat money the goat".  And with args "the", "chicken", "I want the money" it returns: "chicken I want chicken money chicken"
*/

//Uncomment either test case
Obscure("the", "the goat", "I want the money");
//Obscure("the", "chicken", "I want the money");

function Obscure(sub_key, sub_value, sentence) {
    // your code here
    var obscuredSentence = sentence;
    for(var i = 0; i<2; i++){
    obscuredSentence = obscuredSentence.replace(sub_key, sub_value);}
    obscuredSentence = sub_value + " " + obscuredSentence + " " + sub_value;
    
    return obscuredSentence;
}


