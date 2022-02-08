package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDao;
import model.Contato;

/**
 * Servlet implementation class ContatoCreateAndFind
 */
@WebServlet("/Contato.CreateAndFind")
public class ContatoCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoCreateAndFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String pesquisa = request.getParameter("pesquisa");
		
		if(pesquisa == null) {
			pesquisa="";
		}
		
		List<Contato> contatos = ContatoDao.find(pesquisa);
		
		request.setAttribute("contatos", contatos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("listaContato.jsp");
		resquesDispatcher.forward(request, response);	}	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Contato contato = new Contato();
		
		contato.setNomeContato(request.getParameter("nomeContato"));
		contato.setEmailContato(request.getParameter("emailContato"));
		contato.setMsgContato(request.getParameter("msgContato"));
				
		ContatoDao.create(contato);
				
		doGet(request, response);
	}

}
