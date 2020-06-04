
<#import "partials/main.ftlh" as main />

<@main.renderWith>
<nav class="navbar navbar-light bg-light">
<ul class="navbar-nav">
    <li class="nav-item" >
        <a class="nav-link " href="/">Home</a>
    </li>
</ul>
</nav>
    <div class="card mt-3" style="width: 30rem; text-align: center">
        <div class="card-body">
            <h5 class="card-title">BOOK NAME: ${book.name} </h5>
            <h6 class="card-subtitle mb-2 text-muted">BOOK AUTHOR: ${book.author} </h6>
            <p class="card-text">BOOK PRICE: ${book.price}</p>

        </div>
    </div>
</@main.renderWith>