<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        body{
            background-color: gray;
        }
    </style>
    <meta charset="UTF-8">
    <title>Books</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous"></head>
<body>
<div class="container">

<nav class="navbar navbar-light bg-light">
<ul class="navbar-nav">
    <li class="nav-item" >
        <a class="nav-link " href="/">Home</a>
    </li>
</ul>
</nav>
    <form action="/addBook" method="post">
        <div class="form-group">
            <label for="authorOfBook">Author</label>
            <input type="text" class="form-control"  name="author" id="authorOfBook"  placeholder="book author">
        </div>
        <div class="form-group">
            <label for="name">Name</label>
            <input type="text" class="form-control" name="name" id="name" placeholder="book name">
        </div>
        <div class="form-group">
            <label for="price">Price</label>
            <input type="text" class="form-control" name="price" id="price" placeholder="book price">
        </div>

        <button type="submit" class="btn btn-primary">Add book</button>
    </form>
</div>
</body>
</html>