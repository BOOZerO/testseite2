package de.boozero.testseite2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */

/**
* <h1>Servlet implementation class Welcome!</h1>
* The Servlet implementation of the class Welcome 
* simply displays "Hello World!" to the servlet.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
* 
*
* @author  Henry Beier
* @version 1.0
* @since   2014-06-12 
*/

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("### doGet");
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<head><title>Hello World Servlet Testseite2</title></head>");
		writer.println("<body>");
		writer.println("	<h1>Hello World from a Sevlet - testseite2! </h1>");
		writer.println("<body>");
		writer.println("</html>");
			
		writer.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("### doPost");
	}

}
