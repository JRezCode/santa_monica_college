<!DOCTYPE html>

<html>

<head>

<title>Compare Strings</title>

</head>

<body>

<h1>Compare Strings</h1><hr />

<?php 

$firstString = "";
$secondString = "Geezer2Geek";
if (!empty($firstString) && !empty($secondString)) {
	if (strcmp($firstString,$secondString)==0) {
		sameVar($firstString,$secondString);
	}
	else {
		diffVar($firstString,$secondString);
	}}
	else { 
		echo "<p>Either the \$firstString variable or the \$secondString variable does not contain a value so the two strings cannot be compared. </p>";
}
//* Create functions here for compare
function sameVar($var1, $var2) {
	echo "matches";
}
function diffVar($var1, $var2) {
	echo "doesn't match";
}
//*/


?>

</body>

</html>