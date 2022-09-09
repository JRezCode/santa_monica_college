<!DOCTYPE html>
<html>
<head>
	<title>Job Interview Questionnaire</title>
	<meta charset="utf-8">
</head>
<body>2
<!--HTML Comment Block
//Assuming the template for such a php/sql script is relatively similar to assignment 10A and also to the previous assignments with sticky forms which is where I pulled a lot of the code from.  I tried to take note where appropriate about how time and effort could be saved because of the use of SQL instead of just php code we have been using this entire time.

//The first place that SQL actually saves a lot of extra lines of coding is in validating the input of user data, so there is no need for a php function like validateInput or a variable like errorcount anymore. (Anyway it is consistent with the purpose of the web site which is for a hiring person to record notes about an interview therefore it should really be as helpful as possible in specifying what it is that doesn't work when things aren't recorded properly in that way the purpose for using SQL here is perhaps less critical but more reliable only in the big picture at keeping track of all that data there is created by a system like human resources department in a business, etc., etc.

//On the other hand whatever is given up in terms of exactness by moving over to SQL can always be regained by more object like coding in PHP that can really specify more details such as validating data type for emails (not sure if SQL provides these options)
-->

<?php function displayForm($Department, $Title, $Subject, $Question1, $Question2, $Comments, $Date, $Interviewer) {     
	?> <h2 style= "text-align:center">For Interview</h2>       <!--Still part of function, but moves from PHP to HTML language inside-->
	<form name="interviews" action="interviews.php" method="post">  	
	<!--defining the form within HTML with variable declared later in PHP code block-->
		<p>Date:<input type="text" name="Field1" value="<?php echo $Date; ?>" /></p>   
		<p>Name or Title:<input type="text" name="Field2" value="<?php echo $Interviewer; ?>" /></p>    
		<p>Candidate's Name:<input type="text" name="Field3" value="<?php echo $Subject; ?>" /></p>
		<p>Skill and Knowledge:<br />
			<textarea name="Field4"><?php echo $Question1; ?></textarea></p>     
		<p>Communication ability:<br />
			<textarea name="Field5"><?php echo $Question2; ?></textarea></p>     
		<p>Comments:<br />
			<textarea name="Field6"><?php echo $Comments; ?></textarea></p>     
		<p>Date:<input type="text" name="Field7" value="<?php echo $Date; ?>" /></p>
		<p>Department:<input type="text" name="Field8" value="<?php echo $Department; ?>" /></p>   
			<p><input type="submit" name="Submit" value="Submit" /></p>         
			</form>
			<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		
<?php }	
//Variable declarations...is there a more efficient way to do this?
$ShowForm = TRUE;       
$Department = "";       
$Title = "";            
$Subject = "";          
$Question1 = "";          
$Question2 = "";          
$Question3 = "";			//placeholders for additional questions
$Question4 = "";			//placeholders for additional questions
$Question5 = "";			//placeholders for additional questions
$Comments = "";          
$Date = "";          
$Interviewer = "";
 
