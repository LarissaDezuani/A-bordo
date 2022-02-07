package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import BD.MysqlConection;
import model.Destino;

public class DestinoDao implements CRUDDestino  {
	
	private static Connection connection = MysqlConection.createConnection();
	private static String sql;
	
	public static void create(Destino destino) {
		
		sql = "INSERT INTO destinos VALUES (null, ?, ?, ?, ?, ?)";
		 
		 try {
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 
			 preparedStatement.setString(1, destino.getLocalSaidaDestino());
			 preparedStatement.setString(2, destino.getLocalDestino());
			 preparedStatement.setString(3, destino.getCpfCli());
			 preparedStatement.setString(4, destino.getHoraDestino());
			 preparedStatement.setString(5, destino.getDataDestino());

			 preparedStatement.executeUpdate();
			 
			 System.out.println("--correct insert on database");
			 
		 } catch(SQLException e) {
			 System.out.println("--incorrect insert on database. " + e.getMessage());
		 }
		
	}
	
	
	
	
	public static void delete(int destinoId) {
sql = "DELETE FROM destinos WHERE idDestino = ?";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, destinoId);
			preparedStatement.executeUpdate();
			
			System.out.println("--correct delete on cliente");
			
		} catch (SQLException e) {
			System.out.println("--incorrect delete on cliente. " + e.getMessage());
		}
		
	}
	
	public static List<Destino> find(String pesquisa){
		sql = String.format("SELECT * FROM destinos WHERE cpfCli like '%s%%' OR localDestino LIKE '%s%%' ", pesquisa, pesquisa);
		List<Destino> destinos = new ArrayList<Destino>();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
			while (resultSet.next()) {
				
				Destino destino = new Destino();
				
				destino.setIdDestino(resultSet.getInt("idDestino"));
				destino.setLocalSaidaDestino(resultSet.getString("localSaidaDestino"));
				destino.setLocalDestino(resultSet.getString("localDestino"));
				destino.setCpfCli(resultSet.getString("cpfCli"));
				destino.setHoraDestino(resultSet.getString("horaDestino"));
				destino.setDataDestino(resultSet.getString("dataDestino"));

				destinos.add(destino);
				
			}
			
			System.out.println("--correct find clientes");
			return destinos;
			
		} catch(SQLException e) {
			System.out.println("--incorrect find clientes. " + e.getMessage());
			return null;
		}
	
	
	}
	public static Destino findByPk(int destinoId) {
sql = String.format("SELECT * FROM destinos WHERE idDestino = %d ", destinoId);
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			Destino destino = new Destino();
			
			while (resultSet.next()) {
				destino.setIdDestino(resultSet.getInt("idDestino"));
				destino.setLocalSaidaDestino(resultSet.getString("localSaidaDestino"));
				destino.setLocalDestino(resultSet.getString("localDestino"));
				destino.setCpfCli(resultSet.getString("cpfCli"));
				destino.setHoraDestino(resultSet.getString("horaDestino"));
				destino.setDataDestino(resultSet.getString("dataDestino"));

			}
			
			System.out.println("--correct find by pk clientes");
			return destino;
			
	} catch(SQLException e) {
		
			System.out.println("--incorrect find by pk clientes. " + e.getMessage());
			return null;
		}
	}
	public static void update(Destino destino) {
	sql = "UPDATE destinos SET localSaidaDestino=?, localDestino=?, cpfCli=?, horaDestino=?, dataDestino=? WHERE idDestino=?";
	 
	 try {
		 PreparedStatement preparedStatement = connection.prepareStatement(sql);
		 
		 preparedStatement.setString(1, destino.getLocalSaidaDestino());
		 preparedStatement.setString(2, destino.getLocalDestino());
		 preparedStatement.setString(3, destino.getCpfCli());
		 preparedStatement.setString(4, destino.getHoraDestino());
		 preparedStatement.setString(5, destino.getDataDestino());

		 preparedStatement.setInt(6, destino.getIdDestino());
		 
		 preparedStatement.executeUpdate();
		 
		 System.out.println("--correct update on database");
		 
	 } catch(SQLException e) {
		 System.out.println("--incorrect update on database. " + e.getMessage());
	 }
	}
}
