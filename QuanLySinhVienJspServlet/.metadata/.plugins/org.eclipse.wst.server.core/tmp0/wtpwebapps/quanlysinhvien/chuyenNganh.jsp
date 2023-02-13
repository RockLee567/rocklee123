<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chuyên Ngành</title>
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
		<h1 class="heading text-center">Khoa: ${ requestScope.Khoa.tenKhoa }</h1>

		<div class="chuyennganh-button">
			<c:if test="${ requestScope.checkAddChuyenNganh == null }">
				<button>
					<h2>
						<a
							href="menu?action=themChuyenNganh&ID_Khoa=${ requestScope.Khoa.maKhoa }"
							class="link text-center" /> Thêm Chuyên Ngành </a>
					</h2>
				</button>
			</c:if>

			<c:if test="${ requestScope.checkAddLop == null }">
				<button>
					<h2>
						<a
							href="menu?action=themLop&ID_Khoa=${ requestScope.Khoa.maKhoa }"
							class="link" /> Thêm Lớp </a>
					</h2>
				</button>
			</c:if>
		</div>

		<c:if test="${ requestScope.checkAddChuyenNganh == false }">
			<%--
			<form action="themchuyennganh" method="post">
				Mã Chuyên Ngành: <input type="text" name="ID_CN" /> </br> Tên Chuyên
				Ngành: <input type="text" name="Ten_CN" /> </br> Khoa: <input
					type="text" name="ID_Khoa" value="${ requestScope.ID  }" readonly />
				</br> <input type="submit" value="Thêm" />

			</form>
			--%>
			<div class="container">
				<form action="themchuyennganh" method="post" class="form-container">
					<div class="form-group">
						<label for="inputMachuyenganh">Mã chuyên ngành</label> <input
							type="text" class="form-control" id="inputMachuyennganh"
							aria-describedby="emailHelp" placeholder="Nhập chuyên ngành"
							name="ID_CN">
					</div>
					<div class="form-group">
						<label for="inputmakhoa">Tên chuyên ngành</label> <input
							type="text" class="form-control" id="inputmakhoa"
							aria-describedby="emailHelp" placeholder="Nhập tên chuyên ngành"
							name="Ten_CN">
					</div>
					<div class="form-group">
						<label for="InputTenkhoa">Tên khoa</label> <input type="text"
							class="form-control" id="InputTenkhoa"
							placeholder="Nhập tên khoa" name="ID_Khoa"
							value="${ requestScope.ID  }" readonly>
					</div>
					<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
				</form>
			</div>
		</c:if>


		<c:if test="${ requestScope.checkAddLop == false }">
			<%--
			<form action="themlop" method="post">
				Mã Lớp: <input type="text" name="maLop" /> </br> Tên Lớp: <input
					type="text" name="tenLop" /> </br> Chuyên Ngành: <select name="maCN">
					<c:forEach var="list" items="${ requestScope.listCN }">
						<option value="${ list.maChuyenNganh }">${ list.tenChuyenNganh }</option>
					</c:forEach>
				</select> <input type="submit" value="Thêm" />
			</form>
			--%>
			<div class="container">
				<form action="themlop" method="post" class="form-container">
					<div class="form-group">
						<label for="inputMalop">Mã Lớp</label> <input type="text"
							class="form-control" id="inputMalop" aria-describedby="emailHelp"
							placeholder="Nhập mã lớp" name="maLop">
					</div>
					<div class="form-group">
						<label for="inputtenlop">Tên Lớp</label> <input type="text"
							class="form-control" id="inputtenlop"
							aria-describedby="emailHelp" placeholder="Nhập tên lớp"
							name="tenLop">
					</div>
					<select class="form-select" aria-label="Default select example"
						name="maCN">
						<c:forEach var="list" items="${ requestScope.listCN }">
							<option value="${ list.maChuyenNganh }">${ list.tenChuyenNganh }</option>
						</c:forEach>
					</select>
					<button type="submit" class="btn btn-primary" value="Thêm">Thêm</button>
				</form>
			</div>
		</c:if>

		<c:if test="${ requestScope.checkUpdateChuyenNganh == false }">
			<p class="chuyennganh-update">Cập nhật Chuyên Ngành</p>
			<%--
		<form action="capnhatchuyennganh" method="post">
			Mã Chuyên Ngành: <input type="text" name="ID_CN"
				value="${ requestScope.ChuyenNganh.maChuyenNganh }" readonly /> </br>
			Tên Chuyên Ngành: <input type="text" name="Ten_CN"
				value="${ requestScope.ChuyenNganh.tenChuyenNganh }" /> </br> <input
				type="submit" value="Cập nhật" />
		</form>
      --%>
			<div class="container">
				<form action="capnhatchuyennganh" method="post"
					class="form-container">
					<div class="form-group">
						<label for="inputMachuyenganh">Mã chuyên ngành</label> <input
							type="text" class="form-control" id="inputMachuyennganh"
							aria-describedby="emailHelp" placeholder="Nhập chuyên ngành"
							name="ID_CN" value="${ requestScope.ChuyenNganh.maChuyenNganh }"
							readonly>
					</div>
					<div class="form-group">
						<label for="inputmakhoa">Tên chuyên ngành</label> <input
							type="text" class="form-control" id="inputmakhoa"
							aria-describedby="emailHelp" placeholder="Nhập tên chuyên ngành"
							name="Ten_CN"
							value="${ requestScope.ChuyenNganh.tenChuyenNganh }">
					</div>
					<button type="submit" class="btn btn-primary" value="Cập nhật">Cập
						nhật</button>
				</form>
			</div>

			<p class="chuyennganh-update">Cập nhật Lớp</p>
			<%--
		<form action="capnhatlop">
			<p>Sửa tên lớp ( Mã lớp trùng tên Lớp ) , mã lớp Unknown vui lòng
				tạo lớp</p>
			Mã Lớp: <input type="text" name="ID_Lop"
				value="${ requestScope.maLop }" /> </br> Tên Lớp: <input type="text"
				name="Ten_Lop" /> </br> Mã Chuyên Ngành: <input type="text" name="ID_CN"
				value="${ requestScope.ChuyenNganh.maChuyenNganh }" readonly /> </br> <input
				type="submit" value="Cập nhật" />
		</form>
 		--%>
			<div class="container">
				<form action="capnhatlop" class="form-container">
					<div class="form-group">
						<label>Sửa tên lớp ( Mã lớp trùng tên Lớp ) , mã lớp
							Unknown vui lòng tạo lớp</label> <label for="inputMalop">Mã Lớp</label> <input
							type="text" class="form-control" id="inputMalop"
							aria-describedby="emailHelp" placeholder="Nhập mã lớp"
							name="ID_Lop" value="${ requestScope.maLop }">
					</div>
					<div class="form-group">
						<label for="inputtenlop">Tên Lớp</label> <input type="text"
							class="form-control" id="inputtenlop"
							aria-describedby="emailHelp" placeholder="Nhập tên chuyên ngành"
							name="Ten_Lop">
					</div>
					<div class="form-group">
						<label for="inputMachuyenganh">Mã chuyên ngành</label> <input
							type="text" class="form-control" id="inputMachuyennganh"
							aria-describedby="emailHelp" placeholder="Nhập chuyên ngành"
							name="ID_CN" value="${ requestScope.ChuyenNganh.maChuyenNganh }"
							readonly>
					</div>
					<button type="submit" class="btn btn-primary" value="Cập nhật">Cập
						nhật</button>
				</form>
			</div>

		</c:if>
	</div>
	<c:if test="${ dieuKien == false }">
		<h4>Không có chuyên ngành</h4>
	</c:if>
	<c:if test="${ dieuKien == true }">
		<div class="container">
			<div class="d-flex table-containers">
				<table class="table-container">
					<thead class="bg-info">
						<tr class="tr-heading">
							<th>Mã Ngành</th>
							<th>Chuyên Ngành</th>
							<th>Lớp</th>
							<th>Cập nhật</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<c:forEach var="list" items="${ requestScope.listChuyenNganh }">

						<c:forEach var="lop" items="${ list.listLop }">
							<tr class="tr-heading">
								<%-- <th> ${list.khoa.tenKhoa } </th> --%>


								<th>${ list.maChuyenNganh }</th>
								<th>${ list.tenChuyenNganh }</th>


								<th><a
									href="menu?action=SV&ID_Lop=${ lop.maLop }&Ten_ChuyenNganh=${list.tenChuyenNganh }"
									class="class">${ lop.tenLop }</a></th>

								<th><a
									href="menu?action=capNhatCN&ID_ChuyenNganh=${ list.maChuyenNganh }&ID_Lop=${lop.maLop}"
									class="fix"> Sửa </a></th>

								<th><a
									href="menu?action=xoaChuyenNganh&ID_CN=${ list.maChuyenNganh }"
									class="delete"> Xóa </a></th>


							</tr>
						</c:forEach>

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