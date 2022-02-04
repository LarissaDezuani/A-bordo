

USE abordo;

CREATE TABLE cadastros(
idCli int not null auto_increment primary key,
nomeCli VARCHAR(50),
CPFCli CHAR(11),
NasCli date,
CEPCli VARCHAR(8),
enderecoCli VARCHAR(40),
bairroCli VARCHAR(40),
numeroCli VARCHAR(8),
telefoneCli CHAR(13),
emailCli VARCHAR(40),
Situacao char(7)
);
CREATE TABLE contatos(
idContato int not null auto_increment primary key,
nomeContato VARCHAR(50),
emailContato VARCHAR(40),
msgContato VARCHAR(100)
);
CREATE TABLE destinos(
idContato int not null auto_increment primary key,
localSaidaDestino VARCHAR(50),
localDestino VARCHAR(50),
CPFCli CHAR(11),
horaDestino VARCHAR(10),
dataDestino date
);


