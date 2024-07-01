//assignment3part1.js
//Student ID: 1654919
//Name: Reznik, Jonathan
/*
 * Problem: List reversal. 
 * 
 * Comments:  Before attempting on a self-referencing list with multiple
 * objects involved I decide to reverse a list that was of one type strings.
 * 
 * NOTE HAVING DONE THIS IN ANOTHER LANGUAGE I AM FAIRLY CERTAIN IT IS
 * GOING TO BE EASIER TO REVERSE A LINKED LIST IN JAVASCRIPT THEN IN C
 * OR JAVA.  But I could not easily access the later elements and don't
 * currently have enough knowledge with the basic language structure yet
 * to do this.  
 * 
 * Result:  Did not use reverse(), and IS ABLE TO reverse a list of strings
 * integers and USES an array.  The code does fail all tests when objects
 * are stored inside a list as in the 2 test cases provided (failed both).
 * 
	Example Test Case: Fail
	//var test2={ value: "a", next: { value: "b", next: { value: "c", next: null } } };
	//Returns: { total: "abc", value: "c", next: { value: "b", next: { value: "a", next: null } } };
 * 
 */

function reverseList(list) {
	var data = [];
	for (var item in list) {
		data.push(list[list.length-1-item]);
	}
	return data;
}


