<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>jquery</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>JQueryHelp</title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/public/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/public/plugins/font-Awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/public/plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/public/dist/css/AdminLTE.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/public/dist/css/skins/skin-blue.min.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
    <!-- 顶端菜单 -->
	    <header class="main-header">
	      <!-- 标题字样 -->
	      <a href="#" class="logo">
	        <span class="logo-mini"><b>J</b>QH</span>
	        <span class="logo-lg"><b>JQuery</b>Help</span>
	      </a>
	      <nav class="navbar navbar-static-top" role="navigation">
	        <!-- 缩放按钮-->
	        <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
	          <span class="sr-only">Toggle navigation</span>
	        </a>
	      </nav>
	    </header>
		<aside class="main-sidebar">
      		<section class="sidebar">
        		<ul class="sidebar-menu">
        		
        		</ul>
      		</section>
    	</aside>
	</div>
</body>
<script type="text/javascript">
	$(document).ready(function(){
		htmlobj=$.post("",{},function(data){
			
			$('aside.main-sidebar > section > ul.sidebar-menu').html(data);
		});
		
	});
</script>
</html>