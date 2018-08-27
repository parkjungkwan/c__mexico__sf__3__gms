<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<link rel="shortcut icon" href="${context}/resources/img/favicon.ico" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${context}/resources/css/style.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
 <script src="${context}/resources/js/app.js"></script> 
</head>
<body>
<div id="wrapper">
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div> 
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div> 
	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div> 
	<div id="footer">
		 <tiles:insertAttribute name="footer"/>
	</div>
</div>	
<script>
app.init('${context}');
</script>
</body>
</html>





