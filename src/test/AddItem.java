package test;
 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

@WebServlet("/AddItem")
public class AddItem extends HttpServlet 
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
      
      //取清單裡面的資料
     String id=request.getParameter("itemID"); 
	 String num=request.getParameter("quantity");
	 if(id!=null && num.length()!=0)
	 {  //取購物車的資料
		HashMap shoppingCar=(HashMap)session.getAttribute("shoppingCar");
	    if(shoppingCar==null)
        shoppingCar=new HashMap();
	    //將商品放到購物車
	    String onum=(String)shoppingCar.get(id);
	    if(onum==null)
	        shoppingCar.put(id,num);
	    else
	    {
	       int n1=Integer.parseInt(num);
		   int n2=Integer.parseInt(onum);
		   String result=String.valueOf(n1+n2);
		   shoppingCar.put(id,result);
	     }   
         //把購買的東西保存
	     session.setAttribute("shoppingCar",shoppingCar); 
	   }
	   else  
	     System.out.print("你還沒有購買東西");
	  //返回首頁
	  response.sendRedirect("http://localhost:8080/0806/Car1.jsp");   
      }	
      
protected void doPost(HttpServletRequest request,HttpServletResponse response)
                                throws ServletException,java.io.IOException
  {
  	   doGet(request,response);
  	}
}
