<%@ page import="org.obrii.mit.dp2021.fit.IPeople" %>
<%@ page import="org.obrii.mit.dp2021.fit.IHaircut" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="Choose your hair style!​">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>Form</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/nicepage.css" media="screen">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/Form.css" media="screen">
    <meta name="generator" content="Nicepage 3.6.1, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    <link id="u-page-google-font" rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Roboto+Slab:100,300,400,700|Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i">


    <meta property="og:title" content="Form">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="<%=request.getContextPath()%>">
    <meta property="og:url" content="index.html">
</head>
<body class="u-body">
<header class="u-clearfix u-grey-75 u-header u-header" id="sec-84b1">
    <div class="u-clearfix u-sheet u-sheet-1">

        <% IPeople human = (IPeople) request.getAttribute("maleOrFemale"); %>
        <a href="<%=request.getContextPath()%>/index.jsp" class="u-image u-logo u-image-1" data-image-width="422"
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
                            href="<%=request.getContextPath()%>/index.jsp" style="padding: 10px 26px;">Home</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="#" style="padding: 10px 26px;">About</a>
                    </li>
                    <li class="u-nav-item"><a
                            class="u-button-style u-nav-link u-text-active-palette-1-base u-text-hover-palette-2-base"
                            href="<%=request.getContextPath()%>/form" style="padding: 10px 26px;">Form</a>
                    </li>
                </ul>
            </div>
            <div class="u-nav-container-collapse">
                <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                    <div class="u-sidenav-overflow">
                        <div class="u-menu-close"></div>
                        <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2">
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="<%=request.getContextPath()%>/index.jsp">Home</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link" href="#">About</a>
                            </li>
                            <li class="u-nav-item"><a class="u-button-style u-nav-link"
                                                      href="<%=request.getContextPath()%>/form">Form</a>
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
<section class="u-clearfix u-section-1" id="sec-33ad">
    <div class="u-clearfix u-sheet u-sheet-1">
        <h1 class="u-align-center-xs u-custom-font u-font-roboto-slab u-text u-text-default u-title u-text-1">Choose
            your hair style! </h1>
        <div class="u-form u-form-1">
            <form action="<%=request.getContextPath()%>/form" method="POST"
                  class="u-clearfix u-form-spacing-26 u-form-vertical u-inner-form" style="padding: 39px;"
                  source="custom" name="form">
                <div class="u-form-group u-form-name">
                    <label for="name"
                           class="u-custom-font u-font-roboto-slab u-form-control-hidden u-label u-label-1"></label>
                    <input type="text" placeholder="Name" id="name" name="name"
                           class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div>
                <div class="u-form-group u-form-phone u-form-group-2">
                    <label for="phone" class="u-custom-font u-font-roboto-slab u-form-control-hidden u-label u-label-2">Phone</label>
                    <input type="tel"
                           pattern="\+?\d{0,3}[\s\(\-]?([0-9]{2,3})[\s\)\-]?([\s\-]?)([0-9]{3})[\s\-]?([0-9]{2})[\s\-]?([0-9]{2})"
                           placeholder="Phone" id="phone" name="phone"
                           class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white" required="">
                </div>
                <div class="u-form-group u-form-select u-form-group-4">
                    <label for="select-85fb"
                           class="u-custom-font u-font-roboto-slab u-form-control-hidden u-label u-label-5"></label>
                    <div class="u-form-select-wrapper">
                        <select id="select-85fb" name="haircut"
                                class="u-border-1 u-border-grey-30 u-input u-input-rectangle u-white"
                                required="required">
                            <% for (IHaircut haircut : human.getHaircuts()) {%>
                            <option value="<%= haircut.getHaircut()%>">
                                <%=haircut.getHaircut()%>
                            </option>
                            <%}%>
                        </select>
                        <svg xmlns="http://www.w3.org/2000/svg" width="14" height="12" version="1" class="u-caret">
                            <path fill="currentColor" d="M4 8L0 4h8z"></path>
                        </svg>
                    </div>
                </div>
                <div class="dimaLoh" style="width: 100%; display: flex; justify-content: center">
                    <button class="pswp__button" type="submit" value="Send">Choose!</button>
                </div>
            </form>
        </div>
    </div>
</section>


<footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-501c">
    <div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Copyright © 2021 | Tweeker</p>
    </div>
</footer>
</body>
</html>