package test;
 
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;


@WebServlet("/list")
public class list extends HttpServlet 
{  
  protected void doGet(HttpServletRequest request,HttpServletResponse response)
                         throws ServletException,java.io.IOException
   {
      ServletContext application=getServletContext() ;
      ServletConfig config=getServletConfig() ;
      
      response.setContentType("text/html; charset=UTF-8");
      PrintWriter out=response.getWriter(); 
      HttpSession session =request.getSession();
      request.setCharacterEncoding("UTF-8");
      
      out.print("<form >");	
      out.print("<input type='submit' value='返回首頁' id='button' onclick=javascript:location.href='http://localhost:8080/0806/Car1.jsp'>");
      out.print("</form >");
       //
		HashMap shoppingCar=(HashMap)session.getAttribute("shoppingCar");
	  //購物車內容
	   if(shoppingCar!=null)
	   {
	      Set show=shoppingCar.entrySet();
	      Iterator it=show.iterator();
	      while(it.hasNext())
	      {
	        out.print(it.next()+"<br>");
	       }
	   }
	   else
	   	  out.print("你還沒有購買東西！"); 
      }
  
  	
      
protected void doPost(HttpServletRequest request,HttpServletResponse response)
                                throws ServletException,java.io.IOException
  {
  	   doGet(request,response);
  	}
}