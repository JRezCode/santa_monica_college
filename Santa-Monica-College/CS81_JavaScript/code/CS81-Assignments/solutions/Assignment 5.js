function make_table(data){
//create table 
var table = document.createElement("table"); 
// create header row 
var headerSource = Object.keys(data[0]); 
var headerRow = document.createElement("tr"); 
for (prop in headerSource)
{ 
var newHeaderCell = document.createElement("th"); 
newHeaderCell.textContent = headerSource[prop]; 
headerRow.appendChild(newHeaderCell); 
} 
table.appendChild(headerRow); 
// add header row to table 
// create rows 
for (row in data)
{ 
var newRow = document.createElement("tr"); 
for (column in data[row]){ 
var newCell = document.createElement("td"); 
if (typeof data[row][column] === "number"){ 
newCell.setAttribute("class","right"); 
// for CSS 
} 
newCell.textContent = data[row][column]; 
newRow.appendChild(newCell); 
// add cell to row 
} 
table.appendChild(newRow); 
// add row to table 
} 
// produce table 
return table; 
} 
document.body.appendChild(make_table(MOUNTAINS));
