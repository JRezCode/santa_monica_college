<?php
//This script makes use just one Moviegoers class, and extended classes (PersonContact and OrganizationContact)
//The abstract class is the more generic one and the other extended classes are located later in the script (Boom!)
class Moviegoers
//Creating the class for moviegoers to allow for multiple types, i.e. adults, seniors, kids, etc.
{
private $_age;
public function ageCateg ()
{
	if ($_age>55) {
			$this->_ageCateg=$senior;
	} elseif ($_age>18) {
			$this->_ageCateg=$adult;
	} elseif ($_age>5) {
			$this->_ageCateg=$kid;
	} else {
		$this->_ageCateg=$toddler;
	}
}
public function setTktPrice () 
{	
	$this->_age = $age;
}

//Now instantiate the objects for each of the “types” of ages for the price schedule
$senior = new MovieGoer ();
$adult = new MovieGoer ();
$kid = new MovieGoer ();
$toddler = new MovieGoer ();

$senior->echo “That will be $8 please”
$adult->echo “That will be $10 please”
$kid->echo “That will be $5 please”
$toddler->echo “Toddlers under age 5 are free to enter”


//An ALTERNATIVE DESIGN may need to specify the amount of the ticket price as a variable, especially if the program was going to be used for anything like calculating the bundle of ticket purchases e.g. or else chnging the dicounts offered or allowing discounts to apply to multiple groups etc. However given the instructions of the assignment the purpose I interpreted it to mean was simply separating objects and classes for each of the group and display the movie ticket price...at which point let the group attending the movie figure out how much the total is for what they owe.

//Still a very fun project and should be something that I can put to use too soon I hope.



/*
NOTES:
More helpful examples to try out for the OOP stuff

Objects
<?php
$myPage = new Html;
// Creates an instance of the Html class
$myPage->printLn('This is some text');
// Prints "This is some text&lt;br /&gt;"
?>


INHERITANCE AND EXTENDING CLASSES (probably good for another module/topic)


//CLASS CONSTRUCTOR (IN PHP)...LESSON FOCUS
<?php
class Person
{
private $_name;
private $_age;

function __construct($name, $age = 0)
{
if (!is_int($age))
{
throw new Exception("Cannot assign non integer value to integer field, 'Age'");
}
$this->_age = $age;
$this->_name = $name;
}
}
?>

//CONSTRUCTOR OVERLOADING…..TBD
<?php
class BankAccount{
private $accountNumber;
private $totalBalance;
public function __construct(){
}
public function __construct($accountNo){
$this->accountNumber = $accountNo;
}
public function __construct($accountNo, $initialAmount){
$this->accountNumber = $accountNo;
$this->totalBalance = $initialAmount;
}
}
?>

//ENCAPSULATING…..asking for user input and then validating it...useful for above code
public function setAge($age) {
	if (!is_int($age))
	throw new Exception(“Cannot assign non integer value to integer field, ‘Age’”);
	$this->_age = $age;

}
*/

{
    abstract public function get_name();
    abstract public function set_name($name);
    public $phone_number;				//phone number is a property of a Contact
    public function __toString()		//function acts on inputs to format the results  using conditional loop and different operations
    {
        $s = "" . $this->get_name();    
        if ($this->phone_number) {		
            if (count($s) > 0) {
                $s .= ": ";
            } else {
                $s .= "Someone's Phone Number: ";
            }
            $s .= $this->phone_number;
        }
        return $s;
    }
}
//The class extends BaseContact to persons and organizations
//The construct() function call sets default values for first and last name of this class which can be set then at any time with or without the object operation, using the new keyword.
class PersonContact extends BaseContact		
{
    public $first_name;					
	//public $middle_name;
    public $last_name;					
    public function __construct($first_name = null, $last_name = null)			
    {
        $this->first_name = $first_name;				
        $this->last_name = $last_name;					
    }
    public function get_name()    					//a straightforward simple function that returns first and last name with a space in between
    {
        return $this->first_name . " " . $this->last_name;	
    }
    public function set_name($name)				//this function uses explode() for user input to propery assign name to two separate entities
    {
        $split_name = explode(" ", $name, 3);			//Changed this to 3 in order to shorten the 3 names down to 2 for consistency		
        $length = count($split_name);
        $rv = true;
        if ($length === 0) {
            $rv = false;
        } elseif ($length === 1) {
            $this->first_name = $this->last_name = $split_name[0];			//here is where the array is created for PersonContact class objects
        } else {
            $this->first_name = $split_name[0];	
//            $this->middle_name = $split_name[1];				//I added this line to make the middle name undefined
			$this->last_name = $split_name[1];
        }
        return $rv;
    }
}
//A third class for Organizations that acts similar to the previous extended class but even simpler since no array is created for the name
class OrganizationContact extends BaseContact		
{
    public $name;
    public function __construct($name = null)		
    {
        $this->name = $name;						//every time the $this -> operator is called is when objects automatically call contructor() and object is created with default properties if no other is specified
    }
    public function get_name()						
    {
        return $this->name;
    }
    public function set_name($name)
    {
        $this->name = $name;
    }
}

?>
<!doctype html>
<html>
<head>
    <title>Object Oriented Programming - Simple Class</title>
</head>
<body>
<strong> Person Contact, Empty Constructor, Two Names</strong>
<br />
<?php
$angelo = new PersonContact();                  //Create a new instance of object for Person/organization etc.
$angelo->set_name("Angelo Roncalli");   		//use the set_name method of the correct class in order to create the person/organization
$angelo->phone_number = "777-777-7771";     	//another assignment to that object for property phone number
?>
<p><?php print $angelo ?></p>
<strong>Person Contact, empty constructor, three names</strong>
<br />
<?php
$john = new PersonContact();
$john->set_name("John Giuseppe Roncalli");		//In the case of three names I am not sure why all three names are showing up
$john->phone_number = "777-777-7777"
?>
<p><?php print $john ?></p>
<strong>Person Contact, Parameterized Constructor</strong>
<br />
<?php
$mary = new PersonContact("Mary", "Roncalli");		//Done differently with the name property at time of calling the class for new object instance
$mary->phone_number = "777-123-4567"
?>
<p><?php print $mary ?></p>
<strong> Organization Contact, Empty Constructor</strong>
<?php
$parish = new OrganizationContact();			//Sets up new organization contact
$parish->set_name("Parish");					//name
$parish->phone_number = "777-777-7777";			//number
?>
<p><?php print $parish ?></p>
<strong> Organization Contact, Parameterized Constructor</strong>
<br />
<?php
$parish = new PersonContact("Parish");			//Same as previous but in fewer lines of code because of parameterized constructor???
$parish->phone_number = "777-777-1234";
?>
<p><?php print $parish ?></p>
</body>
</html>