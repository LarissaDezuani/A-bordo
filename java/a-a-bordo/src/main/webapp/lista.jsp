<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Java - Lista de Clientes</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Lista de Clientes</a>
        </li>
      </ul>
      <form action="Cadastro.CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o Nome ou CPF" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Buscar</button>
      </form>
    </div>
  </div>
</nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Clientes Cadastrados</h3>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Nascimento</th>
						<th>Situação</th>
						<th>Situação</th>
						<th>Situação</th>
						<th>Situação</th>
						 
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${cadastros}" var="cadastro">
							<tr>
								<td>${cadastro.idCli}</td>
								<td>${cadastro.nomeCli}</td>
								
								<td>${cadastro.enderecoCli}</td>
								<td>${cadastro.bairroCli}</td>
								<td>${cadastro.numeroCli}</td>
								<td>${cadastro.telefoneCli}</td>
								<td>${cadastro.emailCli}</td>
								<td>${cadastro.situacao}</td>
								<td>
									<a href="CadastroDelete?clienteId=${cliente.idCli}">deletar</a> |
									<a href="CadastroUpdate?clienteId=${cliente.idCli}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="index.html">Voltar para o Cadastro de Clientes</a></h5>
		</div>
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
</body>
</html>