package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CadastroDao;
import model.Cadastro;


@WebServlet("/CadastroUpdate")
public class CadastroFindAndUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CadastroFindAndUpdate() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//vai resgatar o id
		int clienteId = Integer.parseInt(request.getParameter("clienteId"));
		//recupera o parametro e instancia um cadastro
		//vai retornar um cliente no caso oque a pessoa desejar atualizar
		//metodo = findByPk recebe a chave primaria que e o idCli
		Cadastro cadastro = CadastroDao.findByPk(clienteId);
		
		
		request.setAttribute("cadastro", cadastro);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("formUpdate.jsp");
		requestDispatcher.forward(request, response);
		
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cadastro cadastro = new Cadastro();
		cadastro.setIdCli(Integer.parseInt(request.getParameter("idCli")));
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
		
		CadastroDao.update(cadastro);
		
		CadastroCreateAndFind cadastroCreateAndFind = new CadastroCreateAndFind(); 
		
		//depois que deleta o usuario
		//chama o do get
		cadastroCreateAndFind.doGet(request, response);
		
		
		
	}

}
