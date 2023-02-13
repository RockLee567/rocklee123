<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tài Khoản</title>
<link href="./style.css" rel="stylesheet">
<link href="./table.css" rel="stylesheet">
<link href="./form.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body>
	<div class="Navbar-Container">
		<div class="d-flex gap-3">
			<a href="menu?action=home" class="link"> Home </a> <a
				href="menu?action=khoa" class="link"> Khoa </a> <a
				href="menu?action=monHoc" class="link"> Môn Học </a> <a
				href="menu?action=giangVien" class="link"> Giảng Viên </a> <a
				href="menu?action=timKiemSinhVien" class="link"> Tìm Kiếm Sinh
				Viên </a> <a href="menu?action=taiKhoan" class="link"> Tài Khoản </a> <a
				href="thoat" class="link"> Thoát </a>
		</div>
	</div>
	<p class="heading text-center">ADMIN</p>
	<c:if test="${ requestScope.checkAdd == false }">
		<%-- 
		<form action="themtaikhoanadmin" method="post">
			Tài Khoản: <input type="text" name="user" /> </br> Mật Khẩu: <input
				type="text" name="pass" /> </br> Vai trò: <select name="role">
				<option value="1">Admin</option>
			</select> </br> <input type="submit" value="Thêm" /> </br>
		</form>
		--%>
		<form action="themtaikhoanadmin" method="post" class="form-container">
			<div class="form-group">
				<label for="inputmakhoa">Tài khoản</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập tên user" name="user">
			</div>
			<div class="form-group">
				<label for="inputmakhoa">Mật khẩu</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập mật khẩu" name="pass">
			</div>
			<div class="form-group">
				<label>Vai trò</label> <select class="form-select"
					aria-label="Default select example" name="role">
					<option value="1">Admin</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
		</form>
	</c:if>

	<c:if test="${ requestScope.checkUpdate == false }">
		<%-- 
		<form action="updatematkhauadmin" method="post">
			Tài Khoản: <input type="text" name="user" value="${ acc.username }"
				readonly /> </br> Mật Khẩu: <input type="text" name="pass"
				value="${ acc.password }" /> </br> Vai trò: <select name="role">
				<option value="1">Admin</option>
			</select> </br> <input type="submit" value="Đổi" /> </br>
		</form>
		--%>
		<form action="updatematkhauadmin" method="post" class="form-container">
			<div class="form-group">
				<label for="inputmakhoa">Tài khoản</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập tên user" name="user" value="${ acc.username }">
			</div>
			<div class="form-group">
				<label for="inputmakhoa">Mật khẩu</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập mật khẩu" name="pass" value="${ acc.password }">
			</div>
			<div class="form-group">
				<label>Vai trò</label> <select class="form-select"
					aria-label="Default select example" name="role">
					<option value="1">Admin</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary" value="Đổi">Đổi</button>
		</form>
	</c:if>


	<div class="chuyennganh-button">

		<button>
			<h2>
				<a href="menu?action=themTKAdmin" class="link"> Thêm Tài Khoản </a>
			</h2>
		</button>

	</div>

	<div class="container">
		<div class="d-flex table-containers">
			<table class="table-container">
				<thead class="bg-info">
					<tr class="tr-heading">
						<th>Tài Khoản</th>
						<th>Mật Khẩu</th>
						<th>Đổi mật khẩu</th>
						<th>Xóa Tài Khoản</th>
					</tr>
				</thead>
				<c:forEach var="ds" items="${ requestScope.accAdmin  }">
					<tr class="tr-heading">
						<th>${ ds.username }</th>
						<th>${ ds.password }</th>
						<th><a
							href="menu?action=doiMK&username=${ ds.username }&password=${ ds.password }"
							class="fix"> Đổi </a></th>
						<th><a href="menu?action=xoaAccountAdmin&id=${ ds.id }"
							class="delete"> Xóa </a></th>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>





	<c:if test="${ requestScope.checkUpdateSV == false }">
		<form action="updatematkhausinhvien" method="post">
			Tài Khoản: <input type="text" name="user" value="${ acc.username }"
				readonly /> </br> Mật Khẩu: <input type="text" name="pass"
				value="${ acc.password }" /> </br> Vai trò: <select name="role">
				<option value="0">Sinh Viên</option>
			</select> </br> <input type="submit" value="Đổi" /> </br>
		</form>

		<form action="updatematkhausinhvien" method="post"
			class="form-container">
			<div class="form-group">
				<label for="inputmakhoa">Tài khoản</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập tên user" name="user" value="${ acc.username }"
					readonly>
			</div>
			<div class="form-group">
				<label for="inputmakhoa">Mật khẩu</label> <input type="text"
					class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
					placeholder="Nhập mật khẩu" name="pass" value="${ acc.password }">
			</div>
			<div class="form-group">
				<label>Vai trò</label> <select class="form-select"
					aria-label="Default select example" name="role">
					<option value="1">Sinh Viên</option>
				</select>
			</div>
			<button type="submit" class="btn btn-primary" value="Đổi">Đổi</button>
		</form>
	</c:if>

	<c:if test="${ requestScope.checkNullSV == false }"><a href="thoat"> Thoát </a>

		<p class="heading text-center pdt-5">SINH VIÊN</p>

		<div class="container">
			<div class="d-flex table-containers">
				<table class="table-container">
					<thead class="bg-info">
						<tr class="tr-heading">
							<th>Tài Khoản</th>
							<th>Mật Khẩu</th>
							<th>Đổi mật khẩu</th>

						</tr>
					</thead>
					<c:forEach var="dsSV" items="${ requestScope.accSinhVien  }">
						<tr class="tr-heading">
							<th>${ dsSV.username }</th>
							<th>${ dsSV.password }</th>
							<th><a
								href="menu?action=doiMKSV&username=${ dsSV.username }&password=${ dsSV.password }" class="fix">
									Đổi </a></th>

						</tr>
					</c:forEach>

				</table>
			</div>
		</div>
	</c:if>

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