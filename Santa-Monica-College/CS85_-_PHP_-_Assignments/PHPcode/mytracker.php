<!DOCTYPE html>
<?php
$views = 0;
setcookie ("viewcount", $views, time() +3600, '/'); ?>

<html>
<head>
<title>Page views</title>
</head>
<body>

 <?php
if (isset($_COOKIE['viewcount'])) {
	foreach($_COOKIE['viewcount'] as $name => $value) {
	    $name = htmlspecialchars($name)

    }
} else {
	echo "Cookie is set!<br>";
	$_COOKIE['viewcount']=$_COOKIE['viewcount']++;
    echo "Value is: " . $_COOKIE['viewcount'];
}
/*	echo "<p>Hello visitor, it appears as though this is the first page hit from your browser</p>";
} else {
	$_COOKIE['viewcount']+;
	echo "Your page viewcount is:" . $_COOKIE['viewcount'];
	switch ($_COOKIE['viewcount']) {
		case 5:
		echo "<p> The counter is at 5 so there will be 15 more attempts allowed until reset (20 total attempts)";
		break;
		case 10:
		echo "<p> The counter is at 10 so there will only be 10 more attempts</p>";
		break;
		case 15:
		echo "<p> The counter is at 15 so there will only be 5 more attempts allowed</p>";
		break;
		case 20:
		echo "<p> Number of views has capped out at 20 attempts</p>";
		$viewcount=0;
		break;
/*echo "<p>The counter is at 5 so there will be 15 more attempts allowed until reset (20 total attempts)";
echo "<p> The counter is at 10 so there will only be 10 more attempts</p>";
echo "<p> The counter is at 15 so there will only be 5 more attempts allowed</p>";
echo "<p> Number of views has capped out at 20 attempts</p>";
echo "<p> Number of views:" . $_SESSION['count'] . ".</p>"; */

 ?>
 <p> To continue, <a href="mytracker.php">Click here</a>.</p>
 
</body>

</html>