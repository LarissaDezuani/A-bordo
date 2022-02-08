<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Atualizar cadastro cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="index.html">A-bordo</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
       <li class="nav-item">
          <a class="nav-link" href="index.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contato.html">Contato</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="destino.html">Destino</a>
        </li>
       <li class="nav-item">
          <a class="nav-link" href="cliente.html">Cadastro</a>
        </li>
        
      </ul>
     
    </div>
  </div>
</nav>
	<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Atualizar Cadastro de Cadastros</h3>
			<hr>
			<form action="CadastroUpdate" method="POST">
			
				<input value="${cadastro.idCli}" name="idCli" type="number" style="visibility:hidden">
				<div class="form-floating mb-3">
						<input value="${cadastro.nomeCli}" name="nomeCli " maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.CPFCli}" name="CPFCli" maxlength="11" type="text" class="form-control"> 
						<label>CPF (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.telefoneCli}" name="telefoneCli" maxlength="11" type="text" class="form-control"> 
						<label>Telefone (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.enderecoCli}" name="enderecoCli" maxlength="40" type="text" class="form-control"> 
						<label>endereço</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.emailCli}" name="emailCli" maxlength="11" type="email" class="form-control"> 
						<label>email</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.bairroCli}" name="bairroCli" maxlength="11" type="text" class="form-control"> 
						<label>bairro</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.CEPCli}" name="CEPCli" maxlength="8" type="text" class="form-control"> 
						<label>CEP</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${cadastro.numeroCli}" name="numeroCli" maxlength="8" type="text" class="form-control"> 
						<label>numero</label>
					</div>
					
					<select  name="Situacao" class="form-select mb-3" aria-label="Default select example">
						<option value="Inativo" selected>---Selecione a situação</option>
						<option value="Ativo">Ativo</option>
						<option value="Inativo">Inativo</option>
					</select>

					<button class="btn btn-success" type="submit">Atualizar
						Cliente</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulario</button>
			</form>
			<br>
		
			
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>