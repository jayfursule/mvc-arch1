package P1;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet 
{
       	public void service(HttpServletRequest request, HttpServletResponse response) 
       	{
       		String temp = request.getParameter("reg");
       		Model m = new Model();
       		m.setRegno(temp);
       		m.getResult();
       		
       		HttpSession session = request.getSession(true);
       		
       		session.setAttribute("regno", m.getRegno());
       		session.setAttribute("name", m.getName());
       		session.setAttribute("marks1", m.getMarks1());
       		session.setAttribute("marks2", m.getMarks2());
       		session.setAttribute("marks3", m.getMarks3());
       		session.setAttribute("avg", m.getAvg());
       		
       		
       		try
       		{
       			response.sendRedirect("disp.jsp");
       		}
       		catch(Exception e)
       		{
       			System.out.println("Error");
       		}
       		
       	}



}
