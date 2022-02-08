package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDao;
import model.Contato;

/**
 * Servlet implementation class ContatoFindAndUpdate
 */
@WebServlet("/ContatoUpdate")
public class ContatoFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContatoFindAndUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int contatoId = Integer.parseInt(request.getParameter("contatoId"));
		Contato contato = ContatoDao.findByPk(contatoId);
		
		request.setAttribute("contato", contato);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdateContato.jsp");
		requestDispatcher.forward(request, response);
	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
      Contato contato = new Contato();
		
		contato.setIdContato(Integer.parseInt(request.getParameter("idContato")));
		contato.setNomeContato(request.getParameter("nomeContato"));
		contato.setEmailContato(request.getParameter("emailContato"));
		contato.setMsgContato(request.getParameter("msgContato"));
		
		ContatoDao.update(contato);
		
		ContatoCreateAndFind contatoCreateAndFind = new ContatoCreateAndFind();
		contatoCreateAndFind.doGet(request, response);
	}

}
