<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			<tr>
		</thead>
		<tbody>
			<c:forEach items="${clienteList}" var="cliente">
				<tr>
					<td><a href="${linkTo[ClienteController].visualizar(cliente)}">${cliente.codigo}</a></td>
					<td>${cliente.nome}</td>
					<td>
						<form action="${linkTo[ClienteController].remover(cliente)}" method="post">
							<button type="submit" name="_method" value="DELETE">Excluir</button>
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>