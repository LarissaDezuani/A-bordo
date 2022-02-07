<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Atualizar cadastro cliente</title>
</head>
<body>
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

</body>
</html>