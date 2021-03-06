<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- SITE TITLE -->
<title>Create</title>

<!-- =========================
      FAV AND TOUCH ICONS  
============================== -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/favicon.ico">
<link rel="apple-touch-icon" href="<%=request.getContextPath()%>/images/apple-touch-icon.png">

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
				<div class="header-button"> <form action="formCreate.jsp" method="GET">
					<button type="submit" class="fancybox-2 btn btn-default">
						<span class="plus">+</span>
						MAKE AN APPOINTMENT</button>
				</form> </div>
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
					<div class="top-menu-logo"> <a href="<%=request.getContextPath()%>"><img src="<%=request.getContextPath()%>/images/logo.svg" alt="" />
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
	<h1 style="text-align: center; padding: 30px;">Here you can change your value</h1>
	<div class="wrapper">
		<div class="line">		

			<form class="formcreate" action="<%=request.getContextPath()%>" method="POST">
				<input type="hidden" name="id" value="0">
				<input type="hidden" name="title" value="Submited"/>

				<input type="text" name="firstName" placeholder="First Name" required><br/>
				<input type="text" name="lastName" placeholder="Last Name" required><br/>
				<input type="tel" name="phone" placeholder="Phone" required><br/>
				<input type="date" name="date" placeholder="Date"><br/>

				<button type="submit" value="Update">Create Client</button>
			</form>
		</div>
	</div>
</div>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/responsive.css" />

<script src="<%=request.getContextPath()%>/js/jquery-2.2.0.min.js"></script>

<script src="<%=request.getContextPath()%>/js/theme.js"></script>
</body>
</html>