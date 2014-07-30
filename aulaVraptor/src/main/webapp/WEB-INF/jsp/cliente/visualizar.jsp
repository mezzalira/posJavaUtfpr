<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar produto</title>
</head>
<body>
	<form action="${linkTo[ClienteController].alterar(cliente)}" method="post">
		<input type="hidden" name="cliente.codigo" id="cliente-codigo" value="${cliente.codigo}"/>
		<input type="text"  name="cliente.nome" id="cliente-nome" value="${cliente.nome}"/>
		<button type="submit" name="_method" value="PUT">Salvar</button>
	</form>
</body>
</html>