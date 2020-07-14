<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<div class="container-fluid">
<div class="row">
	<nav id="sidebarMenu"
		class="col-md-3 col-sm-2 col-lg-1 d-md-block bg-light sidebar collapse">
		<div class="sidebar-sticky pt-3">
			<ul class="nav flex-column">
				<li class="nav-item dropdown">
			        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			          Cadastros
			        </a>
			        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
				        <security:authorize access="hasRole('ROLE_USUARIOS')">
				          <a class="dropdown-item" href="${s:mvcUrl('UC#menu').build() }">Usuarios</a>
				        </security:authorize>
				        <security:authorize access="hasRole('ROLE_CLIENTES')">
				          <a class="dropdown-item" href="${s:mvcUrl('CC#menu').build() }">Clientes</a>
				        </security:authorize>
			        </div>
			    </li>
			</ul>
		</div>
	</nav>
	

