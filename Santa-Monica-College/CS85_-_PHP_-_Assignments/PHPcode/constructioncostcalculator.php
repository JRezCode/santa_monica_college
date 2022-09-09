<!DOCTYPE html>
<html>
<head>
	<title>Cost Per Square Foot Area Function</title>
	<meta charset="utf-8">
</head>
<body>
<h2>Total Property Cost Calculator</h2>
<?php
$rlength=20;
$rwidth=4;
$pCost=75;
function rArea($length, $width) {
		$RoomArea=$length*$width;
		return $RoomArea;
}
echo "<h3>A simple Area Calc</h3>";
echo "<strong>A room of length ".$rlength." ft and width ".$rwidth." ft has an area of ".rArea($rlength,$rwidth).".</strong>";
echo "<br />";
echo "<br />";
echo "<br />";    //not sure but maybe there is a way to repeat the same line of code here
echo "A calculation of costs <br />";
function totalCost($length,$width,$ftcost) {
		$RoomCost=$length*$width*$ftcost;
		return $RoomCost;
}
echo "A room of length ".$rlength." ft and width ".$rwidth." ft has area ".rArea($rlength,$rwidth)." and at cost per square foot of \$".$pCost." calculates to a total cost for $".totalCost($rlength,$rwidth,$pCost).".";
?>
</body>
</html>