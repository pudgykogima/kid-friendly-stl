<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${USER.administrator == true ? 'Admin' : 'User' } Profile</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link type="text/css"  rel="stylesheet" href="css/bootstrap-theme.min.css" /><link type="text/css"  rel="stylesheet" href="css/bootstrap-theme.min.css.map" /><link type="text/css"  rel="stylesheet" href="css/bootstrap.min.css" /><link type="text/css"  rel="stylesheet" href="css/bootstrap.min.css.map" /><link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.min.css"/><link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/autofill/2.1.3/css/autoFill.bootstrap.css"/><link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.1.0/css/responsive.bootstrap.min.css"/>
	<script src="js/jquery-3.1.1.js" type="text/javascript"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/1.10.13/js/dataTables.bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/autofill/2.1.3/js/dataTables.autoFill.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/autofill/2.1.3/js/autoFill.bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/responsive/2.1.0/js/dataTables.responsive.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/responsive/2.1.0/js/responsive.bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.2.4/js/dataTables.buttons.min.js"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	
</head>
<body>
	<div class="container">
<!-- NAVBAR -->
		<div class="row">
			<div class="col-sm-12">
				<jsp:include page="navbar.jsp" />
			</div>
		</div>
<!-- PAGE HEADING -->
	<br /><br /><br />
		<div class="row">
			<div class="col-sm-12">
				<h1>Kid Friendly STL</h1>
				<h1><small>${USER.administrator == true ? 'Admin' : 'User' } Profile</small></h1>
			</div>
		</div>
		<br />
<!-- RESULTS TABLE -->
		<div class="row">
			<div class="col-sm-12">
				<p>${USER.userID}</p>
				<p>${USER.administrator}</p>
				<p>${USER.email}</p>
			</div>
		</div>
	</div>
</body>
</html>