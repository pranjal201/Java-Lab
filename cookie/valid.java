import java.io.*;  
import javax.servlet.http.*;
public class valid extends HttpServlet {  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
    response.setContentType("text/html");  
        try (PrintWriter out = response.getWriter()) {
            String n=request.getParameter("userName");
            out.print("<center><h2>Welcome "+n+"</h2></center>");
            
            Cookie ck=new Cookie("uname",n);
            response.addCookie(ck);
            out.print("<body bgcolor='white'>");
            out.print("<center> <form action=\"Servlet2\" method=\"post\"> ");
            out.print("<input type='submit' value='go'>");
            out.print("</form></center>");
            out.print("</body>");
        }  
        }catch(Exception e)
        {System.out.println(e);}  
  }  
}  
