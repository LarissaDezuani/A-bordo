package dao;
import java.util.List;

import model.Cadastro;
//import model.Contato;
//import model.Destino;

public interface CRUD {
	//metodo
	public static void create(Cadastro cadastro){};
	//metodo recebe como parametro int o id do cliente
	public static void delete(int clienteId) {};
	//parametro string de pesquisa
	public static List<Cadastro> find(String pesquisa){return null;}
	//String pesquisa = parametro
	public static Cadastro findByPk(int clienteId) {return null;}
	public static void update(Cadastro cadastro) {}
	
	
	
	
}
