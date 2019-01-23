package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class facultylogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student Attendance Management System</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"4.jpg\">\n");
      out.write("        <center>\n");
      out.write("        <h1><font >STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr><br>\n");
      out.write("        <h3>FACULTY LOGIN</h3>\n");
      out.write("        <form action='LoginServlet' method='post'>\n");
      out.write("            <h4> Faculty-id:<input type=\"text\" name=\"name\"/></h4><br>\n");
      out.write("         <h4>Password:<input type=\"password\" name=\"pass\"/></h4><br><br>\n");
      out.write("            <input type=\"submit\" value=\"LOGIN\"/>\n");
      out.write("        </form>\n");
      out.write("        <br><br>\n");
      out.write("       \n");
      out.write("        ");

            Integer vcount= new Integer(0);
            String count=new String("vcount");
            if(session.isNew())
            {
                //out.println("<p>you have access this page</p>");
                session.setAttribute(count,vcount);
           
            }
            vcount=(Integer)session.getAttribute(count);
            vcount=vcount+1;
            session.setAttribute(count,vcount);
        
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <a href=\"http://www.facebook.com\"><img src=\"C:\\Users\\DELL\\Desktop\\fb.jpg\" height=\"30\" width=\"30\"></a>\n");
      out.write("        <a href=\"http://www.twitter.com\"> <img src=\"C:\\Users\\DELL\\Desktop\\twitter.jpg\" height=\"30\" width=\"30\"></a>\n");
      out.write("          <a href=\"http://www.google+.com\"><img src=\"C:\\Users\\DELL\\Desktop\\g+.png\" height=\"30\" width=\"30\"></a>\n");
      out.write("          <a href=\"http://www.instagram.com\"> <img src=\"C:\\Users\\DELL\\Desktop\\insta.jpg\" height=\"30\" width=\"30\"><br></a>\n");
      out.write("        NUMBER OF VISITORS ARE: ");
 out.println(vcount);
      out.write(" TIMES.\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
