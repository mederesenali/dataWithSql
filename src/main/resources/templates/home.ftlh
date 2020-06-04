<#import "partials/main.ftlh" as main />

<@main.renderWith>

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
       <tr  onclick="window.location='/book/${b.id}'" class="pointer">
            <th scope="row">${b.id}</th>
            <td>${b.author}</td>
            <td>${b.name}</td>
            <td>${b.price}</td>
        </tr>

        </#list>
        </tbody>

    </table>

</@main.renderWith>