<!DOCTYPE html>
<html>
<head>
	<title>Assignment Title</title>
	<meta charset="utf-8">
</head>
<body>

<?php
	/*Script is only valid for values between 1 and 25
	Guessed number must be manually changed */
	$guessNum = 9;
	if (($guessNum >=10) && ($guessNum <=25)) {  					//NOTE: could not find way to use || only &&
		echo "<p>Number $guessNum is between 10 and 25</p>";
	}
	elseif ($guessNum <5) {
			echo "<p>Number $guessNum is between 1 and 5</p>";
		}
	else {
			echo "<p>Number $guessNum is between 5 and 10</p>";
	}
?>
</body>
</html>