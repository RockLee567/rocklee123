<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Giảng Viên</title>
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
	<p>${ requestScope.errorThemGiangVien  }</p>
	<p>${ requestScope.errorXoaGiangVien  }</p>
	<%-- 
	<form action="themgiangvien">
		Mã Giảng Viên: <input type="text" name="maGV" /> </br> Tên Giảng Viên:<input
			type="text" name="tenGV" /> </br> Giới Tính: <input type="text"
			name="gioiTinh" /> </br> Địa Chỉ: <input type="text" name="diaChi" /> </br>
		Số Điện Thoại: <input type="text" name="SDT" /> </br> Email: <input
			type="text" name="email" /> </br> <input type="submit" value="Thêm" />
	</form>
	--%>
	<div class="container">
		<form action="themgiangvien" class="form-container">
			<div class="form-group">
				<label for="inputgiangvien">Mã Giảng Viên</label> <input type="text"
					class="form-control" id="inputgiangvien"
					aria-describedby="emailHelp" placeholder="Nhập mã giảng viên"
					name="maGV">
			</div>
			<div class="form-group">
				<label for="inputtengiangvien">Tên Giảng Viên</label> <input
					type="text" class="form-control" id="inputtengiangvien"
					aria-describedby="emailHelp" placeholder="Nhập tên giảng viên"
					name="tenGV">
			</div>
			<div class="form-group">
				<label for="InputTenkhoa">Giới Tính</label> <input type="text"
					class="form-control" id="InputTenkhoa" placeholder="Nhập giới tính"
					name="gioiTinh">
			</div>
			<div class="form-group">
				<label for="Inputdiachi">Địa Chỉ</label> <input type="text"
					class="form-control" id="Inputdiachi" placeholder="Nhập địa chỉ"
					name="diaChi">
			</div>
			<div class="form-group">
				<label for="Inputsodienthoai">Số Điện Thoại</label> <input
					type="text" class="form-control" id="Inputsodienthoai"
					placeholder="Nhập Điện thoại" name="SDT">
			</div>
			<div class="form-group">
				<label for="Inputemail">Email</label> <input type="text"
					class="form-control" id="Inputemail" placeholder="Nhập Email"
					name="email">
			</div>
			<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
		</form>
	</div>
	<div class="container">
		<div class="d-flex table-containers">
			<table class="table-container">
				<thead class="bg-info">
					<tr class="tr-heading">
						<th>Mã Giảng Viên</th>
						<th>Tên Giảng Viên</th>
						<th>Giới Tính</th>
						<th>Địa Chỉ</th>
						<th>Số Điện Thoại</th>
						<th>Email</th>
						<th>Xóa</th>
					</tr>
				</thead>
				<c:forEach var="list" items="${ requestScope.listGV }">
					<tr class="tr-heading">
						<th>${ list.maGV }</th>
						<th>${ list.tenGV }</th>
						<th>${ list.gioiTinh }</th>
						<th>${ list.diaChi }</th>
						<th>${ list.sdt }</th>
						<th>${ list.email }</th>

						<th><a href="menu?action=xoaGiangVien&ID_GV=${ list.maGV }"
							class="delete"> Xóa </a></th>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
</body>
</html>