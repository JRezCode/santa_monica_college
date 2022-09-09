<!DOCTYPE html>
<html>
<head>
	<title>Jumble Maker</title>
	<meta charset="utf-8">
</head>
<body>
<?php
/*function displayError($fieldName,$errorMsg) {
	echo "$errorMsg";
}*/
function validateWord($data,$fieldName) {
	$data=strtoupper($data);
	$data=str_shuffle($data);
	return $data;
}
$errorCount=0;					
$words=array();    				
$wordnum = 0;					//Initializes wordnum used in output of php to html
//Using superglobal variable to access the entries from HTML input form
$words[] = validateWord($_POST['Word1'], "Word 1");
$words[] = validateWord($_POST['Word2'], "Word 2");
$words[] = validateWord($_POST['Word3'], "Word 3");
$words[] = validateWord($_POST['Word4'], "Word 4"); 
/* removed the following code because couldn't get it to work
if ($errorCount>0)

echo "Please use the \"Back\" button to re-enter the data.<br />\n";

else {
*/
foreach ($words as $word)
echo "Word ".++$wordnum.": $word<br />\n";   //display output format in good html output
//}
?>

</body>
</html>