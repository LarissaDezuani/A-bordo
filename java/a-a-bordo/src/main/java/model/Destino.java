package model;

public class Destino {
	
	
	
	private int idDestino;
	private String horaDestino, localSaidaDestino, localDestino, dataDestino, cpfCli ;
	public int getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}
	public String getHoraDestino() {
		return horaDestino;
	}
	public void setHoraDestino(String horaDestino) {
		this.horaDestino = horaDestino;
	}
	public String getLocalSaidaDestino() {
		return localSaidaDestino;
	}
	public void setLocalSaidaDestino(String localSaidaDestino) {
		this.localSaidaDestino = localSaidaDestino;
	}
	public String getLocalDestino() {
		return localDestino;
	}
	public void setLocalDestino(String localDestino) {
		this.localDestino = localDestino;
	}
	public String getDataDestino() {
		return dataDestino;
	}
	public void setDataDestino(String dataDestino) {
		this.dataDestino = dataDestino;
	}
	public String getCpfCli() {
		return cpfCli;
	}
	public void setCpfCli(String cpfCli) {
		this.cpfCli = cpfCli;
	}
	@Override
	public String toString() {
		return "Destino [idDestino=" + idDestino + ", horaDestino=" + horaDestino + ", localSaidaDestino="
				+ localSaidaDestino + ", localDestino=" + localDestino + ", dataDestino=" + dataDestino + ", cpfCli="
				+ cpfCli + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
