<!DOCTYPE html>
<html>
<head>
	<title>Contact Me</title>
	<meta charset="utf-8">
</head>
<body>
<?php
function validateInput($data, $fieldName) {
	global $errorCount;
	//now run loop for data validation
	if (empty($data)) {
		echo "\"$fieldName\" is a required field.<br />\n";
		++$errorCount; 			//adds global variable count of errors
		$retval = "";			//a local variable declaration which is empty in case of error
	}
	else {
	$retval = trim($data);      //begins data clean by removing whitespace plus declare variable
	$retval = stripslashes($retval);    //removes quotes in a quoted input string
	}
	//now "return" statement finishing function definition
return($retval); }
    //New function for similar validating but only of email addresses
function validateEmail($data,$fieldName) {
	global $errorCount;				//using global variable combines error count in multiple functions
	if (empty($data)) {
		echo "\"$fieldName\" is a required field.<br />\n";
		++$errorCount; $retval="";
}
	else {
		$retval = filter_var($data, FILTER_SANITIZE_EMAIL);		//sanitize filter for email
		if (!filter_var($retval, FILTER_VALIDATE_EMAIL)) {		//nested if statement checks or validates data for email addresses
			echo "\"$fieldName\" is not a valid e-mail address.<br />\n";
		}
	}
	//another return statement finishing the second function definition
return($retval);
}
function displayForm($Sender, $Email, $Subject, $Message) {     //sticky form function for HTML and php hybrid design form
	?> <h2 style= "text-align:center">Contact Me</h2>       <!--Still part of function, now HTML code block-->
	<form name="contact" action="ContactForm.php" method="post">  <!--sets up the form in html-->
		<p>Your Name:
			<input type="text" name="Sender" value="<?php echo $Sender; ?>" /></p>   <!--inline php statements-->
			<p>Your E-mail:
			<input type="text" name="Email" value="<?php echo $Email; ?>" /></p>    <!--more input with inline php statements-->
			<p>Subject:
				<input type="text" name="Subject" value="<?php echo $Subject; ?>" /></p>
			<p>Message:<br />
				<textarea name="Message"><?php echo $Message; ?></textarea></p>     <!--Message even is entered with inline php code-->
			<p><input type="reset" value="Clear Form" />&nbsp; &nbsp;
				<input type="submit" name="Submit" value="Send Form" /></p>         <!--these last two lines for basic HTML form buttons-->
		</form>
<?php }		//function ends with new php block
$ShowForm = TRUE;       //variable declared
$errorCount = 0;        //variable declared
$Sender = "";           //variable declared
$Email = "";            //variable declared
$Subject = "";          //variable declared
$Message = "";          //variable declared
if (isset($_POST['Submit'])) {			                                    //isset used to check variables are already programmed
	$Sender = validateInput($_POST['Sender'],"Your Name");        //input validation function call
	$Email = validateEmail($_POST['Email'],"Your E-mail");		//email function validation
	$Subject = validateInput($_POST['Subject'],"Subject");        //input validation function call
	$Message = validateInput($_POST['Message'],"Message");        //input validation function call
	if($errorCount==0)
		$ShowForm=FALSE;
	else
		$ShowForm=TRUE;
}
if ($ShowForm == TRUE){
    if($errorCount>0)                          //error checking
        echo "<p>Please re-enter the form information below.</p>\n";
        displayForm($Sender, $Email, $Subject, $Message);
}
else {
    $SenderAddress = "$Sender <$Email>";
    $Headers = "From: $SenderAddress\nCC: $SenderAddress\n";
    $result=mail("recipient@example.com", $Subject, $Message, $Headers);
    if ($result)
        echo "<p>Your message has been sent. Thank you, " . $Sender . ".</p>\n";
    else
        echo "<p>There was an error sending you message, " . $Sender . ".</p>\n";
}
?>
</body>
</html>