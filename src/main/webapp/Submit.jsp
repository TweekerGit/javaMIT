<%@ page import="org.obrii.mit.dp2021.fit.Human" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="The Barber Shop">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Home</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/nicepage.css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/Home.css" media="screen">
    <script class="u-script" type="text/javascript" src="<%=request.getContextPath()%>/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="<%=request.getContextPath()%>/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.6.1, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Oswald:200,300,400,500,600,700|Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">


    <script type="application/ld+json">{
        "@context": "http://schema.org",
        "@type": "Organization",
        "name": "",
        "url": "index.html",
        "logo": "images/TweekerLogo.png"
    }</script>
    <meta property="og:title" content="Home">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <meta property="og:url" content="index.html">
</head>
<body class="u-body">

<% Human human = (Human) request.getAttribute("human"); %>


<header class="u-clearfix u-grey-75 u-header u-header" id="sec-84b1">
    <div class="u-clearfix u-sheet u-sheet-1">
        <a href="<%=request.getContextPath()%>" class="u-image u-logo u-image-1" data-image-width="422"
           data-image-height="440">
            <img src="<%=request.getContextPath()%>/images/TweekerLogo.png" class="u-logo-image u-logo-image-1"
                 data-image-width="64">
        </a>
        <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
            <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
                <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                   href="#">
                    <svg>
                        <use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use>
                    </svg>
                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
                        <defs>
                            <symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;">
                                <rect y="1" width="16" height="2"></rect>
                                <rect y="7" width="16" height="2"></rect>
                                <rect y="13" width="16" height="2"></rect>
                            </symbol>
                        </defs>
                    </svg>
                </a>
            </div>
            <div class="u-nav-container">
                <ul class="u-nav u-unstyled u-nav-1">
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="<%=request.getContextPath()%>" style="padding: 10px 26px;">Home</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="#" style="padding: 10px 26px;">About</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="<%=request.getContextPath()%>/form?sex=Male" style="padding: 10px 26px;">Men's Haircuts</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="<%=request.getContextPath()%>/form?sex=Female" style="padding: 10px 26px;">Women's Haircuts</a>
                    </li>
                </ul>
            </div>
            <div class="u-nav-container-collapse">
                <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                    <div class="u-sidenav-overflow">
                        <div class="u-menu-close"></div>
                        <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link" href="index.jsp">Home</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">About</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="<%=request.getContextPath()%>/form?sex=Male">Men's Haircuts</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="<%=request.getContextPath()%>/form?sex=Female">Women's Haircuts</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
            </div>
        </nav>
        <p class="u-custom-font u-font-raleway u-text u-text-1">Tweeker</p>
    </div>
</header>
<section class="u-align-center u-clearfix u-palette-3-dark-3 u-section-1" id="carousel_072a">
    <div class="u-clearfix u-sheet u-valign-middle-lg u-valign-middle-md u-valign-middle-sm u-valign-middle-xl u-sheet-1">
        <div class="u-clearfix u-expanded-width u-gutter-42 u-layout-wrap u-layout-wrap-1">
            <div class="u-layout">
                <!-- Central block -->
                <div class="u-container-style u-layout-cell center-block u-align-center u-size-25-xl u-size-28-lg u-size-28-md u-size-28-sm u-size-28-xs u-layout-cell-2">
                    <div class="u-container-layout u-container-layout-3">
                        <h1 class="u-custom-font u-font-oswald u-text u-text-custom-color-1 u-text-1">Thank you!</h1>
                        <p class="u-align-center u-large-text u-text u-text-variant u-text-2">Dear <%= human.getName()%>! You choose <%= human.getHaircut()%> haircut. We will phone you on this number: <%= human.getPhone()%>, and discuss your order!</p>
                        <a href="<%=request.getContextPath()%>"
                           class="u-border-2 u-border-white u-btn u-button-style u-btn-1" title="learn more">Home<br>
                        </a>
                    </div>
                    <!-- End Central Block -->
                </div>
            </div>
        </div>
    </div>
</section>


<footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-501c">
    <div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Copyright ©&nbsp;2021 | Tweeker</p>
    </div>
</footer>
</body>
</html>