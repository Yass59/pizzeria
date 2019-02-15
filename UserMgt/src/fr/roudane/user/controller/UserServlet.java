package fr.roudane.user.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.user.bean.UsersClass;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UsersClass luffy = 
				new UsersClass("monkey", "luffy", "ressources/images/luffy.png", 22);



		UsersClass barbenoir =

				new UsersClass("teach", "marshall", "ressources/images/barbenoir.jpg", 36);



		

		UsersClass rayleigh =

				new UsersClass("rayleigh", "x", "ressources/images/rayleigh.jpeg", 45);




		UsersClass mihawk =

				new UsersClass("mihawk", "dracule", "ressources/images/mihawk.png", 40);
		
		
		

		UsersClass roronoa =

				new UsersClass("roronoa", "zoro", "ressources/images/zoro.png", 27);




		UsersClass chopper =

				new UsersClass("chopper", "x", "ressources/images/chopper.png", 18);
		



		UsersClass doflamingo =

				new UsersClass("donquixote", "doflamingo", "ressources/images/Doflamingo.jpg", 31);



		UsersClass sanji =

				new UsersClass("sanji", "x", "ressources/images/sanji.jpg", 22);









		ArrayList<UsersClass> users =
				new ArrayList<>();

		users.add(luffy);
		users.add(barbenoir);
		users.add(rayleigh);
		users.add(mihawk);
		users.add(roronoa);
		users.add(chopper);
		users.add(doflamingo);
		users.add(sanji);







		request.setAttribute("users", users);
		
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/users.jsp").forward(request, response);
	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
