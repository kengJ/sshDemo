<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
<title>Document</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo111.css">
<script src="${pageContext.request.contextPath}/js/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script type="text/javascript">
		$(document).ready(function(){
			$.get("${pageContext.request.contextPath}/Default/getTop.do",function(data){
			    $('body').html(data);
			    getsize();
			  });
			$.get("${pageContext.request.contextPath}/Default/getLeft.do",function(data){
			    $('body').append(data);
			    getsize();
			  });
			$.get("${pageContext.request.contextPath}/Default/getMain.do",function(data){
			    $('body').append(data);
			    getsize();
			  });
			$.get("${pageContext.request.contextPath}/Default/getRight.do",function(data){
			    $('body').append(data);
			    getsize();
			  });
			getsize();
			$('aside > nav > ul > li').click(function(){
				$('aside > nav > ul > li').removeClass("action");
				$(this).addClass('action');
			});

			$(window).resize(function(){
			   getsize();
			});
			function getsize(){
				$('section#section-main').css('height',function(){
					var bodyheight = $('body').css('height').replace(/px/,'')-48;
					var mainheight = parseInt($('div#panel-main').css('height').replace(/px/,''))+20;
					if(bodyheight>mainheight){
						return bodyheight+"px";
					}else{
						return mainheight+"px";
					}
				});
			}
		});
	</script>
</head>
<body>

</body>
</html>