<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contatos</title>
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


<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Contatos Cadastrados</h3>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Mensagem</th>
						
						 
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${contatos}" var="contato">
							<tr>
								<td>${contato.idContato}</td>
								<td>${contato.nomeContato}</td>							
								<td>${contato.emailContato}</td>
								<td>${contato.msgContato}</td>
									
								<td>
									<a href="ContatoDestroy?contatoId=${contato.idContato}">deletar</a> |
									<a href="ContatoUpdate?contatoId=${contato.idContato}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="contato.html">Voltar para o Cadastro de Contatos</a></h5>
		</div>
	</div>
</div>


</body>
</html>