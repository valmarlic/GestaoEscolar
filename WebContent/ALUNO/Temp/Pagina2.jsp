<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <form action="ALUNO/Temp/Pagina3.jsp">
   <input type="hidden" name="nome" value="${cliente1.nome}" />
   <input type="submit" value="Enviar">
</form>

    Olá ${cliente1.nome}<p>
    Caso você queira ir para pagina 3 , clique aqui:<br>
    <form action="ALUNO/Temp/Pagina3.jsp">
 
<!-- ???? o que eu posso colocar aqui para enviar o ${cliente1.nome} para a pagina 3  -->
 
        <input type="submit" value="Enviar">
    </form>
</body>
</html>