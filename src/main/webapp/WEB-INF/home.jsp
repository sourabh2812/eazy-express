
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="header.jsp" />
<body>

	<div class="container">
		<a href="login" name="clientlogin" id="clientlogin">Client Login</a>

		<form action="/login" method="post">
			<h1 class="h3 mb-3 font-weight-normal">Sign in</h1>

			<label for="userName" class="sr-only">Username</label> 
			
			<input type="text" id="userName" name="userName" class="form-control"
				placeholder="Username" required autofocus>
				
			<label for="password" class="sr-only">Password</label>
			
			<input type="password" id="password" name="password" class="form-control"
				placeholder="Password" required>
			
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>
	</div>

</body>
</html>
