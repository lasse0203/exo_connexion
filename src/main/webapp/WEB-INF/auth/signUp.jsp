<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 08/09/2023
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
</head>
<body>
<form action="" method="post">
    <div>
        <label for="firstname">firstname:</label>
        <input type="text" name="firstname" id="firstname" required>
    </div>
    <div>
        <label for="lastname">firstname:</label>
        <input type="text" name="lastname" id="lastname" required>
    </div>
    <div>
        <label for="email">email:</label>
        <input type="text" name="email" id="email" required>
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password" required>
    </div>
    <hr>
    <button>Submit</button>
</form>

</body>
</html>
