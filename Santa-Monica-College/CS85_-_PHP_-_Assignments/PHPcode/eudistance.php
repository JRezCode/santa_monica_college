<!DOCTYPE html>
<html>
<head>

<title>Distance</title>

</head>

<body>

 <?php
$Cities[0]="Berlin";
$Cities[1]="Moscow";
$Cities[2]="Paris";
$Cities[3]="Prague";
$Cities[4]="Rome";
$KMtoMiles=0.62137119;    //found and used a slightly more accurate conversion rate to help final line of code for both kilometers + miles
 $Distances = array(
"Berlin" => array("Berlin" => 0, "Moscow" => 1607.99, "Paris" => 876.96, "Prague" => 280.34, "Rome" => 1181.67),
"Moscow" => array("Berlin" => 1607.99, "Moscow" => 0, "Paris" => 2484.92, "Prague" => 1664.04, "Rome" => 2374.26),
"Paris" => array("Berlin" => 876.96, "Moscow" => 2484.92, "Paris" => 0, "Prague" => 885.38, "Rome" => 1105.76),
"Prague" => array("Berlin" => 280.34, "Moscow" => 1664.04, "Paris" => 885.38, "Prague" => 0, "Rome" => 922),
"Rome" => array("Berlin" => 1181.67, "Moscow" => 2374.26, "Paris" => 1105.76, "Prague" => 922, "Rome" => 0));
if (!in_array($_POST['start_city'],$Cities) || !in_array($_POST['end_city'],$Cities))
{
	echo "No Match found";
	}
else 
{
	echo "Calculating the distance between two cities...";
	echo "<br /> The distance between " . $_POST['start_city'] . " and " . $_POST['end_city'] . " is " . round($Distances[$_POST['start_city']][$_POST['end_city']]*$KMtoMiles,0) . " miles.  (" . round($Distances[$_POST['start_city']][$_POST['end_city']],0) . "km.)";
	echo "<br />";
	echo "<br />";
	echo "The rates for conversion are " . round($KMtoMiles,1). " mi/km, which in reverse is about " . round(1/$KMtoMiles,1) . " kilometers/mile.  All numbers rounded for ease of viewing.";
	echo "<br />";
}


 ?>

</body>

</html>