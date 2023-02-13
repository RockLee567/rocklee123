<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tìm Kiếm</title>
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
	<h1 class="heading text-center">Tìm Kiếm theo Mã Sinh Viên</h1>

	<p class="heading text-center">${ requestScope.error }</p>

	<%-- 
	<form action="timkiemsinhvien">
		Mã Sinh Viên: <input type="text" name="IDSV" /> <br> <input
			type="submit" value="Tìm Kiếm" />
	</form>
	--%>
	<form action="timkiemsinhvien" class="form-container">
		<div class="form-group">
			<label for="inputmakhoa">Tìm kiếm mã sinh viên</label> <input
				type="text" class="form-control" id="inputmakhoa"
				aria-describedby="emailHelp" placeholder="Nhập tên sinh viên"
				name="IDSV">
		</div>
		<button type="submit" class="btn btn-primary" value="Tìm Kiếm">Tìm
			kiếm</button>
	</form>
	<c:if test="${ requestScope.checkSV == false }">
		<c:set var="ds" value="${ requestScope.SV }" />
		<div class="container-fluid">
			<div class="d-flex table-containers">
				<table class="table-container">
					<thead class="bg-info">
						<tr class="tr-heading">
							<th>Tên Lớp</th>
							<th>Mã Sinh Viên</th>
							<th>Họ Tên</th>
							<th>Ngày Sinh</th>
							<th>Giới Tính</th>
							<th>Quê Quán</th>
							<th>Số điện thoại</th>
							<th>Email</th>
							<th>Bảng Điểm</th>
							<th>Cập nhật</th>
							<th>Xóa</th>

						</tr>
					</thead>

					<tr class="tr-heading">
						<th>${ ds.lop.tenLop }</th>
						<th>${ ds.maSinhVien }</th>
						<th>${ ds.tenSinhVien }</th>
						<th>${ ds.ngaySinh }</th>
						<th>${ ds.gioiTinh }</th>
						<th>${ ds.queQuan }</th>
						<th>${ ds.sdt }</th>
						<th>${ ds.email }</th>
						<th><a href="menu?action=bangDiem&ID_SV=${ ds.maSinhVien }"
							class="watch"> Xem </a></th>
						<th><a href="menu?action=capNhatSV&ID_SV=${ ds.maSinhVien }"
							class="fix"> Sửa </a></th>
						<th><a
							href="menu?action=xoaSinhVien&ID_SV=${ ds.maSinhVien }"
							class="delete"> Xóa </a></th>
					</tr>




				</table>
			</div>
		</div>
	</c:if>


	<c:if test="${ requestScope.checkSV == true }">
		<p class="heading text-center">Không tìm thấy sinh viên!</p>
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