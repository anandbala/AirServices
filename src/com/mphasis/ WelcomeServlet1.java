package com.mphasis;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*
		* Get the value of form parameter
		*/
		String name = request.getParameter("name");
		String welcomeMessage = "Welcome "+name;
		/*
		* Set the content type(MIME Type) of the response.f
		*/
		response.setContentType("text/html");
		response.setContentType("text/html");
		 
		 
		/*
		 * You can do any processing here. 
		 * We will simply output the value of name parameter on server console.
		 * 
		 */
		System.out.println(name);
		String destination = "/jsp/resulta33.jsp";
                 
		try{

		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		rd.forward(request, response);
		System.out.println(name);
		}catch(Exception e){
			e.printStackTrace();
			
		}

		System.out.println(name+""+name);
		System.out.println(name);
		
		
	}

}
