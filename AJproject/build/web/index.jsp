

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Student attendance management system</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    <title>Student attendance management system</title>  
    
    </head>  
   <body bgcolor='#E6E6FA'>   
     <center>
   <h1>STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr>
   <table width='30%' cellspacing=1>
           <tr><td><a href="fill1.jsp">VIEW RECORDS</a></td>  
    <td><a href="login1.jsp">LOGOUT</a></td></tr>
       </table>
    <h2>Add New Student Record</h2>  
    <form action="SaveServlet" method="post">  
    <table cellspacing="20">
    <tr><td>Enrollment No.:</td><td><input type="text" name="id"/></td></tr>
    <tr><td>Semester:</td><td><input type="text" name="sem"/></td></tr>
    <tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
    <tr><td>Percentage:</td><td><input type="text" name="password"/></td></tr>
    <tr><td>Email:</td><td><input type="email" name="email"/></td></tr>
    <tr><td>Status:</td><td>  
    <select name="country" style="width:150px">  
    <option>Present</option>  
    <option>Absent</option>  
    </select>
           
    <tr><td colspan="2"><p align=center><input type="submit" value="SAVE"/></td></tr>  
    </table>
    </form>
    
      
    <br/>  
     
      </center> 
    </body>  
    </html>  
