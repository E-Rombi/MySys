<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<c:url value="/resources/" var="contextPath" />

<tags:pageTemplate titulo="Usuario Menu - MySys">

	<jsp:attribute name="extraCss">
		<script type="text/javascript">
		function habilitaPermissoes() {
			
			var pacote = document.getElementsByName('checkPermissao');
		    for (var i = 0; i < pacote.length; i++){
		        if ( pacote[i].checked == true ) {
		        	result += '|' + pacote[i].value;
		        }
		    }
		    alert(result);
		    return result;
		}	
		
		</script>
	</jsp:attribute>

    <jsp:body>
    
    	 <main role="main" class="col-md-10 ml-sm-auto col-lg-11 px-md-4">
		     <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
		        <h1 class="h2">Usuários - Novo</h1>
		        <div class="btn-toolbar mb-2 mb-md-0">
		          <div class="btn-group mr-2">
		            
		          </div>
		        </div>
		      </div>
		      
		 <form:form action="${s:mvcUrl('UC#alterar').build() }" method="post" commandName="usuario" >
		 	<div class="row">
		 		<div class=" form-group col-md-12">
			 		<label>Nome</label>
			 		<form:input path="nome" type="text" placeholder="Ex: João da Silva" name="nome" class="form-control" />
			 		<form:errors path="nome" />
		 		</div>
		 		</div>
		 		<div class="row" >
			 		<div class="form-group col-md-6">
						<label>Email</label>
				 		<form:input path="email" type="email" placeholder="Ex: joao@email.com" name="email" class="form-control" />		
				 		<form:errors path="email" /> 		
			 		</div>
			 		<div class="form-group col-md-6">
			 			<label>Senha</label>
			 			<form:input path="senha" type="password" name="senha" class="form-control" />
			 			<form:errors path="senha" />
			 		</div>
		 		</div>
		 		<div class="row form-group col-md-6">
		 			<h2>Permissões</h2>
		 		</div>
		 	
		 	<div class="table-responsive ">		 	
		 		<table class="table table-striped table-dark pt-20">
			 		<thead class="thead-dark">
			 			<tr>
			 				<th scope="col" style="width: 30%;" class="h4">Nome</th>
			 				<th scope="col" style="width: 65%;" class="h4">Descrição</th>
			 				<th scope="col" style="width: 5%;"  class="h4">Habilitado</th>
			 			</tr>
			 		 <tbody>
			 		 	<c:forEach items="${roles }" var="role">
			 		 		 <tr>
							      <td class="h5">${role.nome }</td>
							      <td class="h5">${role.descricao }</td>
							      <td class="h5">
							      	<div class="form-check">
									    <input type="checkbox" data-toggle="toggle" name="checkPermissao" data-onstyle="success" data-offstyle="danger" value="${role.nome }">
								  	</div>
								  </td>
					    	 </tr>
			 		 	</c:forEach>
			 		 </tbody>		 		
		 		</table>
		 	</div>
		 	<div>
		 		<button type="submit" class="btn btn-primary">Gravar</button>
		 		<input type="hidden" value="habilitaPermissoes()" name="permissaoFinal"></input>
		 	</div>
		 
		 </form:form>
		 
		 
    
    
	</jsp:body>
	
</tags:pageTemplate>
