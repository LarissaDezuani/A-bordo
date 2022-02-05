package model;

public class Contato {
	private int idContato;
	private String nomeContato, emailContato, msgContato;
	public int getIdContato() {
		return idContato;
	}
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getEmailContato() {
		return emailContato;
	}
	public void setEmailContato(String emailContato) {
		this.emailContato = emailContato;
	}
	public String getMsgContato() {
		return msgContato;
	}
	public void setMsgContato(String msgContato) {
		this.msgContato = msgContato;
	}
	@Override
	public String toString() {
		return "Contato [idContato=" + idContato + ", nomeContato=" + nomeContato + ", emailContato=" + emailContato
				+ ", msgContato=" + msgContato + "]";
	}
	
	
	
	
	

}
