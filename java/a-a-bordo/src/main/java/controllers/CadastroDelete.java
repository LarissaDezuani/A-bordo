package controllers;
/*cliente destroy aponta para a classe cliente delete*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CadastroDao;
//import model.Cadastro;

@WebServlet("/CadastroDestroy")
public class CadastroDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CadastroDelete() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int clienteId = Integer.parseInt(request.getParameter("clienteId"));
		CadastroDao.delete(clienteId);
		
		
		CadastroCreateAndFind cadastroCreateAndFind = new CadastroCreateAndFind(); 
		
		//depois que deleta o usuario
		//chama o do get
		cadastroCreateAndFind.doGet(request, response);
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	doGet(request, response);
	//}

}
