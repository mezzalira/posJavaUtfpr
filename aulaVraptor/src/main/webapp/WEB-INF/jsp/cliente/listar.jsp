<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Produto</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/jquery-ui.min.css" rel="stylesheet">
</head>
<body>
	<p>Pesquisar:</p>
	<form action="<c:url value="/clientes/pesquisar"/>">
		<label for="codigo">Código</label>
		<input name="codigo" id="codigo" value="${codigo}"/>
		<label for="nome">Nome</label>
		<input name="nome" id="nome" value="${nome}" autocomplete="off"/>
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
	
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/jquery-ui.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="static/js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
	    $( "#nome" ).autocomplete(
	    		{
	    			source: '<c:url value="/clientes/busca.json"/>',
	    			minLength: 2,
	    			dataType: "json",
	    			select: function( event, ui ) {
	    				$( "#nome" ).val( ui.item.nome );
	    				$( "#codigo" ).val( ui.item.codigo );
	    				return false;
	    			}
	    		}
	    	).data("ui-autocomplete")._renderItem = function( ul, item ) {
		    		return $( "<li></li>" )
		    					.data( "item.autocomplete", item )
		    					.append( "<a>" + item.codigo + " - " + item.nome + "</a>" )
		    					.appendTo( ul );
	    }
  	</script>
    
</body>
</html>