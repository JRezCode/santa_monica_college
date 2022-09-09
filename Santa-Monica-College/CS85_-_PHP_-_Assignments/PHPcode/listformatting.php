<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Orders for puchase</title>
</head>
<body>
<h1>Price list of commodities</h1><hr />
 <h2>Review the list prior to placing an order</h2>

<?php
$cost = 50;
$product = "Oil";
$listproducts = sprintf("%'.-30s%3.2f",$product,$cost);
echo "$listproducts";

//print "I have" . ($money > 500 ? "" : "n’t") . "enough money.";
/* 
<form method="POST" action="PHPcode/SignGuestBook.php">
	<p>First Name <input type="text" name="first_name"/></p>
	<p>Last Name <input type="text" name="last_name"/></p>
	<p><input type="submit" value="Submit"/></p>	
</form>
<p><a href="PHPcode/ShowGuestBook.php">Show Guest Book </a></p>	
 */
 ?>
 </body>
</html>