<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Music Sorted</title>
</head>
<body>
<h1>Song Organizer</h1>
<?php
	//If statement checks first was the form submitted with action from HTML then if file exists and if size is not 0 it creates a array
if (isset($_GET['action'])) {
	if ((file_exists("SongOrganizer/songs.txt")) && (filesize("SongOrganizer/songs.txt") != 0)) {
		$SongArray=file("SongOrganizer/songs.txt");			//reads songs.txt into the array with each line equal to a new value in the array
	//The following switch statement performs Remove, Sort, or Shuffle of the song list in the array and dependent on HTML form action specified/submitted
	switch ($_GET['action']) {
		case 'Remove Duplicates':
			$SongArray = array_unique($SongArray);	//PHP function to remove duplicates from array...does nothing to the files themselves
			$SongArray = array_values($SongArray);	//Reindexes the new values of the array minus the duplicate songs
			break;
		case 'Sort Ascending':
			sort($songArray);			//PHP sort funtion has many potential sort flags which could produce different results even for the same ascending order
			break;
		case 'Shuffle':
			shuffle($SongArray);		//PHP shuffle function perfect for this case of song shuffling
			break;
	}

	//The next if statement builds a list of the songs in the modified list of songs and then attempts to open the file
	if (count($SongArray) > 0) {
			$NewSongs = implode($SongArray);	//PHP implode builds a list of the songs
			$SongStore= fopen("SongOrganizer/songs.txt", "wb");		//attempts to open the file	
			if ($SongStore === false)
				echo "There was a error updating the song file\n";
			else {
				fwrite($SongStore, $NewSongs);		//Updates file on server
				fclose($SongStore);					//Closes file before exiting control structure
			}	
		} else unlink("SongOrganizer/songs.txt");
		
	}
	
}
//Programs process of adding a song via HTML form
if (isset($_POST['submit'])) {
	$SongToAdd = stripslashes($_POST['SongName']) . "\n";		//Retrieves from HTML form the song name
	$ExistingSongs = array();		//Declare new variable ExistingSongs with empty/null set values to begin
	//Then a conditional structure tests if the song was already previously added or not and if not then it tests an it be done given the correct priveleges or otherwise spits an error
	if (file_exists("SongOrganizer/songs.txt") && filesize("SongOrganizer/songs.txt") > 0) {
		$ExistingSongs = file("SongOrganizer/songs.txt");		//PHP file function fills array with song list existing currently
		if (in_array($SongToAdd, $ExistingSongs)) {
			echo "<p>The song you entered already exists!<br />\n";
			echo "Your song was not added to the list.</p>";
		} else {
			$SongFile = fopen("SongOrganizer/songs.txt", "ab");
			if ($SongFile === false)
				echo "There was an error saving your message!\n";
			else {
				fwrite($SongFile, $SongToAdd);		//Writes the song to the list as additional element within that file
				fclose($SongFile);
				echo "Your song has been added to the list.\n";
			}
		}		//Ends routine for attempt of song add given it doesn't already exist in the list
	
	}
}

//Error checking of different cases such as empty list or no file with if else structure then if all is ok without that stuff it extracts and processes routine on each item in array according to presentation of data back to web client browser??.
if ((!file_exists("SongOrganizer/songs.txt")) || (filesize("SongOrganizer/songs.txt")==0))
	echo "<p>There are no songs in the list.</p>\n";
else {
	$SongArray=file("SongOrganizer/songs.txt");			//Repeated code from earlier same note
	echo "<table border=\"1\" width=\"100%\" style=\"background-color:lightgray\">\n";
	foreach ($SongArray as $Song) {
		echo "<tr>\n";
		echo"<td>" . htmlentities($Song)  . "</td>";
		echo "</tr>\n";
	}
	echo "</table>\n";
}


?>

<p> <a href="SongOrganizer.php?action=Sort%20Ascending">  Sort Song List</a><br />
	<a href="SongOrganizer.php?action=Remove%20Duplicates"> Remove Duplicate Songs</a><br />
	<a href="SongOrganizer.php?action=Shuffle"> Randoize Song List</a><br />
	</p>

<form action="SongOrganizer.php" method="post">
<p> Add a New song</p>
<p>Song Name: <input type="text" name="SongName" /></p>
<p>
		<input type="submit" name="submit" value="Add Song to List" />
		<input type="reset" name="reset" value="Reset Song Name" />
		</p>
		</form>
	
</body>
</html>