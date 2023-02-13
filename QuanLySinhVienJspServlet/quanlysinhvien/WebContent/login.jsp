<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dang nhap</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<style type="text/css">
.Background {
	background-image: url(./Image/1155011.webp);
	background-repeat: no-repeat;
	background-size: cover;
	height: 100vh;
}

.container {
	max-width: 700px;
	padding: 50px;
	background-color: #fff;
	border-radius: 25px;
	box-shadow: 2px 2px 2px 1px rgba(0, 0, 0, 0.2)
}

.login-container {
	position: absolute;
	top: 50%;
	right: 0;
	left: 0;
	transform: translateY(-50%);
}

.login-heading {
	text-align: center;
	padding-bottom: 50px;
}
.form-check-container{
	justify-content: center;
	padding: 50px;
	gap: 40px;
}
.login-button{
	width: 100%;
}
</style>
</head>
<body>
	<div class="Background">
		<div class="container login-container">
			<div class="mb-3 row">
				<h1 class="login-heading">Login</h1>
				
				<form action="login" method="post">


					<div class="form-floating mb-3">
						<input type="text" class="form-control" id="inputUsername"
							placeholder="name@example.com" name="user"> <label
							for="inputUsername">User Name</label>
					</div>
					<div class="form-floating">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password" name="pass"> <label
							for="inputPassword">Password</label>
					</div>
					<div class="d-flex form-check-container">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="choose"
								id="flexRadioDefault1" value="1" checked> <label
								class="form-check-label" for="flexRadioDefault1"> Admin
							</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="choose"
								id="flexRadioDefault2" value="0"> <label
								class="form-check-label" for="flexRadioDefault2"> Sinh
								viên </label>
						</div>
					</div>
					<button type="submit" class="btn btn-primary mb-3 login-button">Đăng
						nhập</button>
				</form>
				
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.min.js"
		integrity="sha384-IDwe1+LCz02ROU9k972gdyvl+AESN10+x7tBKgc9I5HFtuNz0wWnPclzo6p9vxnk"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
		crossorigin="anonymous"></script>
</body>
</html>