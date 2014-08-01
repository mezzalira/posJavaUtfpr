<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layout"%>
<layout:template>
	<c:forEach var="error" items="${errors}">
	    ${error.category} - ${error.message}<br />
	</c:forEach>
	<form class="form-horizontal" action="${linkTo[ClienteController].adicionar}" method="post">
		<fieldset>
			<!-- Form Name -->
			<legend>Cadastro de Cliente</legend>
			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="nome">Nome:</label>
				<div class="col-md-5">
					<input id="nome" name="cliente.nome" placeholder=""
						class="form-control input-md" required="" type="text">
				</div>
			</div>
			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="save"></label>
				<div class="col-md-4">
					<button id="save" name="save" class="btn btn-primary">Salvar</button>
				</div>
			</div>
		</fieldset>
	</form>
</layout:template>