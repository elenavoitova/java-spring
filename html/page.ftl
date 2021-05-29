<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <h3>Template</h3>
    User name: ${user.age}<br>
    User age: ${user.name}<br>
    User age: ${user.getNameUpper()}

    <table border="1">
        <#list items as item>
        <tr><td>${item.name}</td><td>${item.price}</td></tr>
        </#list>
    </table>

</body>
</html>
