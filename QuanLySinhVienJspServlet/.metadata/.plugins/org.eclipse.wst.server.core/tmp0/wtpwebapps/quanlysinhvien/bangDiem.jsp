<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bảng Điểm</title>
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
	<div class="container">
		<p>
			<a href="khoa" class="link">&#8592 Khoa ${ applicationScope.Ten_Khoa }
			</a>
		</p>
		<p>
			<a href="chuyennganh" class="link">&#8592 Chuyên Ngành ${ applicationScope.Ten_CN }
			</a>
		</p>
		<p>
			<a href="sinhvien" class="link">&#8592 Lớp ${ applicationScope.Ten_Lop }
			</a>
		</p>

		<h1 class="heading text-center">MSV: ${ requestScope.SV.maSinhVien }
			- ${ requestScope.SV.tenSinhVien }</h1>

		<p>
			<a href="menu?action=nhapDiem&ID_SV=${ requestScope.SV.maSinhVien }"
				class="link"> Nhập Điểm &#8594</a>

			<c:if test="${ requestScope.listBD == null }">
				<p>${ requestScope.nullBD }</p>
			</c:if>
	</div>
	<c:if test="${ requestScope.listBD != null }">
		<div class="container">
			<div class="d-flex table-containers">
				<table class="table-container">
					<thead class="bg-info">
						<tr class="tr-heading">

							<th>Môn Học</th>
							<th>Số Tín Chỉ</th>
							<th>Giảng Viên</th>
							<th>Học Kỳ</th>
							<th>Năm Học</th>
							<th>Điểm</th>
							<th>Xóa</th>
						</tr>
					</thead>

					<c:forEach var="ds" items="${ requestScope.listBD }">
						<tr class="tr-heading">
							<th>${ ds.tenMonHoc }</th>
							<th>${ ds.maTinChi }</th>
							<th>${ ds.tenGV}</th>
							<th>${ ds.hocKy }</th>
							<th>${ ds.namHoc }</th>
							<th>${ ds.diem }</th>
							<th><a href="menu?action=xoaBangDiem&ID_BD=${ ds.maBD }"
								class="delete"> Xóa </a></th>

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