<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${ requestScope.ThongTinSV.tenSinhVien }</title>
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

	<h1 class="heading text-center">Thông tin cá nhân</h1>
	<div class="chuyennganh-button">
		<button>
			<h2>
				<a href="thoat"> Thoát </a>
			</h2>
		</button>
	</div>
	<%--
	<form action="updatethongtinsv">
		Mã Sinh Viên: <input type="text" name="ID_SV"
			value="${ requestScope.ThongTinSV.maSinhVien }" readonly /> </br> Tên
		Sinh Viên: <input type="text" name="Ten_SV"
			value="${ requestScope.ThongTinSV.tenSinhVien }" readonly /> </br> Ngày
		Sinh: <input type="text" name="NgaySinh_SV"
			value="${ requestScope.ThongTinSV.ngaySinh }" readonly /> </br> Giới
		Tính: <select name="GioiTinh_SV">
			<c:if test="${ requestScope.checkGT == true }">
				<option value="Nam">Nam</option>
				<option value="Nữ">Nữ</option>
			</c:if>
			<c:if test="${ requestScope.checkGT == false }">
				<option value="Nữ">Nữ</option>
				<option value="Nam">Nam</option>
			</c:if>
		</select> </br> Quê Quán: <input type="text" name="QueQuan_SV"
			value="${ requestScope.ThongTinSV.queQuan }" /> </br> Số điện thoại: <input
			type="text" name="SDT_SV" value="${ requestScope.ThongTinSV.sdt }" />
		</br> Email: <input type="text" name="Email_SV"
			value="${ requestScope.ThongTinSV.email }" /> </br> Ten Lớp: <input
			type="text" name="MaLop"
			value=${ requestScope.ThongTinSV.lop.tenLop  } readonly /> </br> <input
			type="submit" value="Cập nhật" /> </br>
	</form>
 	--%>
	<div class="container">
		<form action="updatethongtinsv" class="form-container">
			<div class="form-group">
				<label for="inputmasinhvien">Mã Sinh Viên</label> <input type="text"
					class="form-control" id="inputmasinhvien"
					aria-describedby="emailHelp" placeholder="Nhập mã khoa"
					name="ID_SV" value="${ requestScope.ThongTinSV.maSinhVien }"
					readonly>
			</div>
			<div class="form-group">
				<label for="Inputtensinhvien">Tên Sinh Viên</label> <input
					type="text" class="form-control" id="Inputtensinhvien"
					placeholder="Nhập tên khoa" name="Ten_SV"
					value="${ requestScope.ThongTinSV.tenSinhVien }" readonly>
			</div>
			<div class="form-group">
				<label for="Inputngaysinh">Ngày Sinh</label> <input type="text"
					class="form-control" id="Inputngaysinh" placeholder="Nhập tên khoa"
					name="NgaySinh_SV" value="${ requestScope.ThongTinSV.ngaySinh }"
					readonly>
			</div>
			<label>Giới Tính</label> <select class="form-select"
				aria-label="Default select example" name="GioiTinh_SV">
				<c:if test="${ requestScope.checkGT == true }">
					<option value="Nam">Nam</option>
					<option value="Nữ">Nữ</option>
				</c:if>
				<c:if test="${ requestScope.checkGT == false }">
					<option value="Nữ">Nữ</option>
					<option value="Nam">Nam</option>
				</c:if>
			</select>
			<div class="form-group">
				<label for="Inputtensinhvien">Quê Quán</label> <input type="text"
					class="form-control" id="Inputtensinhvien"
					placeholder="Nhập tên khoa" name="QueQuan_SV"
					value="${ requestScope.ThongTinSV.queQuan }">
			</div>
			<div class="form-group">
				<label for="Inputtensinhvien">Số Điện Thoại</label> <input
					type="text" class="form-control" id="Inputtensinhvien"
					placeholder="Nhập tên khoa" name="SDT_SV"
					value="${ requestScope.ThongTinSV.sdt }">
			</div>
			<div class="form-group">
				<label for="Inputtensinhvien">Email</label> <input type="text"
					class="form-control" id="Inputtensinhvien"
					placeholder="Nhập tên khoa" name="Email_SV"
					value="${ requestScope.ThongTinSV.email }">
			</div>
			<div class="form-group">
				<label for="Inputtensinhvien">Tên Lớp</label> <input type="text"
					class="form-control" id="Inputtensinhvien"
					placeholder="Nhập tên khoa" name="MaLop"
					value=${ requestScope.ThongTinSV.lop.tenLop  } readonly>
			</div>
			<button type="submit" class="btn btn-primary" value=""Cậpnhập">Cập
				nhật</button>
		</form>
	</div>

	<p>${ requestScope.nullBD }</p>

	<c:if test="${ requestScope.BD != null }">
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

						</tr>
					</thead>
					<c:forEach var="ds" items="${ requestScope.BD }">
						<tr class="tr-heading">


							<th>${ ds.tenMonHoc }</th>
							<th>${ ds.maTinChi }</th>
							<th>${ ds.tenGV}</th>
							<th>${ ds.hocKy }</th>
							<th>${ ds.namHoc }</th>
							<th>${ ds.diem }</th>


						</tr>
					</c:forEach>


				</table>
			</div>
		</div>
	</c:if>



</body>
</html>