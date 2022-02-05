package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import BD.MysqlConection;
import model.Cadastro;


//vai ser uma classe de metodos
public class CadastroDao implements CRUD {
	
	//variavel privada do tipo conexao que recebe o retorno da =da classe mysqlconnection
	private static Connection connection = MysqlConection.createConnection();
	private static String sql;
			
	
	public static void create(Cadastro cadastro){
		sql= "INSERT INTO cadastros VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, cadastro.getNomeCli());
			preparedStatement.setString(2, cadastro.getCPFCli());
			preparedStatement.setString(3, cadastro.getNasCli());
			preparedStatement.setString(4, cadastro.getCEPCli());
			preparedStatement.setString(5, cadastro.getEnderecoCli());
			preparedStatement.setString(6, cadastro.getBairroCli());
			preparedStatement.setString(7, cadastro.getNumeroCli());
			preparedStatement.setString(8, cadastro.getTelefoneCli());
			preparedStatement.setString(9, cadastro.getEmailCli());
			preparedStatement.setString(10, cadastro.getSituacao());
			
			preparedStatement.executeUpdate();
			    
			System.out.println("--- dados inseridos no banco de dados");

		}catch(SQLException e){
			System.out.println("--- erro no banco de dados" + e.getMessage());

		}
	}
	
	public static void delete(int clienteId) {
    sql = "DELETE FROM cadastros WHERE idCli = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, clienteId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on cadastro");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on cadastro. " + e.getMessage());
		}
	}
	
	public static List<Cadastro> find(String pesquisa){
		
	sql = String.format("SELECT * FROM cadastros WHERE nomeCli like '%s%%' OR CPFCli LIKE '%s%%'", pesquisa, pesquisa);
			//like = pede todos resultados
	
			//instrucao de consulta atribuida a variavel sql
	List<Cadastro> cadastros = new ArrayList<Cadastro>();
	
	try {
		
		
		//instanciar a variavel statement= recebe a variavel = connection.createStatement
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		//resultset com u metodo dele chamado next = mostra os resultados vindo do banco de dados
		
		//enquanto tiver resultado da minha busca 
		//vai instanciar o cadastro
		while(resultSet.next()) {
			
			Cadastro cadastro = new Cadastro();
			//resultSet = metodo do resultSet= getInt e passa o nome da colona = idCli 
			cadastro.setIdCli(resultSet.getInt("idCli"));
			cadastro.setNomeCli(resultSet.getString("nomeCli"));
			cadastro.setCPFCli(resultSet.getString("CPFCli"));
			cadastro.setNasCli(resultSet.getString("NasCli"));
			cadastro.setCEPCli(resultSet.getString("CEPCli"));
			cadastro.setEnderecoCli(resultSet.getString("enderecoCli"));
			cadastro.setBairroCli(resultSet.getString("bairroCli"));
			cadastro.setNumeroCli(resultSet.getString("numeroCli"));
			cadastro.setTelefoneCli(resultSet.getString("telefoneCli"));
			cadastro.setEmailCli(resultSet.getString("emailCli"));
			cadastro.setSituacao(resultSet.getString("Situacao"));

			//vai setar os dados e adicionar o cliente na list de clientes
			cadastros.add(cadastro);
			
			
			
		
		}
		
		System.out.println("---correct find cadastro");
		return cadastros;
		
		

	
	} catch(SQLException e) {
		//mostra o erro da excessao
		System.out.println("--- inorrect find cadastro" + e.getMessage());

		return null;
	}
	
	
	
	}
	
	//String pesquisa = parametro
	public static Cadastro findByPk(int clienteId) {
		return null;
		
	}
	
	public static void update(Cadastro cadastro) {
		
	}
	
}
