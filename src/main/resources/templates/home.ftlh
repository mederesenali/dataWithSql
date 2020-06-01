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
        <a class="nav-link " href="/addBook">Add book</a>
    </li>

</ul>
</nav>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Author</th>
            <th scope="col">Name</th>
            <th scope="col">price</th>
        </tr>
        </thead>
        <tbody>

        <#list books as b>
        <tr>
            <th scope="row">${b.id}</th>
            <td>${b.author}</td>
            <td>${b.name}</td>
            <td>${b.price}</td>
        </tr>
        </#list>
        </tbody>
    </table>

</div>
</body>
</html>