package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DestinoDao;

import model.Destino;

/**
 * Servlet implementation class DestinoCreateAndFind
 */
@WebServlet("/Destino.CreateAndFind")
public class DestinoCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinoCreateAndFind() {
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
		
		List<Destino> destinos = DestinoDao.find(pesquisa);
		
		request.setAttribute("destinos", destinos);
		RequestDispatcher resquesDispatcher = request.getRequestDispatcher("listaDestino.jsp");
		resquesDispatcher.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Destino destino = new Destino();
		
		destino.setLocalSaidaDestino(request.getParameter("localSaidaDestino"));
		destino.setLocalDestino(request.getParameter("localDestino"));
		destino.setCpfCli(request.getParameter("cpfCli"));
		destino.setHoraDestino(request.getParameter("horaDestino"));
		destino.setDataDestino(request.getParameter("dataDestino"));

		DestinoDao.create(destino);
		
		doGet(request, response);
	}

}
