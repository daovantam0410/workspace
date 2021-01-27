<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Chi tiết TKB</title>
</head>
<body>
	<div>
		<p style="text-align: center;">
		<c:forEach var="hs" items="${listStudent}">
			<label>Msv: </label><c:out value="${hs.mSV }"/> - <label>Ho ten: </label><c:out value="${hs.hoTen }"/>
		</c:forEach>
		</p>
	</div>
	<div align="center">
		<table style="border: 1px solid black; border-collapse: collapse;"
			cellpadding="6">
			<tr>
				<th>STT</th>
				<th>Mon hoc</th>
				<th>Thu</th>
				<th>Tiet BD</th>
				<th>So tiet</th>
				<th>Giang duong</th>
				<th>Tuan hoc</th>
			</tr>
			<c:forEach var="item" items="${list}">
				<tr>
					<td><c:out value="${item.id}" /></td>
					<td><c:out value="${item.monHoc}" /></td>
					<td><c:out value="${item.thu}" /></td>
					<td><c:out value="${item.tietBatDau}" /></td>
					<td><c:out value="${item.soTiet}" /></td>
					<td><c:out value="${item.giangDuong}" /></td>
					<td><c:out value="${item.tuanHoc}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>