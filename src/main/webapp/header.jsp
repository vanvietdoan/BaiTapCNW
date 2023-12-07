<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.BEAN.CategoryBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="middle-inner">
		<div class="container">
			<div class="row">
				<div class="col-lg-2 col-md-2 col-12">
					<!-- Logo -->
					<div class="logo">
						<a href="index.html"><img src="images/logo.png" alt="logo"></a>
					</div>
					<!--/ End Logo -->
					<!-- Search Form -->
					<div class="search-top">
						<div class="top-search"><a href="#0"><i class="ti-search"></i></a></div>
						<!-- Search Form -->
						<div class="search-top">
							<form class="search-form">
								<input type="text" placeholder="Search here..." name="search">
								<button value="search" type="submit"><i class="ti-search"></i></button>
							</form>
						</div>
						<!--/ End Search Form -->
					</div>
					<!--/ End Search Form -->
					<div class="mobile-nav"></div>
				</div>
				<div class="col-lg-8 col-md-7 col-12">
					<div class="search-bar-top">
						<div class="search-bar">
							<select>
								<option selected="selected">All Category</option>
								<option>watch</option>
								<option>mobile</option>
								<option>kid’s item</option>
							</select>
							<form>
								<input name="search" placeholder="Search Products Here....." type="search">
								<button class="btnn"><i class="ti-search"></i></button>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-12">
					<div class="right-bar">
						<!-- Search Form -->
						<div class="sinlge-bar">
							<a href="#" class="single-icon"><i class="fa fa-heart-o" aria-hidden="true"></i></a>
						</div>
						<div class="sinlge-bar">
							<a href="#" class="single-icon"><i class="fa fa-user-circle-o" aria-hidden="true"></i></a>
						</div>
						<div class="sinlge-bar shopping">
							<a href="#" class="single-icon"><i class="ti-bag"></i> <span class="total-count">2</span></a>
							<!-- Shopping Item -->
							<div class="shopping-item">
								<div class="dropdown-cart-header">
									<span>2 Items</span>
									<a href="#">View Cart</a>
								</div>
								<ul class="shopping-list">
									<li>
										<a href="#" class="remove" title="Remove this item"><i class="fa fa-remove"></i></a>
										<a class="cart-img" href="#"><img src="https://via.placeholder.com/70x70" alt="#"></a>
										<h4><a href="#">Woman Ring</a></h4>
										<p class="quantity">1x - <span class="amount">$99.00</span></p>
									</li>
									<li>
										<a href="#" class="remove" title="Remove this item"><i class="fa fa-remove"></i></a>
										<a class="cart-img" href="#"><img src="https://via.placeholder.com/70x70" alt="#"></a>
										<h4><a href="#">Woman Necklace</a></h4>
										<p class="quantity">1x - <span class="amount">$35.00</span></p>
									</li>
								</ul>
								<div class="bottom">
									<div class="total">
										<span>Total</span>
										<span class="total-amount">$134.00</span>
									</div>
									<a href="checkout.html" class="btn animate">Checkout</a>
								</div>
							</div>
							<!--/ End Shopping Item -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Header Inner -->
	<div class="header-inner">
		<div class="container">
			<div class="cat-nav-head">
				<div class="row">
					<div class="col-lg-12 col-12">
						<div class="menu-area">
							<!-- Main Menu -->
							<nav class="navbar navbar-expand-lg ms-1">
								<div class="navbar-collapse"">	
									<div class="nav justify-content-center">	
										<ul class="nav main-menu menu navbar-nav">
										 <%
											    ArrayList<CategoryBean> listCategory = (ArrayList<CategoryBean>) request.getAttribute("listCategorys");
											    for (CategoryBean category : listCategory) {
											%>
											    <li><a href="#"><%= category.getName() %></a></li>
											<%
											    }
											%> 
										</ul>
									</div>
								</div>
							</nav>
							<!--/ End Main Menu -->	
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>