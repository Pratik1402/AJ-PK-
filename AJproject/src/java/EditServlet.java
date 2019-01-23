
import java.io.IOException;
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            out.println("<center>");
            out.println("<body bgcolor='#E6E6FA'>");
            out.println("<h1>STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr>");
            
            out.println("<h3>UPDATE RECORD</h3>");
            String sid=request.getParameter("id");
            int id=Integer.parseInt(sid);
            
            Emp e=EmpDao.getEmployeeById(id);
            
            out.print("<form action='EditServlet2' method='GET'>");
            out.print("<table>");
            out.print("<tr><td>Enrollment no</td><td><input type='text' name='id' value='"+e.getId()+"'/></td></tr>");
            out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+e.getName()+"'/></td></tr>");
            out.print("<tr><td>Percentage:</td><td><input type='text' name='password' value='"+e.getPassword()+"'/> </td></tr>");
            out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+e.getEmail()+"'/></td></tr>");
            out.print("<tr><td>Status:</td><td>");
            out.print("<select name='country' style='width:150px'>");
            out.print("<option>Present</option>");
            out.print("<option>Absent</option>");
            
            out.print("</select>");
            out.print("</td></tr>");
            out.print("<tr><td>Semester:</td><td><input type='text' name='sem' value='"+e.getSem()+"'/></td></tr>");
            out.print("<tr><td colspan='2'><input type='submit' value='UPDATE'/></td></tr>");
            out.print("</table>");
            out.print("</form>");
        }  
    }  
}  