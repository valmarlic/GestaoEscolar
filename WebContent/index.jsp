
<!-- tag jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- tag jlts -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!-- link do boostrap e css -->

<link href="css/login.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Amita:wght@700&display=swap"
	rel="stylesheet">

<!-- script javascript e query -->
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<body>
	<div id="login">
		<div class="container">
			<div id="login-row"
				class="row justify-content-center align-items-center">
				<div id="login-column" class="col-md-6">
					<div id="login-box" class="col-md-12">
						<form id="login-form" class="formLogin" action="menu.jsp"
							method="post">
							<h3 class="text-center text-informacao">E-GESTÃO ESCOLAR</h3>
							<div class="form-group row">
								<label for="email_address"
									class="col-md-4 col-form-label text-md-right">CPF</label>
								<div class="col-md-6">
									<input type="text" id="email_address" class="form-control"
										class="form-control cpfs-mask" name="cpf" id="cpf"
										autocomplete="off" placeholder="CPF" name="email-address"
										required autofocus>
								</div>
							</div>

							<div class="form-group row">
								<label for="password"
									class="col-md-4 col-form-label text-md-right">SENHA</label>
								<div class="col-md-6">
									<input type="password" id="password" class="form-control"
										placeholder="SENHA" name="password" required>
								</div>
							</div>
							<div class="form-group">
								<a href="#" class="btn btn-link"> Esqueci minha senha </a> <input
									type="submit" class="btnSubmit" value="ENTRAR" />
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>

		<jsp:include page="/template/footer.jsp" />
	</div>


</body>
