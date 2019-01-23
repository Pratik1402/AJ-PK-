package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Student attendance management system</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("    <title>Student attendance management system</title>  \n");
      out.write("    \n");
      out.write("    </head>  \n");
      out.write("   <body bgcolor='#E6E6FA'>   \n");
      out.write("     <center>\n");
      out.write("   <h1>STUDENT ATTENDANCE MANAGEMENT SYSTEM</h1><hr>\n");
      out.write("   <table width='30%' cellspacing=1>\n");
      out.write("           <tr><td><a href=\"fill1.jsp\">VIEW RECORDS</a></td>  \n");
      out.write("    <td><a href=\"login.jsp\">LOGOUT</a></td></tr>\n");
      out.write("       </table>\n");
      out.write("    <h2>Add New Student Record</h2>  \n");
      out.write("    <form action=\"SaveServlet\" method=\"post\">  \n");
      out.write("    <table cellspacing=\"20\">\n");
      out.write("    <tr><td>Enrollment No.  :</td><td><input type=\"text\" name=\"enroll\"/></td></tr>\n");
      out.write("    <tr><td>Semester:</td><td><input type=\"text\" name=\"sem\"/></td></tr>\n");
      out.write("    <tr><td>Name:</td><td><input type=\"text\" name=\"name\"/></td></tr>\n");
      out.write("    <tr><td>Percentage:</td><td><input type=\"text\" name=\"password\"/></td></tr>\n");
      out.write("    <tr><td>Email:</td><td><input type=\"email\" name=\"email\"/></td></tr>\n");
      out.write("    <tr><td>Status:</td><td>  \n");
      out.write("    <select name=\"country\" style=\"width:150px\">  \n");
      out.write("    <option>Present</option>  \n");
      out.write("    <option>Absent</option>  \n");
      out.write("    </select>\n");
      out.write("           \n");
      out.write("    <tr><td colspan=\"2\"><p align=center><input type=\"submit\" value=\"SAVE\"/></td></tr>  \n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("      \n");
      out.write("    <br/>  \n");
      out.write("     \n");
      out.write("      </center> \n");
      out.write("    </body>  \n");
      out.write("    </html>  \n");
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
