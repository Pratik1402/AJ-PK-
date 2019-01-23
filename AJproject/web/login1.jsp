
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Attendance Management System</title>
    </head>
     <body bgcolor='#E6E6FA'>
        <center>
        <h1>STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr><br>
        <h3>SELECT TYPE</h3>
        <form action='login.jsp' method='post'>
            <h4><input type="radio" name="type" value="1"/>Student</h4><br>
        <h4><input type="radio" name="type" value="2"/>Faculty</h4><br>
            <input type="submit" value="SELECT"/>
        </form>
        </center>
    </body>
</html>
