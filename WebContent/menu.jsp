<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>


<html>
<head>
<link href="css/menu.css" rel="stylesheet">

</head>
<meta charset="ISO-8859-1">
<title>SEMED - E-GESTÃO ESCOLAR</title>
</head>
<body id="fundoPrincipal">
	<nav class="navHorizontal">
		<img id="setaEsquerda" src="imagem/setaEsquerda.png">
		<label class="navTexto "> E-GESTÃO ESCOLAR </label> 
			


	</nav>
	<nav class="navLateral">
		<ul>
			<li><img src="imagem/chapeu.png" class="icones"> <a
				class="menuLateral" href=""> Escola</a>
				<ul>
					<li><a class="subMenuLateral">Polo</a></li>
					<li><a class="subMenuLateral">Cadastro</a></li>
					<li><a class="subMenuLateral">Pesquisa</a></li>
				</ul></li>
			<li><img src="imagem/aluno.png" class="icones"> <a
				class="menuLateral" href="">Aluno</a>
				<ul>
					<li><a class="subMenuLateral">Cadastro</a></li>
					<li><a class="subMenuLateral">Pesquisa</a></li>
				</ul></li>

			<li><img src="imagem/docente.png" class="icones"> <a
				class="menuLateral" href="">Docente</a>
				<ul>
					<li><a class="subMenuLateral">Cadastro</a></li>
					<li><a class="subMenuLateral">Pesquisa</a></li>
				</ul></li>

			<li><img src="imagem/relatorio.png" class="icones"> <a
				class="menuLateral" href="">Relatório</a>
				<ul>
					<li><a class="subMenuLateral">Escola</a></li>
					<li><a class="subMenuLateral">Aluno</a></li>
					<li><a class="subMenuLateral">Docente</a></li>
				</ul>
				</li>
		</ul>

	</nav>

	<jsp:include page="/template/footer.jsp" />
</body>
</html>