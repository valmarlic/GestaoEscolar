<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Visitantes</title>
</head>
<body>
	<form method="POST" action="visitanteServlet">
		<input type="hidden" name="acao" value="CREATE" /> 
		<input type="hidden" name="numerocartao" value="${fornecedor.numerocartao}" /> 
		Número do Cartão <input type="text" disabled name="numerocartao" value="${fornecedor.numerocartao}" /> <br>
		Nome <input type="text" name="nome" value="${fornecedor.nome}" /> <br>
		CPF <input type="text" name="cpf" value="${fornecedor.cpf}" /> <br>
		RG <input type="text" name="rg" value="${fornecedor.rg}" /><br>
	 	Data/Hora Entrada <input type="text" name="dataentrada" value="${fornecedor.dataentrada}" /> <br>
	 	Data/Hora Data Saida <input type="text" name="datasaida" value="${fornecedor.datasaida}" /><br>
	 	Setor Visitado <input type="text" name="setorvisitado" value="${fornecedor.setorvisitado}" /><br>
	 	Foto <input type="text" name="foto" value="${fornecedor.foto}" /><br>
	 	<a href="Upload.jsp">Inseri foto do visitante</a>
		<br> <input type="submit" value="Enviar" /><br>
	</form>

	<font color="red"><h2>${mensagem}</h2></font>

	<h4>Visitntes Cadastrados</h4>
	<table border="1">
		<tr>
			<th>Número do Cartão </th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Data/Hora Entrada</th>
			<th>Data/Hora Data Saida</th>
			<th>RG</th>
			<th>Setor Visitado</th>
			<th>Foto</th>
			<th></th>
			<th></th>
		</tr>
		<c:forEach var="f" items="${fornecedores}">
			<tr>
				<td>${f.numerocartao}</td>
				
				<td>${f.nome}</td>
				<td>${f.cpf}</td>
				<td>${f.rg}</td>
				<td>${f.dataentrada}</td>
				<td>${f.datasaida}</td>
				<td>${f.setorvisitado}</td>
				<td>${f.foto}</td>
				<td><a href=visitanteServlet?acao=RETRIEVE&numerocartao=${f.numerocartao}>Editar</a>
				<td><a href=visitanteServlet?acao=DELETE&numerocartao=${f.numerocartao}>Excluir</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>