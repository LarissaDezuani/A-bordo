package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "cadastro")
public class Cadastro {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "nome")
private String nome;

@Column(name = "cpf")
private String cpf;

@Column(name = "nascimento")
private Date nascimento;


public Cadastro() {

}

public Cadastro(String nome, String cpf, Date nascimento) {
super();
this.nome = nome;
this.cpf = cpf;
this.nascimento = nascimento;
}
public long getId() {
return id;
}
public void setId(long id) {
this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public Date getNascimento() {
	return nascimento;
}

public void setNascimento(Date nascimento) {
	this.nascimento = nascimento;
}


}