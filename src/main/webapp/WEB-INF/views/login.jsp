<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<c:url value="/resources/" var="contextPath" />

<head>
		<link rel="stylesheet" href="${contextPath }css/bootstrap.min.css" />
		<link href="${contextPath }css/signin.css" rel="stylesheet">
		<script src="${contextPath }js/bootstrap.min.js" ></script>
		<script src="${contextPath }jquery-3.5.1.slim.min.js"></script>
		<script src="${contextPath }popper.min.js" ></script>
</head>

<body>

  <form:form servletRelativeAction="/login" class="form-signin">
	  <img class="mb-4" src="${contextPath }imagens/logo.png" alt="" width="72" height="72">
	  <h1 class="h3 mb-3 font-weight-normal">Login</h1>
	  <label for="inputEmail" class="sr-only">Email</label>
	  <input type="email" name="username" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
	  <label for="inputPassword" class="sr-only">|Senha</label>
	  <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
	  <div class="checkbox mb-3">
	    <label>
	      <input type="checkbox" value="remember-me"> Lembre-se de mim
	    </label>
	  </div>
	  <button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
	  <p class="mt-5 mb-3 text-muted">&copy; 2017-2020</p>
  </form:form>
	
</body>
