<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link href="./resources/css/style.css" rel="stylesheet">
<script>
   /*  $(document).ready(function() {
		//Alternate to this function as below:
	}); */
    $(function() {
    	$("#username").focus();
		$("#add_err").css('display', 'none', 'important');
		$("#login").click(function() {
			username = $("#username").val();
			password = $("#password").val();
			$.ajax({
				type : "POST",
				url : "/login",
				data : "username=" + username + "&password=" + password,
				success : function(data) {
					alert(data);
					$("#add_err").css('display', 'none', 'important');
					$("#container").css('display', 'none', 'important');
					location.href="/admin";
				},
				beforeSend : function() {
					$("#add_err").css('display', 'inline', 'important');
					$("#add_err").html("Loading...")
				}
				
			});
			return false;
		});
	});
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="container">
		<div id="outside">
			<div class="inside">
				<form action="#" id="form_login" method="post">
					<div id="first_step">
						<br />
						<h1>
							<span>C-Gram </span>Login
						</h1>
						<div class="form">
							<input type="text" name="username" id="username" value="username" />
							<label for="username">Enter Username</label> <input
								type="password" name="password" id="password" value="password" />
							<label for="password">Enter Password</label>
						</div>
						<!-- clearfix -->
						<div class="clear"></div>
						<!-- /clearfix -->
						<input class="submit" type="submit" name="submit_first" id="login"
							value="" /><br /> <br /> <br />
						<div class="err" id="add_err"
							style="float: left; margin-left: -60px"></div>
					</div>
					<!-- clearfix -->
					<div class="clear"></div>
					<!-- /clearfix -->
				</form>
			</div>
		</div>
	</div>
</body>
</html>