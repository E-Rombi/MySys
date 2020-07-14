<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<c:url value="/resources/" var="contextPath" />

<tags:pageTemplate titulo="Cliente Menu - MySys">

    <jsp:body>
    	
    <main role="main" class="col-md-10 ml-sm-auto col-lg-11 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Clientes - Menu</h1>
        <div class="btn-toolbar mb-2 mb-md-0">
          <div class="btn-group mr-2">
	            <a href="${s:mvcUrl('CC#novo').build() }" />
	            	<svg class="bi bi-plus-square-fill cor-padrao" width="3em" height="3em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
					  <path fill-rule="evenodd" d="M2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2zm6.5 4a.5.5 0 0 0-1 0v3.5H4a.5.5 0 0 0 0 1h3.5V12a.5.5 0 0 0 1 0V8.5H12a.5.5 0 0 0 0-1H8.5V4z"/>
					</svg>
	            </a>
          </div>
        </div>
      </div>

    
    	<section class="table-responsive">
		    	<table class="table table-striped table-dark">
				  <thead class="thead-dark">
				    <tr >
				      <th scope="col"  style="width: 5%;  color: #CCC;" class="h5" >ID</th>
				      <th scope="col"  style="width: 35%; color: #CCC;" class="h5">Razão Social</th>
				      <th scope="col"  style="width: 35%; color: #CCC;" class="h5">Fantasia</th>
				      <th scope="col"  style="width: 10%; color: #CCC;" class="h5">CNPJ/CPF</th>
				      <th scope="col"  style="width: 10%;  color: #CCC;" class="h5">IE/RG</th>
				      <th scope="col"  style="width: 5%;  color: #CCC;" class="h5">UF</th>
				    </tr>
				  </thead>
				  <tbody>
				    <c:forEach items="${clientes }" var="cliente">
					    <tr>
					      <th class="h5">${cliente.id }</th>
					      <td class="h5">${cliente.razaoSocial }</td>
					      <td class="h5">${cliente.fantasia }</td>
					      <td class="h5">${cliente.cnpjCpf }</td>
					      <td class="h5">${cliente.ieRg }</td>
					      <td class="h5">${cliente.endereco.uf }</td>
					      <td>
					      	<a href="${s:mvcUrl('CC#edit').arg(0, cliente.id).build() }">
						      	<svg class="bi bi-pencil-square cor-padrao" width="3em" height="3em" style="color: #CCC;" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
									  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456l-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"/>
									  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5v11z"/>
								</svg>
							</a>
						  </td>
					      <td>
					      	  <a href="${s:mvcUrl('CC#delete').arg(0, cliente.id).build() }">
						      	<svg class="bi bi-dash-square" width="3em" height="3em" style="color: #CCC;"  viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
								  <path fill-rule="evenodd" d="M14 1H2a1 1 0 0 0-1 1v12a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V2a1 1 0 0 0-1-1zM2 0a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V2a2 2 0 0 0-2-2H2z"/>
								  <path fill-rule="evenodd" d="M3.5 8a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 0 1H4a.5.5 0 0 1-.5-.5z"/>
								</svg>
					      	  </a>
					      </td>
				    	</tr>
				    </c:forEach>
				  </tbody>
				</table>
		</section>
    
	</jsp:body>
	
</tags:pageTemplate>
