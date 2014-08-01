<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
</head>
<body>
	<p>Pesquisar:</p>
	<form action="<c:url value="/clientes/pesquisar"/>">
		<label for="codigo">Código</label>
		<input name="codigo" id="codigo" value="${codigo}"/>
		<label for="nome">Nome</label>
		<input name="nome" id="nome" value="${nome}"/>
		<button type="submit">Pesquisar</button>
	</form>

	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
			</tr>
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