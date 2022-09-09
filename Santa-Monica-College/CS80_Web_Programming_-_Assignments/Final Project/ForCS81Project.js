<html>

			function displaymessage(arg){
					message = document.createElement("div");
					message.setAttribute("class","important");
					message.innerHTML=arg;
					return message;
			}

			var clickCount=-2;
			//function to randomize the redrawing of a flexbox container into the "drop" zone.
			function loadNext() {
				clickCount++;
				if(clickCount<5){
					c.setAttribute("id","select");
					document.getElementsByTagName("img")[clickCount].setAttribute("style","display: none");
				}
				else if(clickCount==5){
					window.alert("You've loaded the last project");
					var instr = document.getElementById("instructions");
				 	instr.parentNode.remove()
					a = displaymessage("Click the button once more to remove the remaining elements")
					document.getElementById("messages").appendChild(a);
				 }
				else if(clickCount==6){
				 	document.getElementById("rendering").remove();
				 	document.getElementById("messages").remove();
				}
			}

					a = displaymessage("Click the button once more to remove the remaining elements")
					document.getElementById("messages").appendChild(a);

				function createTable(){
					var table = document.createElement("table");
					var rowcount = window.prompt("How man rows in your table?");
					var colcount = window.prompt("How many columns in your table?");
					for(var i = 0; i < rowcount; i++){
						var tr = document.createElement("tr");
						for(var j = 0; j< colcount; j++){
							var td = document.createElement("td");
							td.appendChild(document.createTextNode("Hello"));
							tr.appendChild(td);
						}
						table.appendChild(tr);
					}
					document.body.appendChild(table);
				}

			window.addEventListener("load",start,false)
<body>
</body>
</html>