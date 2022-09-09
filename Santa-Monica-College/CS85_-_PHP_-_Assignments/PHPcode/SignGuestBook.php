<!DOCTYPE html>
<html>
<head>

<title>Sign Guest Book</title>

</head>

<body>

 <?php
	if (empty($_POST['first_name']) || empty($_POST['last_name']))
	echo "<p>You must enter your first and last name. Click your browser's Back button to return to the Guest Book.</p>\n";		//can't get this mesage to display
		else {
			$user="root";
			$password="";
			$host="localhost";		
			//login information for SQL server	for the next step which is to attempt connecting to it
			$DBConnect = mysqli_connect($host, $user, $password);		
			if ($DBConnect === FALSE) {
				echo "<p>Unable to connect to the database server.</p>" . "<p>Error code " . mysqli_errno() . " " . mysqli_error() . "</p>";
			} else {
					$DBName = "guestbook";			
					//tells server which database to locate
					if (!mysqli_select_db($DBConnect, $DBName)) {
						$SQLstring = "CREATE DATABASE $DBName";
						$QueryResult = mysqli_query($DBConnect, $SQLstring);
						//checked for existence of a database and if none there it created it for us
						if ($QueryResult === FALSE) {
							echo "<p>Unable to execute the query.</p>" . "<p>Error Code::" . mysqli_errno($DBConnect) . " " . mysqli_error($DBConnect) . "</p>";
						} else {
							echo "<p>You are the first visitor!</p>";
						}
					}
					mysqli_select_db($DBConnect, $DBName);
					//Next going to operate on tables with name 'visitors' that are for names signed into the guestbook					
					$TableName = "visitors";
					$SQLstring = "SHOW TABLES LIKE '$TableName'";			//SQL command LIKE is a similar function to WHERE condition
					$QueryResult = mysqli_query($DBConnect, $SQLstring);
					if (mysqli_num_rows($QueryResult) == 0) {
						$SQLstring = "CREATE TABLE $TableName (countID SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY, last_name VARCHAR(40), first_name VARCHAR(40))";		//Checks then if need be it creates table with specified parameters that is
					$QueryResult = mysqli_query($DBConnect, $SQLstring);		//Next it does some sort of querying of the fields based on earlier
					if($QueryResult === FALSE) {
						echo "<p>Unable to create the table.<?p>" . "<p>Error code " . mysqli_errno($DBConnect) . ": " . mysqli_error($DBConnect) . "</p>";
					}
					}
			//Formats form data collected in the guestbook dot html file in next two lines
			$LastName = stripslashes($_POST['last_name']);
			$FirstName = stripslashes($_POST['first_name']);
			//Now create the entries in the table called visitors and query the database for the appropriate field
			$SQLstring = "INSERT INTO $TableName VALUES(NULL, '$LastName', '$FirstName')";
			$QueryResult = mysqli_query($DBConnect, $SQLstring);
			//Finally provide the user with a response that is either an error code message or else a thank you message.
			if ($QueryResult === FALSE) {
				echo "<p>Unable to execute the query </p>" . "<p>Error code " . mysqli_errno($DBConnect) . ": " . mysqli_error($DBConnect) . "</p>";
			} else {
				echo "<h1>Thank you for signing out guest book!</h1>";
			}
			mysqli_close($DBConnect);		//disconnects from the server....I believe, or maybe just closes the database either the way it's done.
				}
			}
			
/* Previously turned in assignment using no SQL			$GuestBook=fopen("guestbook.txt", "ab");
			if (is_writeable("guestbook.txt")) {
				if (fwrite($GuestBook, $LastName . ", " . $FirstName . "\n"))
					echo "<p>Thank you for signing our guest book!</p>\n";
				else
					echo "<p>Cannot add your name to the guest.</p>";
			}
			else
				echo "<p>Cannot write to that file .</p>\n";
			fclose($GuestBook); */
 ?>

</body>

</html>