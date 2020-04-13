<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>All members</title>
    <link rel="stylesheet" href="/css/candidates.css">
</head>

<body>
    <div class="container flex flex-col align-center">
      <main class="flex flex-wrap align-evenly">
        <#list user as person>
        <div class="card">
            <p>${person.name}</p>
            <p>${person.email}</p>
        </div>
        </#list>
      </main>
      <p>-------------------------------------------------------</p>
    </div>
</body>

</html>