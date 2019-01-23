

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<% 
    String type = "1";
    String type1 = request.getParameter("type");
            if(type1.equals(type)){
		response.sendRedirect("fill.jsp");
           }
           else{ 
            response.sendRedirect("facultylogin.jsp");
}
%>
