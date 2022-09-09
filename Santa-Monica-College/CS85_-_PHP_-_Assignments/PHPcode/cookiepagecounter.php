<!DOCTYPE html>
<html>
<head>
<title>Page counter using session/cookie</title>
</head>
<body>

<?php
if(!isset($_COOKIE['viewcount'])) {
	setcookie ("viewcount", $views_cookie/*, time() +3600, '/'*/);
	echo "First page hit";
    }
    else {
		$views_cookie=++$_COOKIE['viewcount'];
        switch ($views_cookie) {
            case 5:
                echo "This is the 5th view";
                break;
            case 10:
                echo "This is the 10th view";
                break;
            case 15:
                echo "This is the 15th view";
                break;
            case 20:
                echo "This was the 20th view, counter will reset now";
                $views_cookie=0;
                break;
            default:
                echo "Keep reloading page";
                break;
        }

/*session_start();
if( empty($_SESSION['count'])) {
	$_SESSION['count'] = 1;
	$time="for the FIRST TIME";
} else {
	$_SESSION['count']++;
	$time="before";
switch ($_SESSION['count']) {
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
$_SESSION['count']=0;
break;
default:
echo "<p>Hello visitor, it appears as though from the page hits that you have seen this page" . $time . ".</p>";
echo "<p> Number of views:" . $_SESSION['count'] . ".</p>";
break;
} */
}
 ?>
 <p> To continue, <a href="cookiepagecounter.php">Click here</a>.</p>
 
</body>

</html>