if (isset($_POST['Submit'])) {			                                    //isset checks if form has been submitted
	$user="root";
	$password="";
	$host="";

	$DBConnect = mysqli_connect($host, $user, $password);		
		if ($DBConnect === FALSE) {
			echo "<p>Unable to connect to the database server.</p>" . "<p>Error code " . mysqli_errno() . " " . mysqli_error() . "</p>";
		} else {
			$DBName = "interviews";
								if (!mysqli_select_db($DBConnect, $DBName)) {
						$SQLstring = "CREATE DATABASE $DBName";
						$QueryResult = mysqli_query($DBConnect, $SQLstring);
						//checked for existence of a database and if none there it created it for us
/*						if ($QueryResult === FALSE) {
							echo "<p>Unable to execute the query.</p>" . "<p>Error Code::" . mysqli_errno($DBConnect) . " " . mysqli_error($DBConnect) . "</p>";
						} else {
							echo "<p>You are the first visitor!</p>";
						} */
					}

		mysqli_select_db($DBConnect, $DBName);
			$TableName = "jobcandidates";
			$SQLstring = "SHOW TABLES LIKE '$TableName'";			//SQL command LIKE is a similar function to WHERE condition
			$QueryResult = mysqli_query($DBConnect, $SQLstring);
		if (mysqli_num_rows($QueryResult) == 0) {
			$SQLstring = "CREATE TABLE $TableName (countID SMALLINT NOT NULL AUTO_INCREMENT PRIMARY KEY, Field1 VARCHAR(10), Field2 VARCHAR(20), Field3 VARCHAR(30), Field4 VARCHAR(1000), Field5 VARCHAR(100), Field6 VARCHAR(1000), Field7 VARCHAR(1000), Field8 VARCHAR(1000))";		//We need to create a table somehow this seems like an appropriate way to check and create at the same time if 1 doesn't already exist with these parameters...alternatively if we know there is a database in existence it would save quite a bit by just updating that data from the script, however given the use of the web html form and php it may be best to maintain this sort of conditional structure that does not fail in most situations if at all possible
			$QueryResult = mysqli_query($DBConnect, $SQLstring);
					if($QueryResult === FALSE) {
						echo "<p>Unable to create the table.<?p>" . "<p>Error code " . mysqli_errno($DBConnect) . ": " . mysqli_error($DBConnect) . "</p>";
					}
					}
		 else {
		$Date = stripslashes($_POST['Field1']);
		$Title = stripslashes($_POST['Field2']);
		$Subject = stripslashes($_POST['Field3']);
		$Question1 = stripslashes($_POST['Field4']);
		$Question2 = stripslashes($_POST['Field5']);
		$Comments = stripslashes($_POST['Field6']);
		$Department = stripslashes($_POST['Field7']);
		$Interviewer = stripslashes($_POST['Field8']);
		
		$SQLstring = "INSERT INTO $TableName VALUES(NULL, '$Department', '$Title', '$Subject', '$Question1','$Question2','$Comments', '$Date', '$Interviewer')";
		$QueryResult = mysqli_query($DBConnect, $SQLstring);
		 }
	//Finally provide the user with a response that is either an error code message or else a thank you message.
			if ($QueryResult === FALSE) {
				echo "<p>Unable to input that info into the database </p>" . "<p>Error code " . mysqli_errno($DBConnect) . ": " . mysqli_error($DBConnect) . "</p>";
			} else {
					if (!mysqli_select_db($DBConnect, $DBName)) echo "<p>There are no entries in the guest book!</p>";
			}
		$SQLstring = "SELECT * FROM $TableName";
		$QueryResult = mysqli_query($DBConnect, $SQLstring);
		if (mysqli_num_rows($QueryResult) == 0) echo "<p>There are no entries in the database of candidates</p>";
		else { ?>
		
		<?php
		echo "<table width='100%' border='1'>";
			echo "<tr><th>Date</th><th>Title</th><th>Candidate's name</th><th>Skills/Knowledge</th><th>Communication</th><th>Interviewer's Comments</th><th>Department</th><th>Interview performed by</th></tr>";
			while ($Row = mysqli_fetch_array($QueryResult)) {	
			//while loop with variable 
				echo "<tr><td>($Row[Field1])</td>";
				//echo array item for the first name in the first column
				echo "<td>($Row[Field2])</td>";
				echo "<td>($Row[Field3])</td>";
				echo "<td>($Row[Field4])</td>";
				echo "<td>($Row[Field5])</td>";
				echo "<td>($Row[Field6])</td>";
				echo "<td>($Row[Field7])</td>";
				echo "<td>($Row[Field8])</td></tr>";		//echo array for the second column last name now
			}
		}
			mysqli_free_result($QueryResult);
	}
	mysqli_close($DBConnect);
}
//no error checking just cut straight to the chase and gather info if it fails it fails
        displayForm($Department, $Title, $Subject, $Question1, $Question2, $Question3, $Comments, $Date, $Interviewer);
?>
<h4 style="text-align:center">Candidate Database Entries</h4>

</body>
</html>