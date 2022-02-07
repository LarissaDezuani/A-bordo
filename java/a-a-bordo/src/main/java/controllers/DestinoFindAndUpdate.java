package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DestinoDao;

import model.Destino;

/**
 * Servlet implementation class DestinoFindAndUpdate
 */
@WebServlet("/DestinoUpdate")
public class DestinoFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DestinoFindAndUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int destinoId = Integer.parseInt(request.getParameter("destinoId"));
		Destino destino = DestinoDao.findByPk(destinoId);
		
		request.setAttribute("destino", destino);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdateDestino.jsp");
		requestDispatcher.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Destino destino = new Destino();
		
		destino.setIdDestino(Integer.parseInt(request.getParameter("idDestino")));
		destino.setLocalSaidaDestino(request.getParameter("localSaidaDestino"));
		destino.setLocalDestino(request.getParameter("localDestino"));
		destino.setCpfCli(request.getParameter("cpfCli"));
		destino.setHoraDestino(request.getParameter("horaDestino"));
		destino.setDataDestino(request.getParameter("dataDestino"));

		DestinoDao.update(destino);
		
		DestinoCreateAndFind destinoCreateAndFind = new DestinoCreateAndFind();
		destinoCreateAndFind.doGet(request, response);
	}

}
