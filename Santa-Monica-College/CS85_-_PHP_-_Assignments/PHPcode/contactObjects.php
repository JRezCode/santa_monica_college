<?php

//Explain class BaseContact: Baseontact is an abstract entity or class that associates names with the methods of functions and variable declarations for later calling. (Boom!)
abstract class BaseContact
{
    abstract public function get_name();
    abstract public function set_name($name);
    public $phone_number;
//The $this->function() is a way calling a method and used to prepare for later function calls via these methods.  (Ithinkso)
    public function __toString()
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

//What is an extends class ?  The extends class is a way of further specifying the differences among a class that has already been defined...as PersonContact is a specific type of BaseContact
class PersonContact extends BaseContact
{
    public $first_name;
    public $last_name;
    //As in previous uses the public keyword added allows for interaction with other classes and objects
    public function __construct($first_name = null, $last_name = null)
    {
        $this->first_name = $first_name;
        $this->last_name = $last_name;
    }

    public function get_name()
    {
        return $this->first_name . " " . $this->last_name;
    }
//A short routine is run to check and update the name appropriately
    public function set_name($name)
    {
        $split_name = explode(" ", $name, 2);
        $length = count($split_name);
        $rv = true;
        if ($length === 0) {
            $rv = false;
        } elseif ($length === 1) {
            $this->first_name = $this->last_name = $split_name[0];
        } else {
            $this->first_name = $split_name[0];
            $this->last_name = $split_name[1];
        }
        return $rv;
    }
}

//What does the get and set methods do?
// These keep the values of some particular object or class separate from the global properties so as not to confuse
//What is the __construct() for?
//  It is used to build an object in PHP language, right??

class OrganizationContact extends BaseContact
{
    public $name;
//The function changes the property of variable name according to method for name input and stores it in the $name variable (temporarily i guess maybe IDK)
    public function __construct($name = null)
    {
        $this->name = $name;
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
$angelo = new PersonContact();                  //The use of php keyword new is how it gets allocated/applied at the time
$angelo->set_name("Angelo Roncalli");   //after creating the object the name is set using our methods
$angelo->phone_number = "777-777-7771";     //phone number is also a method
?>
<p><?php print $angelo ?></p>
<strong>Person Contact, empty constructor, three names</strong>
<br />
<?php
$john = new PersonContact();
$john->set_name("John Giuseppe roncalli");
$john->phone_number = "777-777-7777"
?>
<p><?php print $john ?></p>
<strong>Person Contact, Parameterized Constructor</strong>
<br />
<?php
$mary = new PersonContact("Mary", "Roncalli");
$mary->phone_number = "777-123-4567";
?>
<p><?php print $mary ?></p>
<strong> Organization Contact, Empty Constructor</strong>
<?php
$parish = new OrganizationContact();
$parish->set_name("Parish");
$parish->phone_number = "777-777-7777";
?>
<p><?php print $parish ?></p>
<strong> Organization Contact, Parameterized Constructor</strong>
<br />
<?php
$parish = new PersonContact("Parish");
$parish->phone_number = "777-777-1234";
?>
<p><?php print $parish ?></p>
</body>
</html>