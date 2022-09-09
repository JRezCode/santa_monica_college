<?php

if(!isset($_COOKIE['viewCount']))
{
$cookie_value = 1;
setcookie("viewCount", $cookie_value);
echo "Number of Views: " . $_COOKIE['viewCount'] . " times.";
}
else
{
$cookie_value = ++$_COOKIE['viewCount'];
if($cookie_value === 5)
{
echo "This is the 5th time!!!!";
}
elseif($cookie_value === 10)
{
echo "THIS IS THE 10TH TIME!!!!!";
}
elseif($cookie_value === 15)
{
echo "THIS IS THE 15TH TIME!!!";
}
elseif($cookie_value >= 19)
{
$cookie_value = 0;
setcookie("viewCount", $cookie_value);
}

setcookie("viewCount", $cookie_value);

echo "Number of Views: " . $_COOKIE['viewCount'] . " times.";
} 
?>