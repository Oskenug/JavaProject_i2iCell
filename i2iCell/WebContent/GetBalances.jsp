<!DOCTYPE html>
<html lang="en">
<head>
  <title>i2icell</title>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
	.navbar-nav li a{
		color:black !important;
		font-weight: bold;
		margin-left:50px;
		margin-right:50px;
	}
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #41ACE4;
      height: 100%;
	  color: white;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #D3D3D3;
      color: black;
      padding: 15px;
    }
	
	.navbar-inverse{
		background-color: #D3D3D3;
		border-color: #D3D3D3;
		color: black;
	}
	 
	.content-form{
		border:1px solid #ccc;
		-webkit-border-radius: 6px;
		-moz-border-radius: 6px;
		border-radius: 6px;
		padding:20px;
		
	}
    
      .row.content {height:auto;} 
	  
	.example-two {
		width:150px;
		height:150px;
		border-radius: 50%;
	    border: 3px solid #0B7BE9;
		text-align:center;
	    
  }
	.col-margin{
		margin-left: 40px;
		margin-right: 30px;
		text-align: right;
	}

  </style>
   
</head>
<body>
<script src="//code.jivosite.com/widget.js" jv-id="FqcGXo6lmT" async></script>
<div class="container-fluid text-center">    
  <div class="row">
    <div class="col-sm-4 sidenav"></div>
	<div class="col-sm-8"><br></div>
  </div>
</div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header col-sm-4">
     <ul class="nav navbar-nav navbar-left">
        <li><img src="https://a.icons8.com/TtfefVqX/wTMJyC/ade7ef70-0b01-4b58-8.png"  width="64px" height="64px">
		<b style="font-size:21px">i2i Cell</b>
		</li>
      </ul>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="/i2iCell/">Anasayfa</a></li>
        <li><a href="#">Paketler</a></li>
        <li><a href="#">Hakkımızda</a></li>
        <li><a href="#">Giriş</a></li>
      </ul>
	  <ul class="nav navbar-nav navbar-right">
        <li><img src="https://a.icons8.com/TtfefVqX/3UxC4m/oval.png"  width="64px" height="64px"></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-4 sidenav">
     <h1 class="display-1" style="font-family: cursive;font-size:4em;opacity: 0.5;">Hello,</h1>
	 <h3 style="font-family: cursive;font-size:2em;opacity: 0.5;">We Do Communication.</h3>
	 <img src="https://a.icons8.com/TtfefVqX/Z8tVL5/f37d0b74-e9d1-44a5-a.png" height="300px" width="300px">
    </div>
    <div class="col-sm-8 text-left"> 
	<br>
	<div class="col-sm-1"></div>
      <div class="col-sm-11">
	  <br><br><br><br><br><br><br>
	  <div class="col-sm-2 col-margin">
	  <p class="text-uppercase"><b>İnternet</b></p>
		<div class="example-two">
		    <br>
			<p style="font-size:2em">${gbDeger}</p>
			<br>
			<p style="font-size:2em">GB</p>
		</div>
	   </div>
	   <div class="col-sm-2 col-margin">
	   <p class="text-uppercase"><b>Konuşma</b></p>
		<div class="example-two">
			<br>
			<p style="font-size:2em"> ${dakikaDeger} </p>
			<br>
			<p style="font-size:2em">DK</p>
		</div>
		</div>
	   <div class="col-sm-2 col-margin">
	   <p class="text-uppercase"><b>Mesaj</b></p>
		<div class="example-two">
			<br>
			<p style="font-size:2em"> ${smsDeger} </p>
			<br>
			<p style="font-size:2em">SMS</p>
		</div>
		</div>
	  </div>
    </div>
  </div>
</div>
<footer class="page-footer font-small special-color-dark pt-4">

  <!-- Footer Elements -->
  <div class="container">

    <!-- Social buttons -->
    <ul class="list-unstyled list-inline text-center align-middle">
      <li class="list-inline-item">
        <a class="btn-floating btn-tw mx-1">
		  <img src="https://a.icons8.com/TtfefVqX/k8v5yy/icons8_twitter_100px.png" width="50px" height="50px">
        </a>
      </li>
	  <li class="list-inline-item"><br>
		<span class="text">Bizi Takip Edin <p>@i2icell</p></span>
	  </li>
      <li class="list-inline-item">
        <a class="btn-floating btn-tw mx-1">
		  <img src="https://a.icons8.com/TtfefVqX/uNNcjF/icons8_technical_sup.png" width="50px" height="50px">
        </a>
      </li>
	  <li class="list-inline-item"><br>
		<span class="text">Bizi Arayın <p>+90(850) 346 75 76</p></span>
	  </li>
	   <li class="list-inline-item">
        <a class="btn-floating btn-tw mx-1">
		 <img src="https://a.icons8.com/TtfefVqX/QtTjqZ/icons8_filled_messag.png" width="50px" height="50px">
        </a>
      </li>
	  <li class="list-inline-item"><br>
		<span>Bize Yazın <p>info@i2i-systems.com</p></span>
	  </li>
    </ul>

  </div>
  <!-- Footer Elements -->

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2019 Copyright:
    <a href="http://i2i-systems.com/">i2iSystem Academy</a>
  </div>
  <!-- Copyright -->

</footer>

</body>
</html>
