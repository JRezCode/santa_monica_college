<html>
<head>
  <title>Unit 6 Assignment Part 2
  </title>
</head>
<body>
  <p>Here's the LIST of words to try: "alpha","alphabet", "beta","bees","gamma","grand","great","gratitude","delta","door","duck"</p>

  <form action="/action_page.php" autocomplete="false">
    Insert text:<br>
    <input type="text" id="field" autocomplete="off">
    <div id="suggestions" style="cursor: pointer">
    </div>
  </form>

  <script>
  //Initializing field for string array of test values
  var terms = ["alpha","alphabet", "beta","bees","gamma","grand","great","gratitude","delta","door","duck"];

  //Global Field stores wordchoice for autocompletion function
  var wordchoice="";
  
  //Initializing the DOM objects for input and word suggestions
  var text = document.querySelector("input");
  var suggestions = document.getElementById("suggestions");

  //Event listener on input field of HTML with a anonymous function call
  text.addEventListener("input", function() {
    if (text.value.length<1){
      suggestions.innerHTML = "";
    }
    else {
      var s1 = text.value;    //storing typed letters
      for(word in terms)    //searching the word list
      {
        //fancy slicing of string to produce word ending only
        if(terms[word].slice(0,s1.length)==s1){
          var more = terms[word].slice(s1.length);
          break;}
        }
        
        //setting colors for font properties and storing string globally
        var result = s1.fontcolor("black");
        result += more.fontcolor("grey");
        wordchoice = s1+more;       
        
        suggestions.innerHTML = result;

      }  //end search loop
    });

  //Event listener for keystroke looks for TAB to complete input
  text.addEventListener("keydown", function(event) {
    if (event.keyCode == 9) {
      text.value = wordchoice;
      suggestions.innerHTML = "";     //suggestion clears
      event.preventDefault();
    }});

  </script>	
</body>
</html>