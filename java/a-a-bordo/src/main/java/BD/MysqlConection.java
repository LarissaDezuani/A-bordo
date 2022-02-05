package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConection {
	
	private static final String url = "jdbc:mysql://localhost:3306/abordo";
	
	//user super usuario
	private static final String user = "root";
	private static final String password = "Internet*1234";
	
	//metodo que retorna a conexao com mysql
	public static Connection createConnection() {
		
		//bloco try catch lança uma excessao do tipo classNot
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver encontrado");
			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver não encontrado" + e.getMessage());
//getMessage = mensagem do erro
		}
		try {
			//instanciar a variavel do tipo conexao chama a classe manager
			//classe do java e chama o metodo dele getConnection sobrecarga que usa
			//url, user, password = as constantes 
			Connection Connection = DriverManager.getConnection(url, user, password);
			System.out.println("foi conectado o banco de dados");
			return Connection;

		}catch(SQLException e) {
			System.out.println("Não foi conectado o banco de dados" + e.getMessage());
			return null;
		}
	}
}
