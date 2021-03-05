<%@ page contentType="text/html;charset=utf-8" %>
<!DOCTYPE html>
<html lang="uk">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- SITE TITLE -->
<title>Lab3</title>

<!-- =========================
      FAV AND TOUCH ICONS  
============================== -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.ico">
<link rel="apple-touch-icon" href="<%=request.getContextPath()%>/images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="72x72" href="<%=request.getContextPath()%>/images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114" href="<%=request.getContextPath()%>/images/apple-touch-icon-114x114.png">

<!-- =========================
     STYLESHEETS   
============================== -->

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/master.css" />
</head>

<body data-spy="scroll" data-target=".navbar">
<div class="preloader" id="preloader"> <img src="<%=request.getContextPath()%>/images/preloader.gif" alt="" /> </div>
<!-- =========================
     TOP BAR
============================== -->
<div class="top-bar" id="top-bar">
	<div class="container">
		<div class="row"> 
			
			<!-- TOP BAR LEFT -->
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="top-bar-adress"> <i class="flaticon-navigation-arrow"></i> Henderson Blvd PO Box 356012, Tampa, FL 54452 </div>
			</div>
			
			<!-- TOP BAR RIGHT -->
			<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">
				<div class="top-bar-social"> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-google-plus"></i></a> <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-skype"></i></a> </div>
				<div class="top-bar-mail"> <i class="fa fa-envelope"></i> <a href="#">office@dental.com</a> </div>
			</div>
		</div>
	</div>
</div>
<!-- =========================
     END TOP BAR   
============================== --> 

<!-- =========================
     HEADER
============================== -->
<div class="header" id="header">
	<div class="container">
		<div class="row"> 
			
			<!-- HEADER LOGO -->
			<div class="col-lg-4 col-md-4 col-sm-5 col-xs-12">
				<div class="header-logo"> <a href="#"><img src="<%=request.getContextPath()%>/images/logo.svg" alt="" />
					<span class="bold600 color-child-6">DENTAL</span>
					<span class="color-child-5">CLINIC</span>
					</a> </div>
			</div>
			
			<!-- HEADER BUTTONS -->
			<div class="col-lg-8 col-md-8 col-sm-7 col-xs-12">
				<div class="header-button"> <a href="#bookform1" class="fancybox-2 btn btn-default">
					<span class="plus">+</span>
					MAKE AN APPOINTMENT</a> </div>
				<div class="header-phone"> <i class="fa fa-phone"></i> 123 456-7890 </div>
			</div>
		</div>
	</div>
</div>
<!-- =========================
     END HEADER
============================== --> 

<!-- =========================
     MAIN MENU
============================== -->
<div id="smartposition"></div>
<div class="top-menu" id="top-menu">
	<div class="container">
		<div class="row">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="mobile-bar-cont">
					<div class="top-menu-logo"> <a href="#"><img src="<%=request.getContextPath()%>/images/logo.svg" alt="" />
						<span class="bold600 color-child-6">DENTAL</span>
						<span class="color-child-5">CLINIC</span>
						</a> </div>
					<div class="mobile-bar">
						<div class="show-menu" id="show-menu"> <i class="fa fa-bars"></i> </div>
					</div>
				</div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="<%=request.getContextPath()%>">HOME</a></li>
					<li><a href="#">ABOUT US</a></li>
					<li><a href="#">SERVICES</a></li>
					<li><a href="#">OUR DOCTORS</a></li>
					<li><a href="#">BLOG</a></li>
					<li><a href="#">PAGES</a></li>
					<li><a href="#">CONTACT US</a></li>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- =========================
     END MAIN MENU
============================== -->
<div style="background-color: lightgray; height: 754px;">
	<h1 style="text-align: center; padding: 30px;">Here you can make an appointment</h1>
	<div class="wrapper">
		<div class="line">		
			<div class="id">1</div>
			<div class="FirstName">Влад</div>
			<div class="LastName">Фіть</div>
			<div class="Phone">+380980197816</div>
			<div class="Date">19.06.2002</div>
			<form action="/form" method="POST">
				<button type="submit" value="Update">Update</button>
			</form>
			<form action="">
				<button type="submit" value="Update">Delete</button>
			</form>
		</div>
	</div>
</div>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/responsive.css" />

<script src="<%=request.getContextPath()%>/js/jquery-2.2.0.min.js"></script>

<script src="<%=request.getContextPath()%>/js/theme.js"></script>
</body>
</html>