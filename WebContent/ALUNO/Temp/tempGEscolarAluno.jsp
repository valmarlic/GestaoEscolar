<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String cepEnderecoEstudante = request.getParameter("cepEnderecoEstudante");
String complementoEnderecoEstudante = request.getParameter("complementoEnderecoEstudante");
String codigoInepEstudante = request.getParameter("codigoInepEstudante");
String nomeEstudante = request.getParameter("nomeEstudante");
%>
<table border="1">
	<tr>
	<th>Código Inep </th>
	<th>Nome do Estudante</th>
	<th> CEP Estudante</th>
	<th>Complemento  </th>
	</tr>
	<tr>
	<td><%= codigoInepEstudante %></td>
	<td><%= nomeEstudante%></td>
	<td><%= cepEnderecoEstudante %></td>
	<td><%= complementoEnderecoEstudante %></td>
	</tr>
	
	
	
</table>
</body>
</html>