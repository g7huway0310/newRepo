<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
request.setAttribute("path", basePath);  
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="Creative - Bootstrap 3 Responsive Admin Template">
<meta name="author" content="GeeksLabs">
<meta name="keyword"
	content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
<link rel="shortcut icon" href="img/favicon.png">

<title>Creative - Bootstrap Admin Template</title>
<!-- Bootstrap CSS -->
<link href="${path}/NiceAdmin/css/bootstrap.min.css" rel="stylesheet">
<!-- bootstrap theme -->
<link href="${path}/NiceAdmin/css/bootstrap-theme.css" rel="stylesheet">
<!--external css-->
<!-- font icon -->
<link href="${path}/NiceAdmin/css/elegant-icons-style.css"
	rel="stylesheet" />
<link href="${path}/NiceAdmin/css/font-awesome.min.css" rel="stylesheet" />
<!-- full calendar css-->
<link
	href="${path}/NiceAdmin/assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css"
	rel="stylesheet" />
<link
	href="${path}/NiceAdmin/assets/fullcalendar/fullcalendar/fullcalendar.css"
	rel="stylesheet" />
<!-- easy pie chart-->
<link
	href="${path}/NiceAdmin/assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css"
	rel="stylesheet" type="text/css" media="screen" />
<!-- owl carousel -->
<link rel="stylesheet" href="css/owl.carousel.css" type="text/css">
<link href="${path}/NiceAdmin/css/jquery-jvectormap-1.2.2.css"
	rel="stylesheet">
<!-- Custom styles -->
<link rel="stylesheet" href="css/fullcalendar.css">
<link href="${path}/NiceAdmin/css/widgets.css" rel="stylesheet">
<link href="${path}/NiceAdmin/css/style.css" rel="stylesheet">
<link href="${path}/NiceAdmin/css/style-responsive.css" rel="stylesheet" />
<link href="${path}/NiceAdmin/css/xcharts.min.css" rel=" stylesheet">
<link href="${path}/NiceAdmin/css/jquery-ui-1.10.4.min.css"
	rel="stylesheet">
<!-- =======================================================
    Theme Name: NiceAdmin
    Theme URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
    Author: BootstrapMade
    Author URL: https://bootstrapmade.com
  ======================================================= -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="sideBar.html" flush="true" />
<body>
	<!-- container section start -->
	<section id="container" class="">
		<section id="main-content">
			<section class="wrapper">
				
				
			</section>
		</section>
		<!--main content end-->
		<div class="text-right">
			<div class="credits">
				<!--
            All the links in the footer should remain intact.
            You can delete the links only if you purchased the pro version.
            Licensing information: https://bootstrapmade.com/license/
            Purchase the pro version form: https://bootstrapmade.com/buy/?theme=NiceAdmin
          -->
				Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
			</div>
		</div>
	</section>
	<!-- container section end -->
	<!-- javascripts -->
	<script src="${path}/NiceAdmin/js/jquery.js"></script>
	<script src="${path}/NiceAdmin/js/bootstrap.min.js"></script>
	<!-- nicescroll -->
	<script src="${path}/NiceAdmin/js/jquery.scrollTo.min.js"></script>
	<script src="${path}/NiceAdmin/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<!--custome script for all page-->
	<script src="${path}/NiceAdmin/js/scripts.js"></script>

</body>
</html>