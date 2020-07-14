<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<c:url value="/resources/" var="contextPath" />

<tags:pageTemplate titulo="Clientes Menu - MySys">

    <jsp:body>
    
    	 <main role="main" class="col-md-10 ml-sm-auto col-lg-11 px-md-4">
		     <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
		        <h1 class="h1">Clientes - Novo</h1>
		        <div class="btn-toolbar mb-2 mb-md-0">
		          <div class="btn-group mr-2">
		            
		          </div>
		        </div>
		      </div>
		      
		 <form:form action="${s:mvcUrl('CC#inserir').build() }" method="post" modelAttribute="cliente" >
		 	<div class="row">
		 		<div class=" form-group col-md-1">
			 		<label>ID</label>
			 		<form:input path="id" type="number" name="id" class="form-control" readonly="true" />
			 		<form:errors path="id" />
		 		</div>
		 	
		 		<div class="input-group col-md-2 col-sm-3 mb-3">
		 			<div class="input-group">
				    	<label>Status</label>
			 		</div>
			 		<form:select cssClass="custom-select" name="status" path="status" items="${listaStatus}" itemLabel="status" ></form:select>
		 		</div>
		 		
		 		<div class="input-group col-md-3 col-sm-3 mb-3">
		 			<div class="input-group">
				    	<label>Tipo Contribuinte</label>
			 		</div>
			 		<form:select cssClass="custom-select" name="tipoContribuinte" path="tipoContribuinte" items="${listaTipoContribuinte }" itemLabel="tipoContribuinte"></form:select>
		 		</div>
		 		
		 		
		 		<div class="input-group col-md-3 col-sm-3 mb-3">
		 			<div class="input-group">
				    	<label>Regime Tributário</label>
			 		</div>
			 		<form:select cssClass="custom-select" name="tipoRegimeTributario" path="tipoRegime" items="${listaTipoRegimeTributario }" itemLabel="tipoRegimeTributario"></form:select>
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class="input-group col-md-3 col-sm-3 mb-3">
		 			<div class="input-group">
				    	<label>Tipo Pessoa</label>
			 		</div>
			 		<form:select cssClass="custom-select" name="tipoPessoa" path="tipoPessoa" items="${listaTipoPessoa }" itemLabel="tipoPessoa"></form:select>
		 		</div>
		 		<div class=" form-group col-md-3">
			 		<label>CNPJ/CPF</label>
			 		<form:input path="cnpjCpf" type="text" name="cnpjCpf" placeholder="00.000.000/0000-00" class="form-control" />
			 		<form:errors path="cnpjCpf" />
		 		</div>
		 		<div class=" form-group col-md-3">
			 		<label>IE/RG</label>
			 		<form:input path="ieRg" type="text" name="ieRg" placeholder="000.000.000.000" class="form-control" />
			 		<form:errors path="ieRg" />
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>Razão Social</label>
			 		<form:input path="razaoSocial" type="text" name="razaoSocial" placeholder="Ex: Empresa Teste LTDA" class="form-control" />
			 		<form:errors path="razaoSocial" />
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>Fantasia</label>
			 		<form:input path="fantasia" type="text" name="fantasia" placeholder="Ex: Empresa Teste" class="form-control" />
			 		<form:errors path="fantasia" />
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>E-mail</label>
			 		<form:input path="email" type="email" name="email" placeholder="Ex: empresa@teste.com" class="form-control" />
			 		<form:errors path="email" />
		 		</div>
		 	</div>		 	
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>Observação</label>
			 		<form:textarea path="observacao" type="text" name="observacao" rows="5" class="form-control" />
			 		<form:errors path="observacao" />
		 		</div>
		 	</div>
		 	
		 	<div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
		 		<h2>Endereço</h2>
		 	</div>
		 	
		 	<section class="row">
		 		<div class=" form-group col-md-1">
			 		<label>CEP</label>
			 		<form:input path="endereco.cep" type="text" placeholder="00.000-000" name="endereco.cep" class="form-control"/>
		 		</div>
		 	</section>
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>Logradouro</label>
			 		<form:input path="endereco.logradouro" type="text" name="logradouro" placeholder="Ex: Rua das calçadas" class="form-control" />
			 		<form:errors path="endereco.logradouro" />
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class=" form-group col-md-6">
			 		<label>Bairro</label>
			 		<form:input path="endereco.bairro" type="text" name="bairro" placeholder="Ex: Bairro das ruas" class="form-control" />
			 		<form:errors path="endereco.bairro" />
		 		</div>
		 		<div class=" form-group col-md-3">
			 		<label>Complemento</label>
			 		<form:input path="endereco.complemento" type="text" name="complemento" placeholder="Ex: Próximo a casa verde" class="form-control" />
			 		<form:errors path="endereco.complemento" />
		 		</div>
		 	</div>
		 	<div class="row">
		 		<div class=" form-group col-md-7">
			 		<label>Cidade</label>
			 		<form:input path="endereco.cidade" type="text" name="cidade" placeholder="Ex: Cidade dos bairros" class="form-control" />
			 		<form:errors path="endereco.cidade" />
		 		</div>
		 		<div class="input-group col-md-2 col-sm-2 mb-3">
		 			<div class="input-group">
				    	<label>UF</label>
			 		</div>
			 		<form:select cssClass="custom-select" path="endereco.uf" items="${listaEstados }" itemLabel="uf"></form:select>
		 		</div>
		 		
		 	</div>
		 	
		 	<div class="row">
		 		<div class=" form-group col-md-3">
			 		<label>Fone</label>
			 		<form:input path="endereco.fone" type="text" name="fone" placeholder="(00) 0000-0000" class="form-control" />
			 		<form:errors path="endereco.fone" />
		 		</div>
		 		<div class=" form-group col-md-3">
			 		<label>Fone Outro</label>
			 		<form:input path="endereco.foneOutro" type="text" name="foneOutro" placeholder="(00) 0000-0000" class="form-control" />
			 		<form:errors path="endereco.foneOutro" />
		 		</div>
		 		<div class=" form-group col-md-3">
			 		<label>Celular</label>
			 		<form:input path="endereco.celular" type="text" name="celular" placeholder="(00) 0000-0000" class="form-control" />
			 		<form:errors path="endereco.celular" />
		 		</div>
		 	</div>
		 	
		 	<div class="row">
		 		<div class=" form-group col-md-9">
			 		<label>Observação</label>
			 		<form:textarea path="endereco.observacao" type="text" name="observacao" rows="5" class="form-control" />
			 		<form:errors path="endereco.observacao" />
		 		</div>
		 	</div>
		 	
		 	
		 	<div>
		 		<button type="submit" class="btn btn-primary">Gravar</button>
		 		<input type="hidden" value="habilitaPermissoes()" name="permissaoFinal"></input>
		 	</div>
		 
		 </form:form>
		 
		 
    
    
	</jsp:body>
	
</tags:pageTemplate>
