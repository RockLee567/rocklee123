<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nhập Điểm</title>
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
	<p>
		<a href="khoa"> Khoa ${ applicationScope.Ten_Khoa } </a>
	</p>
	<p>
		<a href="chuyennganh"> Chuyên Ngành ${ applicationScope.Ten_CN } </a>
	</p>
	<p>
		<a href="sinhvien"> Lớp ${ applicationScope.Ten_Lop } </a>
	</p>

	<h1 class="heading text-center">Nhập Điểm</h1>

	<h2 class="heading text-center">${ requestScope.error }</h2>
	<%-- 
	<form action="diem">
		Mã Sinh Viên: <input type="text" name="MSV"
			value="${ requestScope.MSV }" readonly /> </br> Môn Học: <select
			name="maMonHoc">
			<c:forEach var="MH" items="${ requestScope.MonHoc }">
				<option value="${ MH.maMonHoc }">${ MH.tenMonHoc }</option>
			</c:forEach>
		</select> </br> Giảng Viên: <select name="maGiangVien">
			<c:forEach var="GV" items="${ requestScope.GiangVien }">
				<option value="${ GV.maGV }">${ GV.tenGV }</option>
			</c:forEach>
		</select> </br> Học Kỳ: <select name="maHocKy">
			<c:forEach var="HK" items="${ requestScope.HocKy }">
				<option value="${ HK.maHocKy }">${ HK.tenHocKy }</option>
			</c:forEach>
		</select> </br> Năm Học: <select name="maNamHoc">
			<c:forEach var="NH" items="${ requestScope.NamHoc }">
				<option value="${ NH.maNamHoc }">${ NH.tenNamHoc}</option>
			</c:forEach>
		</select> </br> Điểm: <input type="text" name="diem" /> </br> <input type="submit"
			value="Xác Nhận" />
	</form>
	--%>
	<form action="diem" class="form-container">
		<div class="form-group">
			<label for="inputmakhoa">Mã Sinh Viên</label> <input type="text"
				class="form-control" id="inputmakhoa" aria-describedby="emailHelp"
				placeholder="Nhập mã khoa" name="MSV" value="${ requestScope.MSV }"
				readonly>
		</div>
		<label for="inputmonhoc">Môn học</label> <select class="form-select"
			aria-label="Default select example" name="maMonHoc" id="inputmonhoc">
			<c:forEach var="MH" items="${ requestScope.MonHoc }">
				<option value="${ MH.maMonHoc }">${ MH.tenMonHoc }</option>
			</c:forEach>
		</select> <label>Giảng Viên</label> <select class="form-select"
			aria-label="Default select example" name="maGiangVien">
			<c:forEach var="GV" items="${ requestScope.GiangVien }">
				<option value="${ GV.maGV }">${ GV.tenGV }</option>
			</c:forEach>
		</select> <label>Học Kỳ</label> <select class="form-select"
			aria-label="Default select example" name="maHocKy">
			<c:forEach var="HK" items="${ requestScope.HocKy }">
				<option value="${ HK.maHocKy }">${ HK.tenHocKy }</option>
			</c:forEach>
		</select> <label>Năm Học</label> <select class="form-select"
			aria-label="Default select example" name="maNamHoc">
			<c:forEach var="NH" items="${ requestScope.NamHoc }">
				<option value="${ NH.maNamHoc }">${ NH.tenNamHoc}</option>
			</c:forEach>
		</select>
		<div class="form-group">
			<label for="InputTenkhoa">Điểm</label> <input type="text"
				class="form-control" id="InputTenkhoa" placeholder="Nhập điểm"
				name="diem" value="${ requestScope.Khoa.tenKhoa }">
		</div>
		<button type="submit" class="btn btn-primary" value="Xác Nhận">Cập
			nhật</button>
	</form>
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