<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Khoa</title>
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
	<div>
		<div class="Navbar-Container">
			<div class="d-flex gap-3 ">
				<a href="menu?action=home" class="link"> Home </a> <a
					href="menu?action=khoa" class="link"> Khoa </a> <a
					href="menu?action=monHoc" class="link"> Môn Học </a> <a
					href="menu?action=giangVien" class="link"> Giảng Viên </a> <a
					href="menu?action=timKiemSinhVien" class="link"> Tìm Kiếm Sinh
					Viên </a> <a href="menu?action=taiKhoan" class="link"> Tài Khoản </a> <a
					href="thoat" class="link"> Thoát </a>
			</div>
		</div>
		<div class="d-flex khoa-heading-container">
			<h1 class="heading">Khoa</h1>
			<c:if test="${ requestScope.checkAddKhoa == null }">
				<div class="chuyennganh-button">

					<button>
						<h2>
							<a href="menu?action=themKhoa" class="link"> Thêm Khoa </a>
						</h2>
					</button>

				</div>
			</c:if>
		</div>

		<c:if test="${ requestScope.checkAddKhoa == false }">
			<div class="container">
				<form action="themkhoa" method="post" class="form-container">
					<div class="form-group">
						<label for="inputmakhoa">Mã Khoa</label> <input type="text"
							class="form-control" id="inputmakhoa"
							aria-describedby="emailHelp" placeholder="Nhập mã khoa"
							name="maKhoa">
					</div>
					<div class="form-group">
						<label for="InputTenkhoa">Tên khoa</label> <input type="text"
							class="form-control" id="InputTenkhoa"
							placeholder="Nhập tên khoa" name="tenKhoa">
					</div>
					<button type="submit" class="btn btn-primary" value="add">Thêm</button>
				</form>
			</div>
		</c:if>

		<c:if test="${ requestScope.checkUpdateKhoa == false }">
			<div class="container">
				<form action="capnhapkhoa" method="post" class="form-container">
					<div class="form-group">
						<label for="inputmakhoa">Mã Khoa</label> <input type="text"
							class="form-control" id="inputmakhoa"
							aria-describedby="emailHelp" placeholder="Nhập mã khoa"
							name="maKhoa" value="${ requestScope.Khoa.maKhoa }" readonly>
					</div>
					<div class="form-group">
						<label for="InputTenkhoa">Tên khoa</label> <input type="text"
							class="form-control" id="InputTenkhoa"
							placeholder="Nhập tên khoa" name="tenKhoa"
							value="${ requestScope.Khoa.tenKhoa }">
					</div>
					<button type="submit" class="btn btn-primary" value=""Cậpnhập">Cập
						nhật</button>
				</form>
			</div>
		</c:if>


		</br>
		<div class="container">
			<div class="d-flex table-containers">
				<table class="table-container">
					<thead class="bg-info">
						<tr class="tr-heading">
							<th>Mã Khoa</th>
							<th>Tên Khoa</th>
							<th>Cập nhập</th>
							<th>Chuyên ngành</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<c:forEach items="${ requestScope.ListKhoa }" var="list">
						<tr class="tr-heading">
							<th>${ list.maKhoa }</th>
							<th>${ list.tenKhoa }</th>
							<th><a
								href="menu?action=capNhapKhoa&ID_Khoa=${ list.maKhoa }"
								class="fix"> Sửa </a></th>
							<th><a
								href="menu?action=chuyenNganh&ID_Khoa=${ list.maKhoa }"
								class="watch"> Xem </a></th>
							<th><a href="menu?action=xoaKhoa&ID_Khoa=${ list.maKhoa }"
								class="delete"> Xóa </a></th>
						</tr>
					</c:forEach>
				</table>
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