package dao;
import java.util.List;


import model.Contato;
//import model.Contato;
//import model.Destino;

public interface CRUD {
	//metodo
	public static void create(Contato contato){};
	//metodo recebe como parametro int o id do cliente
	public static void delete(int contatoId) {};
	//parametro string de pesquisa
	public static List<Contato> find(String pesquisa){return null;}
	//String pesquisa = parametro
	public static Contato findByPk(int contatoId) {return null;}
	public static void update(Contato contato) {}
	
	
	
	
}
