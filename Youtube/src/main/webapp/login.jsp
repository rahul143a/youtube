<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Login From Dsign</title>
	<link rel="stylesheet" type="text/css" href="style8.css">
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

	<div class="loginbox">
		<img src="lovv.png" class="lovv">
		<h1>Login Here</h1>
		<form method="post" action="loginyoutube" >
			<p>UserName</p>
			<input type="text" name="username" placeholder="Enter Username">
		<p>Password</p>
		<input type="Password" name="password" placeholder="Enter Password">
	<button type="submit"> Login</button></a>
		<a href="#">Forgot Password</a><br>
		<a href="register1.jsp">Create New Account</a>
		</form>
	</div>
				
				<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
	
<script type="text/javascript">

var status =document.getElementById("status").value;

if (status == "faild") {
	swal("Sorry","Wrong UserName And Password ","error")
}
	</script>

</body>
</html>