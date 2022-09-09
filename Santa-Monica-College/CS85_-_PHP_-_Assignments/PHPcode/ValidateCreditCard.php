<!DOCTYPE html>

<html>

<head>

<title>Validate Credit Card</title>

</head>

<body>
<h1>Validate Credit Card</h1><hr />
 <?php

$CreditCard = array( "", "8910-1234-5678-6543", "OOOO-9123-4567-0123");
$ValidatedCardCount=0;
$CardCount= count($CreditCard);
 foreach ($CreditCard as $CardNumber) {
	if (empty($CardNumber)) {   //checking for empty fields in array
		echo "<p>At least one item is empty in the list of card numbers.</p>"; 
}
	else {		//validating the credit card
		$ValidatedCardNumber=str_replace("-","",$CardNumber);
		if (is_numeric($ValidatedCardNumber)) {
			echo "<p>$CardNumber <strong>is valid</strong>.  (Card Digits: $ValidatedCardNumber.)</p>";
				$ValidatedCardCount++;
				}
		else {
			echo "<p>$CardNumber isn't valid due to presence of non-numeric characters.  (Further examination is needed to determine which characters are incorrect.)</p>";
		}
	}
}
	echo "<p>Summarizing the results of input from users, the number of valid credit cards was $ValidatedCardCount, from a total count of $CardCount credit cards.</p>";
 
 ?>

</body>

</html>