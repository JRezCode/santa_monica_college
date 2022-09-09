<?php
//This script makes use just one Moviegoers class of which multiple types of them exist, i.e. adults, seniors, kids, etc. defined by age
class Moviegoers
{
	private $_age;
	public $_category = array($_age > 55 ? 'senior' : ($age > 18 ? 'adult' : ($_age > 5 ? 'child' : 'toddler')));

/*	public function set_category($age) {
	//	$this->_age=$age;
	if ($age>55) {
		$this->_category = $senior;
		echo "You are qualified for a senior discount that is $8";
	} elseif ($age>18) {
		$this->_category=$adult;
		echo "Your ticket is full price $10";
	} elseif ($age>5) {
		$this->_category=$kids;
		echo "Your ticket is half price that is $5";
	} else {
		$this->_category=$toddler;
		echo "Your admission is free";
	}
/*	public function priceDiscount ($_category)
	{
		$this->_ */
	}
}
?>

<!doctype html>
<html>
<head>
    <title>Object Oriented Programming - Ticket Prices</title>
</head>
<body>
<strong> Adult (full price)</strong>
<br />
<?php
$Adult = new Moviegoers();              
$Adult->set_category($adult);   		
?>
<p><?php print $angelo ?></p>
<strong>Childs ticket Price (half off)</strong>
<br />
<?php
$Kid = new Moviegoers();
$Kid->set_category($kid);		
?>
<p><?php print $john ?></p>
<strong>Toddlers under age 5 (free)</strong>
<br />
<?php
$Toddler = new Moviegoers();		
$Toddler->set_category($toddler)
?>
<p><?php print $mary ?></p>
<strong> Seniors discount ($2 off)</strong>
<?php
$Seniors = new Moviegoers();		
$Seniors->set_category($senior);	
?>
</body>
</html>