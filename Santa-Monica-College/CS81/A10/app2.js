var express = require('express');
var app = express();

app.get('/', function(req, res){
	   res.send("Hello world!");
});

app.get('/book', function (req, res) {
    res.send('<html><body><h1>HTML title Book!</h1></body></html>');
});

app.get('/paper', function (req, res) {
    res.set('Content-type', 'application/json');
    res.send({"paper":"this is JSON data about a cd"});
});

app.post('/pen', function (req, res) {
    res.send('Plain text data about pens');
});

app.listen(3000, function() {
	  console.log("listening on port 3000");
}); 
