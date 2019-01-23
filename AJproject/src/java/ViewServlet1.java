import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet1")  
public class ViewServlet1 extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 
        String sid=request.getParameter("id");
         out.print("<h1><center>STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr>");
         out.print("<table width='30%' cellspacing=1>");
           out.println("<tr><td><a href=\"fill1.jsp\">CHECK OTHER RECORD</a></td>");
            out.println("<td><a href='login1.jsp'>HOME</a></td></tr>");
            out.print("</table>");
        out.println("<h1><center>STUDENT LIST</center></h1>");  
        out.println("<body bgcolor='#E6E6FA'>");  

        List<Emp> list=EmpDao.getAllEmployees(sid);  
          
        out.print("<table border='10' width='100%'>");  
        out.print("<tr><th>ID</th>"
                + "<th>NAME</th>"
                + "<th>PERCENTAGE</th>"
                + "<th>E-MAIL</th>"
                + "<th>STATUS</th>"
                + "<th>SEM</th></tr>");  
        for(Emp e:list){  
         out.print("<tr><td>"+e.getId()+"</td>"
                 + "<td>"+e.getName()+"</td>"
                         + "<td>"+e.getPassword()+"</td>"
                                 + "<td>"+e.getEmail()+"</td>"
                                         + "<td>"+e.getCountry()+"</td>"
                                                 + "<td>"+e.getSem()+"</td></tr>");  
        }  
        out.print("</table>");  
           out.print("<br><br>");
           
        out.close();  
    }  
} 