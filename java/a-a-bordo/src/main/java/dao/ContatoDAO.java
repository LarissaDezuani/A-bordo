package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import BD.MysqlConection;
import model.Contato;

public class ContatoDao implements CRUD {
	
	private static Connection connection = MysqlConection.createConnection();
	private static String sql;

		public static void create(Contato contato){
			
			sql = "INSERT INTO contatos VALUES (null, ?, ?, ?)";
			 
			 try {
				 PreparedStatement preparedStatement = connection.prepareStatement(sql);
				 
				 preparedStatement.setString(1, contato.getNomeContato());
				 preparedStatement.setString(2, contato.getEmailContato());
				 preparedStatement.setString(3, contato.getMsgContato());
				 
				 preparedStatement.executeUpdate();
				 
				 System.out.println("--correct insert on database");
				 
			 } catch(SQLException e) {
				 System.out.println("--incorrect insert on database. " + e.getMessage());
			 }
		}
		
		
		public static void delete(int contatoId) {
			sql = "DELETE FROM contatos WHERE idContato = ?";
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setInt(1, contatoId);
				preparedStatement.executeUpdate();
				
				System.out.println("--correct delete on cliente");
				
			} catch (SQLException e) {
				System.out.println("--incorrect delete on cliente. " + e.getMessage());
			}
			
		}
		
		
		public static List<Contato> find(String pesquisa){
			sql = String.format("SELECT * FROM contatos WHERE nomeContato like '%s%%' ", pesquisa);
			List<Contato> contatos = new ArrayList<Contato>();
			
			try {
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				while (resultSet.next()) {
					
					Contato contato = new Contato();
					
					contato.setIdContato(resultSet.getInt("idContato"));
					contato.setNomeContato(resultSet.getString("nomeContato"));
					contato.setEmailContato(resultSet.getString("emailContato"));
					contato.setMsgContato(resultSet.getString("msgContato"));
					
					
					contatos.add(contato);
					
				}
				
				System.out.println("--correct find clientes");
				return contatos;
				
			} catch(SQLException e) {
				System.out.println("--incorrect find clientes. " + e.getMessage());
				return null;
			}
			}
		
		public static Contato findByPk(int contatoId) {
			sql = String.format("SELECT * FROM contatos WHERE idContato = %d", contatoId);
			// %d = e inteiro nao precisa de aspas simples

			//instrucao de consulta atribuida a variavel sql

	try {
		
		
		//instanciar a variavel statement= recebe a variavel = connection.createStatement
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		Contato contato = new Contato();

		
		//resultset com u metodo dele chamado next = mostra os resultados vindo do banco de dados
		
		//enquanto tiver resultado da minha busca 
		//vai instanciar o cadastro
		while(resultSet.next()) {
			
			//resultSet = metodo do resultSet= getInt e passa o nome da colona = idCli, setar o id...
			contato.setIdContato(resultSet.getInt("idContato"));
			contato.setNomeContato(resultSet.getString("nomeContato"));
			contato.setEmailContato(resultSet.getString("emailContato"));
			contato.setMsgContato(resultSet.getString("msgContato"));
			

			//vai setar os dados e adicionar o cliente na list de clientes	
		
		}
		
		System.out.println("---correct find by pk contato");
		return contato;
			
		} catch(SQLException e) {
			//mostra o erro da excessao
			System.out.println("--- inorrect find by pk contato" + e.getMessage());

			return null;
		}
	}
		
		public static void update(Contato contato) {
			sql= "UPDATE contatos SET nomeContato=?,  emailContato=?, msgContato=? WHERE  idContato=?";
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
				preparedStatement.setString(1, contato.getNomeContato());
				preparedStatement.setString(2, contato.getEmailContato());
				preparedStatement.setString(3, contato.getMsgContato());
				preparedStatement.setInt(4, contato.getIdContato());
				
				preparedStatement.executeUpdate();
				    
				System.out.println("--- dados atualizados e inseridos no banco de dados");

			}catch(SQLException e){
				System.out.println("--- erro na inserção de dados no banco de dados" + e.getMessage());

			}
		}
		
	}
