
// import packages we need to run the express app
var express = require('express');
var app = express();
var bodyParser = require("body-parser");
 
// adding a body parser to handle JSON and url encoded form data for us automagically
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
 
// our in-memory fake data store is just an array of javascript objects
var books = [
    { "author": "me", "title": "BookA", "pages": 600, "quality": "new" },
    { "author": "you", "title": "BookB", "pages": 400, "quality": "used" },
    { "author": "us", "title": "BookC", "pages": 500, "quality": "old" },
];
 
// request handler to search based on two fields: author and title
app.get('/book', function (req, res) {
    // get the query params
    var title = req.query.title;
 
    // initialize the return data
    var data;
 
    // search for the book
    for (var i = 0; i < books.length; i++) {
        if (books[i].title == title) {
            data = books[i];
            break;
        }
    }
 
    // pass JSON back to client
    res.set('Content-type', 'application/json');
    res.status(200);
    res.send({"book": data});
});
 
// post handler to add a book to the hardcoded list
// this is definitely not the correct model for storing data
// this is simply an example
app.post('/book', function (req, res) {
    // access the request POST body from the request object
    var data = req.body.data;
 
    // add the new book to the data store and return it
    var book = {
        "author": req.body.author,
        "title": req.body.title,
        "pages": req.body.pages,
        "quality": req.body.quality,
    }
 
    // add the book to the hardcoded list of books
    books.push(book);
 
    // return JSON list of books
    res.set('Content-type', 'application/json');
    res.status(201);
    res.send({"books": books});
});
 
// listen for HTTP requests on port 3000
app.listen(3000, function() {
    console.log("listening on port 3000");
});
