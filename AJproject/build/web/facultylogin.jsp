

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
        <h1><font >STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr><br>
        <h3>FACULTY LOGIN</h3>
        <form action='LoginServlet' method='post'>
            <h4> Faculty-id:<input type="text" name="name"/></h4><br>
         <h4>Password:<input type="password" name="pass"/></h4><br><br>
            <input type="submit" value="LOGIN"/>
        </form>
        <br><br>
        </center>
    </body>
</html>
