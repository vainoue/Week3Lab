<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 26, 2023, 11:35:35 PM
    Author     : vitor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="first_value" value="${first_value_att}"><br>
            Second: <input type="text" name="second_value" value="${second_value_att}"><br>
            <input type="submit" name="click_button" value="+">
            <input type="submit" name="click_button" value="-">
            <input type="submit" name="click_button" value="*">
            <input type="submit" name="click_button" value="%">
        </form>
        <br>
        Result: ${result_arithmetic}
        <a href="age">Age Calculator</a>
    </body>
</html>
