<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lớp</title>
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
			<a href="khoa" class="link"> &#8592 Khoa ${ applicationScope.Ten_Khoa }
			</a>
		</p>
		<p>
			<a href="chuyennganh" class="link"> &#8592 Chuyên Ngành ${ applicationScope.Ten_CN }
			</a>
		</p>
	</div>
	<h1 class="heading text-center">Lớp: ${ requestScope.lopK.tenLop }</h1>

	<h2 class="heading text-center ">${ requestScope.nullSV }</h2>

	<div class="chuyennganh-button">
		<c:if test="${ requestScope.checkAddSinhVien == null }">
			<button>
				<h2>
					<a
						href="menu?action=themSinhVien&ID_Lop=${ requestScope.lopK.maLop }">
						Thêm Sinh Viên </a>
				</h2>
			</button>
		</c:if>
		<button>
			<h2>
				<a href="menu?action=xoaLop&ID_Lop=${requestScope.lopK.maLop}">
					Xóa Lớp </a>
			</h2>
		</button>
	</div>
	<c:if test="${ requestScope.checkAddSinhVien == false }">
		<%--
		<p>${ requestScope.errorSV  }</p>

		<form action="themsinhviencheck">

			Mã Sinh Viên: <input type="text" name="ID_SV" /> </br> Tên Sinh Viên: <input
				type="text" name="Ten_SV" /> </br> Ngày Sinh: <input type="text"
				name="NgaySinh_SV" /> Tháng: <input type="text" name="ThangSinh_SV" />
			Năm: <input type="text" name="NamSinh_SV" /> </br> Giới Tính: <select
				name="GioiTinh_SV">
				<option value="Nam">Nam</option>
				<option value="Nữ">Nữ</option>
			</select> </br> Quê Quán: <input type="text" name="QueQuan_SV" /> </br> Số điện thoại:
			<input type="text" name="SDT_SV" /> </br> Email: <input type="text"
				name="Email_SV" /> </br> Mã Lớp: <input type="text" name="MaLop"
				value=${ requestScope.ID_Lop_para  } readonly /> </br> <input
				type="submit" value="Thêm" /> </br>

		</form>
		--%>

		<div class="container">

			<form action="themsinhviencheck" class="form-container">
				<label>${ requestScope.errorSV  }</label>
				<div class="form-group">
					<label for="inputmasinhvien">Mã Sinh Viên</label> <input
						type="text" class="form-control" id="inputmasinhvien"
						aria-describedby="emailHelp" placeholder="Nhập mã sinh viên"
						name="ID_SV">
				</div>
				<div class="form-group">
					<label for="Inputtensinhvien">Tên Sinh Viên</label> <input
						type="text" class="form-control" id="Inputtensinhvien"
						placeholder="Nhập tên sinh viên" name="Ten_SV">
				</div>
				<div class="sinhvien-date">
					<div class="form-group">
						<label for="Inputngaysinh">Ngày Sinh</label> <input type="text"
							class="form-control" id="Inputngaysinh" placeholder="Nhập ngày"
							name="NgaySinh_SV">
					</div>
					<div class="form-group">
						<label for="Inputtensinhvien">Tháng</label> <input type="text"
							class="form-control" id="Inputtensinhvien"
							placeholder="Nhập tháng" name="ThangSinh_SV">
					</div>
					<div class="form-group">
						<label for="Inputnam">Năm</label> <input type="text"
							class="form-control" id="Inputnam" placeholder="Nhập năm"
							name="NamSinh_SV">
					</div>
				</div>
				<select class="form-select" aria-label="Default select example"
					name="GioiTinh_SV">
					<option value="Nam">Nam</option>
					<option value="Nữ">Nữ</option>
				</select>
				<div class="form-group">
					<label for="Inputquequan">Quê quán</label> <input type="text"
						class="form-control" id="Inputquequan" placeholder="Nhập quê quán"
						name="QueQuan_SV">
				</div>
				<div class="form-group">
					<label for="Inputsdt">Số điện thoại</label> <input type="tel"
						class="form-control" id="Inputsdt"
						placeholder="Nhập số điện thoại" name="SDT_SV">
				</div>
				<div class="form-group">
					<label for="Inputemail">Email</label> <input type="email"
						class="form-control" id="Inputemail" placeholder="Nhập email"
						name="Email_SV">
				</div>
				<div class="form-group">
					<label for="Inputmalop">Mã lớp</label> <input type="text"
						class="form-control" id="Inputmalop" placeholder="Nhập mã lớp"
						name="MaLop" value=${ requestScope.ID_Lop_para  } readonly>
				</div>
				<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
			</form>
		</div>

	</c:if>

	<c:if test="${ requestScope.checkUpdateSinhVien == false }">
		<p class="chuyennganh-update">Cập Nhật</p>
		<%--
		<form action="capnhatsinhvien" method="post">
			Mã Sinh Viên: <input type="text" name="maSV"
				value="${ requestScope.SV.maSinhVien}" readonly /> </br> Họ Tên: <input
				type="text" name="tenSV" value="${ requestScope.SV.tenSinhVien}" />
			</br> Ngày Sinh: <input type="text" name="NS"
				value="${ requestScope.SV.ngaySinh }" /> </br> Giới Tính: <input
				type="text" name="GT" value="${ requestScope.SV.gioiTinh }" /> </br> Quê
			Quán: <input type="text" name="QQ"
				value="${ requestScope.SV.queQuan }" /> </br> Số điện thoại: <input
				type="text" name="SDT" value="${ requestScope.SV.sdt }" /> </br> Email:
			<input type="text" name="E" value="${ requestScope.SV.email }" /> </br> <input
				type="submit" value="Chỉnh sửa" />

		</form>
		--%>
		<div class="container">

			<form action="capnhatsinhvien" method="post">
				<div class="form-group">
					<label for="inputmasinhvien">Mã Sinh Viên</label> <input
						type="text" class="form-control" id="inputmasinhvien"
						aria-describedby="emailHelp" placeholder="Nhập mã sinh viên"
						name="maSV" value="${ requestScope.SV.maSinhVien}" readonly>
				</div>
				<div class="form-group">
					<label for="Inputtensinhvien">Tên Sinh Viên</label> <input
						type="text" class="form-control" id="Inputtensinhvien"
						placeholder="Nhập tên sinh viên" name="tenSV"
						value="${ requestScope.SV.tenSinhVien}">
				</div>
				<div class="sinhvien-date">
					<div class="form-group">
						<label for="Inputngaysinh">Ngày Sinh</label> <input type="text"
							class="form-control" id="Inputngaysinh" placeholder="Nhập ngày"
							name="NS" value="${ requestScope.SV.ngaySinh }">
					</div>
					<%--
					<div class="form-group">
						<label for="Inputtensinhvien">Tháng</label> <input type="text"
							class="form-control" id="Inputtensinhvien"
							placeholder="Nhập tháng" name="ThangSinh_SV">
					</div>
					<div class="form-group">
						<label for="Inputnam">Năm</label> <input type="text"
							class="form-control" id="Inputnam" placeholder="Nhập năm"
							name="NamSinh_SV">
					</div>
					 --%>
				</div>
				<%--
				<select class="form-select" aria-label="Default select example"
					name="GioiTinh_SV">
					<option value="Nam">Nam</option>
					<option value="Nữ">Nữ</option>
				</select>
				--%>
				<div class="form-group">
					<label for="Inputgioitinh">Giới Tính</label> <input type="text"
						class="form-control" id="Inputgioitinh"
						placeholder="Nhập giới tính" name="GT"
						value="${ requestScope.SV.gioiTinh }">
				</div>
				<div class="form-group">
					<label for="Inputquequan">Quê quán</label> <input type="text"
						class="form-control" id="Inputquequan" placeholder="Nhập quê quán"
						name="QQ" value="${ requestScope.SV.queQuan }">
				</div>
				<div class="form-group">
					<label for="Inputsdt">Số điện thoại</label> <input type="tel"
						class="form-control" id="Inputsdt"
						placeholder="Nhập số điện thoại" name="SDT"
						value="${ requestScope.SV.sdt }">
				</div>
				<div class="form-group">
					<label for="Inputemail">Email</label> <input type="email"
						class="form-control" id="Inputemail" placeholder="Nhập email"
						name="E" value="${ requestScope.SV.email }">
				</div>
				<%--
				<div class="form-group">
					<label for="Inputmalop">Mã lớp</label> <input type="text"
						class="form-control" id="Inputmalop" placeholder="Nhập mã lớp"
						name="MaLop" value=${ requestScope.ID_Lop_para  } readonly>
				</div>
				--%>
				<button type="submit" class="btn btn-primary" value="Chỉnh sửa">Thêm</button>
			</form>
		</div>
	</c:if>




	<c:if test="${ requestScope.list != null }">
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
							<th>Cập Nhật</th>
							<th>Xóa</th>

						</tr>
					</thead>
					<c:forEach var="ds" items="${ requestScope.list }">
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
					</c:forEach>
				</table>
			</div>
		</div>
	</c:if>
</body>
</html>