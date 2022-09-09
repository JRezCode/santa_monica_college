<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Show Guest Book</title>
</head>
<body>

<?php

$user="root";
$password="";
$host="localhost";		//declares variables for user/pass and host of server

$DBConnect = mysqli_connect($host, $user, $password);
if ($DBConnect === FALSE) echo "<p>Unable to connect to the database server.</p>" . "<p>Error code " . mysqli_errno() . "</p>";
//the if statement evaluates to false for connecting to host with username and password, therefore it echos an error and error code
else {
	$DBName = "guestbook";
	if (!mysqli_select_db($DBConnect, $DBName)) echo "<p>There are no entries in the guest book!</p>";
	//THE IF STATEMENT checks for selected db guestbook by name and if it does not exist then echos a statement about it
	else {
		$TableName = "visitors";
		$SQLstring = "SELECT * FROM $TableName";
		//NOW CONDITIONAL STRUCTURE searches records from  visitors table using MySQL commands
		$QueryResult = mysqli_query($DBConnect, $SQLstring);
		//HERE IS declaring a variable to store  results of the query
		if (mysqli_num_rows($QueryResult) == 0) echo "<p>There are no entries in the guest book!</p>";
		else {
			echo "<p>The following visitors have signed our guest book:</p>";
			echo "<table width='100%' border='1'>";
			echo "<tr><th>First Name</th><th>Last Name</th></tr>";
			//IN HTML two table entries are created for first and last name side by side
			while ($Row = mysqli_fetch_array($QueryResult)) {	
			//while loop with variable 
				echo "<tr><td>($Row[first_name])</td>";
				//echo array item for the first name in the first column
				echo "<td>($Row[last_name])</td></tr>";		//echo array for the second column last name now
			}
		}
		mysqli_free_result($QueryResult);
	}
	mysqli_close($DBConnect);
}

/* Previous assignment in php with no SQL
<h1>Guest Book</h1><hr />
 <h2>Enter your name to sign out guest book</h2>
<form method="POST" action"SignGuestBook.php">

	<p>First Name <input type="text" name="first_name"/></p>
	<p>Last Name <input type="text" name="last_name"/></p>
	<p><input type="submit" value="Submit"/></p>
	
</form>

<p><a href="ShowGuestBook.php">Show Guest Book </a></p>
	*/?>
</body>

</html>