<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Môn Học</title>
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
	<p class="heading text-center">${ requestScope.errorThemMonHoc  }</p>
	<p>${ requestScope.errorXoaMonHoc  }</p>
	<%--
	<form action="themmonhoc">
		Mã Môn Hoc: <input type="text" name="maMH" /> </br> Tên Môn Học: <input
			type="text" name="tenMH" /> </br> Số tín chỉ: <input type="text"
			name="soTinChi" /> </br> <input type="submit" value="Thêm" />
	</form>
	--%>
	<div class="container">
		<form action="themmonhoc" class="form-container">
			<div class="form-group">
				<label for="inputmamonhoc">Mã Môn Học</label> <input type="text"
					class="form-control" id="inputmamonhoc"
					aria-describedby="emailHelp" placeholder="Nhập mã môn học"
					name="maMH">
			</div>
			<div class="form-group">
				<label for="Inputtenmonhoc">Tên Môn Học</label> <input type="text"
					class="form-control" id="Inputtenhoc"
					placeholder="Nhập tên môn học" name="tenMH">
			</div>
			<div class="form-group">
				<label for="Inputtinchi">Số Tín Chỉ</label> <input type="text"
					class="form-control" id="Inputtinchi" placeholder="Nhập số tín chỉ"
					name="soTinChi">
			</div>
			<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
		</form>
	</div>
	<div class="container">
		<div class="d-flex table-containers">
			<table class="table-container">
				<thead class="bg-info">
					<tr class="tr-heading">
						<th>Mã Môn Hoc</th>
						<th>Môn Hoc</th>
						<th>Số Tín Chỉ</th>
						<th>Xóa</th>
					</tr>
				</thead>
				<c:forEach var="list" items="${ requestScope.listMH }">
					<tr class="tr-heading">
						<th>${ list.maMonHoc }</th>
						<th>${ list.tenMonHoc }</th>
						<th>${ list.soTinChi }</th>
						<th><a href="menu?action=xoaMonHoc&ID_MH=${ list.maMonHoc }"
							class="delete"> Xóa </a></th>
					</tr>
				</c:forEach>

			</table>
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