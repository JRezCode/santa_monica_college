<!DOCTYPE html>
<html>
<head>
	<title>Even Numbers</title>
	<meta charset="utf-8">
</head>
<body>
<h2>
<?php
	//Statement using while, echo and increment only
$c=1;
while($c<=100) 
{echo $c++ + 1,"<br>";
$c++;}
	/* written again with modulus
while($c<100)
	{if ($c%2==0){
echo $c."<br>";}
$c++;
}
	*/
?>
</h2>
</body>
</html>