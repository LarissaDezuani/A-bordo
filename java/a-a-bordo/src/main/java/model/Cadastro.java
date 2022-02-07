package model;

public class Cadastro {
	
	private int idCli;
	private String nomeCli, CPFCli, NasCli, CEPCli,  enderecoCli, bairroCli, numeroCli,
	telefoneCli, emailCli, Situacao   ;
	public int getIdCli() {
		return idCli;
	}
	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}
	
	public String getNomeCli() {
		return nomeCli;
	}
	public void setNomeCli(String nomeCli) {
		this.nomeCli = nomeCli;
	}
	public String getCPFCli() {
		return CPFCli;
	}
	public void setCPFCli(String cPFCli) {
		CPFCli = cPFCli;
	}
	public String getNasCli() {
		return NasCli;
	}
	public void setNasCli(String nasCli) {
		NasCli = nasCli;
	}
	public String getCEPCli() {
		return CEPCli;
	}
	public void setCEPCli(String cEPCli) {
		CEPCli = cEPCli;
	}
	public String getEnderecoCli() {
		return enderecoCli;
	}
	public void setEnderecoCli(String enderecoCli) {
		this.enderecoCli = enderecoCli;
	}
	public String getBairroCli() {
		return bairroCli;
	}
	public void setBairroCli(String bairroCli) {
		this.bairroCli = bairroCli;
	}
	public String getNumeroCli() {
		return numeroCli;
	}
	public void setNumeroCli(String numeroCli) {
		this.numeroCli = numeroCli;
	}
	public String getTelefoneCli() {
		return telefoneCli;
	}
	public void setTelefoneCli(String telefoneCli) {
		this.telefoneCli = telefoneCli;
	}
	public String getEmailCli() {
		return emailCli;
	}
	public void setEmailCli(String emailCli) {
		this.emailCli = emailCli;
	}
	public String getSituacao() {
		return Situacao;
	}
	public void setSituacao(String situacao) {
		Situacao = situacao;
	}
	
	public String toString() {
		return "Cadastro [idCli=" + idCli + ", nomeCli=" + nomeCli + ", CPFCli=" + CPFCli + ", NasCli=" + NasCli
				+ ", CEPCli=" + CEPCli + ", enderecoCli=" + enderecoCli + ", bairroCli=" + bairroCli + ", numeroCli="
				+ numeroCli + ", telefoneCli=" + telefoneCli + ", emailCli=" + emailCli + ", Situacao=" + Situacao
				+ "]";
	}
	
	
	

}
