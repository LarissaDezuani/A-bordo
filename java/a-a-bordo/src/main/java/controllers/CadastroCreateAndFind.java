package controllers;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.CadastroDao;
import model.Cadastro;

/**
 * Servlet implementation class CadastroCreateAndFind
 */
@WebServlet("/Cadastro.CreateAndFind")
public class CadastroCreateAndFind extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroCreateAndFind() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
	String pesquisa = request.getParameter("pesquisa");
	
	if(pesquisa == null) {
		pesquisa="";
	
	}
	
	List<Cadastro> cadastros = CadastroDao.find(pesquisa);
	
	// 
	request.setAttribute("cadastros", cadastros);
	//chama o RequestDispatcher para dispachar a pagina lista.jsp
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("lista.jsp");
	requestDispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setNomeCli(request.getParameter("nomeCli"));
		cadastro.setCPFCli(request.getParameter("CPFCli"));
		cadastro.setNasCli(request.getParameter("NasCli"));
		cadastro.setCEPCli(request.getParameter("CEPCli"));
		cadastro.setEnderecoCli(request.getParameter("enderecoCli"));
		cadastro.setBairroCli(request.getParameter("bairroCli"));
		cadastro.setNumeroCli(request.getParameter("numeroCli"));
		cadastro.setTelefoneCli(request.getParameter("telefoneCli"));
		cadastro.setEmailCli(request.getParameter("emailCli"));
		cadastro.setSituacao(request.getParameter("Situacao"));

		CadastroDao.create(cadastro);
		doGet(request, response);
	}

}
