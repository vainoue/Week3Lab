<%-- 
    Document   : agecalculator.jsp
    Created on : Jan 23, 2023, 11:12:48 PM
    Author     : vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="inputage"><br>
            <input type="submit" value="Age next birthday">
        </form>
        ${displaymessage}
        <p>Colocar o link</p>
    </body>
</html>
