package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "destino")
public class Destino {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "localSaidaDestino")
private String localSaidaDestino;

@Column(name = "localDestino")
private String localDestino;

@Column(name = "horaDestino")
private String horaDestino;

@Column(name = "dataDestino")
private Date dataDestino;


public Destino() {

}

public Destino(String localSaidaDestino, String localDestino, String horaDestino,Date dataDestino) {
super();
this.localSaidaDestino = localSaidaDestino;
this.localDestino = localDestino;
this.horaDestino = horaDestino;
this.dataDestino = dataDestino;
}
public long getIdD() {
return id;
}
public void setIdD(long id) {
this.id = id;
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

public String getHoraDestino() {
	return horaDestino;
}

public void setHoraDestino(String horaDestino) {
	this.horaDestino = horaDestino;
}

public Date getDataDestino() {
	return dataDestino;
}

public void setDataDestino(Date dataDestino) {
	this.dataDestino = dataDestino;
}


}