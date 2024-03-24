<%@page import="com.akhil.products.ProductDao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" rel="stylesheet"/>
	<script src="formvalidation.js"></script>
<meta charset="ISO-8859-1">
<title>Form Edit</title>
</head>
<body>
	<div class="container mt-5 text-center">
		<h2 class="text-center font-italic mb-1">UPDATE PRODUCTS DATA....</h2>

		<form method="post" action="./AddProductServlet" enctype="multipart/form-data"
			onsubmit="return validateForm()">

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proId">PRODUCT
					ID:</label> <input type="text" class="form-control-sm" id="proId"
					name="proId" value="${existingproduct.proId}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proName">PRODUCT
					NAME:</label> <input type="text" class="form-control-sm" id="proName"
					name="proName" value="${existingproduct.proName}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proPrice">PRODUCT
					PRICE:</label> <input type="number" class="form-control-sm" id="proPrice"
					name="proPrice" value="${existingproduct.proPrice}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proBrand">PRODUCT
					BRAND:</label> <input type="text" class="form-control-sm" id="proBrand"
					name="proBrand" value="${existingproduct.proBrand}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMadeIn">PRODUCT
					MADE IN:</label> <input type="text" class="form-control-sm" id="proMadeIn"
					name="proMadeIn" value="${existingproduct.proMadeIn}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proMnfgDate">PRODUCT
					MNFG DATE:</label> <input type="date" class="form-control-sm"
					id="proMnfgDate" name="proMnfgDate" value="${existingproduct.proMnfgDate}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proExpDate">PRODUCT
					EXP DATE:</label> <input type="date" class="form-control-sm"
					id="proExpDate" name="proExpDate" value="${existingproduct.proExpDate}" required>
			</div>

			<div class="form-group">
				<label class="font-italic font-weight-bold" for="proImage">PRODUCT
					IMAGE:</label> <input type="file" class="form-control-file-sm"
					id="proImage" name="proImage" value="${existingproduct.proImage}" accept="image/*" required>
			</div>
-
			<div>
				<input type="submit" class="btn btn-success" value="save product" />
				<a href="productList.jsp" class="btn btn-primary">List of
					Products</a>
			</div>
			</form>
			</div>
</body>
</html>