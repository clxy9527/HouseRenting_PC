<!DOCTYPE html>
<head>
<!-- Required meta tags -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>欢迎进入后台系统</title>
<!-- plugins:css -->
<meta charset="utf-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/iconfonts/simple-line-icon/css/simple-line-icons.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/iconfonts/flag-icon-css/css/flag-icon.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/vendors/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/images/favicon.png" />
</head>

<body>
	<div class="container-scroller">
		<!-- partial:../../partials/_horizontal-navbar.html -->
		<nav class="navbar horizontal-layout col-lg-12 col-12 p-0">
			<div class="nav-top flex-grow-1">
				<div class="container d-flex flex-row h-100 align-items-center">
					<div
						class="text-center navbar-brand-wrapper d-flex align-items-center">

					</div>
					<div
						class="navbar-menu-wrapper d-flex align-items-center justify-content-between flex-grow-1">
						<form class="search-field d-none d-md-flex" action="#">
							<div class="form-group mb-0">
								<div class="input-group">
									<div class="input-group-prepend">
										
									</div>

								</div>
							</div>
						</form>
						<ul class="navbar-nav navbar-nav-right mr-0 ml-auto">
							<li class="nav-item nav-profile dropdown"><a
								class="nav-link dropdown-toggle" href="#" data-toggle="dropdown"
								id="profileDropdown"> <img
									src="https://via.placeholder.com/39x39" alt="profile" /> <span
									class="nav-profile-name">${user.userName}
										工号：${user.userNo}</span>
							</a>
								<div class="dropdown-menu dropdown-menu-right navbar-dropdown"
									aria-labelledby="profileDropdown">
							
									<div class="dropdown-divider"></div>
									<a class="dropdown-item" href="${pageContext.request.contextPath}/login.jsp"> <i
										class="icon-logout text-primary mr-2"></i> 登出
									</a>
								</div></li>
						</ul>
						<button class="navbar-toggler align-self-center" type="button"
							data-toggle="minimize">
							<span class="icon-menu text-dark"></span>
						</button>
					</div>
				</div>
			</div>
			<div class="nav-bottom">
				<div class="container">
					<ul class="nav page-navigation">
						<li class="nav-item"><a href="${pageContext.request.contextPath}/appointmentinfoController/queryAppontInfoList/100"
							class="nav-link"><i class="link-icon icon-screen-desktop"></i><span
								class="menu-title">预约中心</span></a></li>
						<li class="nav-item"><a href="${pageContext.request.contextPath}/roominfoController/queryroominfoListweb"
							class="nav-link"><i class="link-icon icon-disc"></i><span
								class="menu-title">房屋中心</span></a></li>
						<li class="nav-item mega-menu"><a href="${pageContext.request.contextPath}/userinfoController/queryuserinfoListweb" class="nav-link"><i
								class="link-icon icon-film"></i><span class="menu-title">用户中心</span></a>
					</li>
						<li class="nav-item"><a href="${pageContext.request.contextPath}/contractinfoController/queryContractListweb" class="nav-link"><i
								class="link-icon icon-book-open"></i><span class="menu-title">合同中心</span></a>
							</li>
						<li class="nav-item mega-menu"><a href="${pageContext.request.contextPath}/judgeinfoCotroller/queryallweb/100" class="nav-link"><i
								class="link-icon icon-pie-chart"></i><span class="menu-title">评价审核中心</span></a>
						</li>
					</ul>
				</div>
			</div>
		</nav>

		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title"></h4>
							<div class="row">
								<div class="col-12 table-responsive">
									<table id="order-listing" class="table">
										<thead>
											<tr>
												<th>房屋编号</th>
												<th>房屋地址</th>
												<th>房屋类型</th>
												<th>房屋价格</th>
												<th>房屋拥有者</th>
												<th>申请日期</th>
												<th>房屋状态</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
										 <c:forEach items="${roomlist}" var="roomlist"> 
											<tr>
												<td>${roomlist.roomNo}</td>
												<td>${roomlist.roomAddress}</td>
												<td>${roomlist.roomType}</td>
												<td>￥${roomlist.roomPrice}</td>
												<td>${roomlist.getUserNo().userName}</td>
												<td><c:out value="${fn:substring(roomlist.roomDate,0,19)}" /></td>
												<td><c:if test="${roomlist.roomState==-1}"><label class="badge badge-danger">未审核</label></c:if>
												<c:if test="${roomlist.roomState==0}"><label class="badge badge-info">通过</label></c:if>
												<c:if test="${roomlist.roomState==1}"><label class="badge badge-success">未通过</label></c:if></td>
												<td>
													<button class="btn btn-outline-primary">查看</button>
												</td>
											</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<footer class="footer">
					<div class="w-100 clearfix">
						
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="${pageContext.request.contextPath}/vendors/js/vendor.bundle.base.js"></script>
	<script
		src="${pageContext.request.contextPath}/vendors/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script src="${pageContext.request.contextPath}/js/template.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="${pageContext.request.contextPath}/js/data-table.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
