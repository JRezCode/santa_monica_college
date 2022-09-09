<!DOCTYPE html>
<html>
<head>

<title>Bowlers Registration</title>

</head>

<body>

 <?php
	if (empty($_POST['bowler_name']) || empty($_POST['bowler_age']) || empty($_POST['score_avg']))
	echo "<p>You must go back and reenter the data in the form.</p>\n";
		else {
			$Name = addslashes($_POST['bowler_name']);
			$Age = addslashes($_POST['bowler_age']);
			$Score = addslashes($_POST['score_avg']);
			$File=fopen("Bowlers.txt", "ab");
			if (is_writeable("Bowlers.txt")) {
				if (fwrite($File, $Name . ", " . $Age . " years of age, and Bowling Average:" . $Score . "\n"))
					echo "<p>Thank you for registering!</p>\n";
				else
					echo "<p>Cannot add information to the data file.</p>";
			}
			else
				echo "<p>Cannot write data to that file .</p>\n";
			fclose($File);
		}
 ?>

</body>

</html>