package fr.roudane.utilisateur.business.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.utilisateur.bean.UsersClass;
import fr.roudane.utilisateur.business.implement.UsersBusiness;


@WebServlet("/users_info")
public class usersInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsersBusiness ubz = new UsersBusiness();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String ID = request.getParameter("id");
		
		int id = Integer.parseInt(ID);
		
		
	UsersClass u = ubz.getOne(id);
		
		
		request.setAttribute("users", u);
		
		
		
		
		
		
		
		
		
		this.getServletContext()

		.getRequestDispatcher("/WEB-INF/pages/users-info.jsp")

		.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
