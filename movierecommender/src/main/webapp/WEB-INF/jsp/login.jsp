<html>
<head>
<title>Simple Web Application</title>
</head>
<body>
	<center>
		<h1>Welcome to Spring Boot Login Page</h1>

		<h2>Login To Proceed</h2>
		<font color="red">${errorMessage}</font>
		<form method="post" action="/login">
			User Name : <input type="text" name="username" /><br>
			<br> Password : <input type="password" name="password" /><br>
			<br> <input type="submit" />
		</form>
	</center>
</body>
</html>
