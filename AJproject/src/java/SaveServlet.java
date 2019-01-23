    import java.io.IOException;  
    import java.io.PrintWriter;  
      
    import javax.servlet.ServletException;  
    import javax.servlet.annotation.WebServlet;  
    import javax.servlet.http.HttpServlet;  
    import javax.servlet.http.HttpServletRequest;  
    import javax.servlet.http.HttpServletResponse;  
    @WebServlet("/SaveServlet")  
    public class SaveServlet extends HttpServlet {  
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
            response.setContentType("text/html");  
            try (PrintWriter out = response.getWriter()) {
                String id=request.getParameter("id");
                String name=request.getParameter("name");
                String password=request.getParameter("password");
                String email=request.getParameter("email");
                String country=request.getParameter("country");
                String sem=request.getParameter("sem");
                System.out.println("HII Entered......");
                Emp e=new Emp();
                e.setId(id);
                e.setName(name);
                e.setPassword(password);
                e.setEmail(email);
                e.setCountry(country);
                e.setSem(sem);
              
                int status=EmpDao.save(e);
                if(status>0){
                    out.print("<p>Record saved successfully!</p>");
                    request.getRequestDispatcher("index.jsp").include(request, response);
                }else{
                    out.println("Sorry! unable to save record");
                }
            }  
        }  
      
    }  