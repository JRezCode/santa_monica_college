<?php
//This script makes use of three seperate classes an abstract BaseContact class, and extended classes (PersonContact and OrganizationContact)
//The abstract class is the more generic one and the other extended classes are located later in the script (Boom!)
abstract class BaseContact
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