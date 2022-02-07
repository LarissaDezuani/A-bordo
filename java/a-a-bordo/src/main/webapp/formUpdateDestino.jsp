<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD Java - Atualizar Cliente</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
      <form action="CreateAndFind" method="GET" class="d-flex">
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
			<h3>Atualizar Cliente</h3>
			<hr>
			<form action="DestinoUpdate" method="POST">
					<input value="${destino.idDestino}" name="id" type="number" style="visibility:hidden">
					<div class="form-floating mb-3">
						<input value="${destino.localSaidaDestino}" name="localSaidaDestino" maxlength="40" type="text" class="form-control" id="floatingInput1"> 
						<label>localSaidaDestino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${destino.localDestino}" name="localDestino" maxlength="11" type="text" class="form-control"> 
						<label>localDestino (apenas números)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${destino.cpfCli}" name="cpfCli" type="text" class="form-control" placeholder="Nascimento">
						<label>cpfCli</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${destino.horaDestino}" name="horaDestino" type="text" class="form-control" placeholder="Nascimento">
						<label>horaDestino</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${destino.dataDestino}" name="dataDestino" type="date" class="form-control" placeholder="Nascimento">
						<label>dataDestino</label>
					</div>

					<button class="btn btn-success" type="submit">Atualizar
						Dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formulário</button>
			</form>
			<br>
		</div>
		
	</div>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>