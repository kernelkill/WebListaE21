<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema de Cadastro - Aluno</title>
</head>
<body>

	<h1 style="text-align: center;">Cadastrando Novo Aluno</h1>

	<form method="post" action="alunocontroller.do" style="margin: auto; width: 500px;">
	
	<label>Nome: </label>
	<input type="text" id="idNome" name="aluno" >
	<br/>
	
	<label>Nota: </label>
	<input type="text" id="idNota" name="nota">
	<br>
	
	<input type="submit" value="Salvar">
	</form>
	
</body>
</html>