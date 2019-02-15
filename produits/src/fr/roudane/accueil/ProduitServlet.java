package fr.roudane.accueil;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.roudane.accueil.beans.Produits;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/produits")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Produits axe =
				new Produits("axe", 2.5, "https://www.axe.com/de/home.html", "ressources/images/deodorant_axe.jpg");
			

		Produits baguette =
			new Produits("baguette", 1.5, "\"http://www.marieblachere.com/","ressources/images/baguette.jpg" );
	

		Produits lait =
			new Produits("lait", 0.5, "http://lactel.fr/","ressources/images/lait.jpg" );
		
		
		Produits evian =
				
				new Produits("evian", 0.4, "https://www.evian.fr/","ressources/images/evian.jpg");
		
		
		Produits cafe =
				
				new Produits("cafe", 3.2, "https://www.nespresso.com/fr/fr/", "ressources/images/cafe.jpg");
		
		
		Produits lindt =
				new Produits("lindt", 4.3, "https://www.lindt.fr/", "ressources/images/lindt.jpg");
		
		
		
		Produits cristalinne =
				new Produits("cristalinne", 0.2, "https://www.moneaucristaline.fr/", "ressources/images/cristalinne.jpg");
		
		Produits thé =
				new Produits("thé", 1.6, "https://www.lipton.com/fr/home.html", "ressources/images/thé.jpg ");
		
		
		Produits [] produits = {axe,baguette,lait,evian,cafe,lindt,cristalinne,thé};
		
		
		request.setAttribute("produits", produits);

		
		
		
		

		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/produits.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
