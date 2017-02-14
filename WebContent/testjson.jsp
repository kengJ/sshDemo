<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath}/static/js/jquery/jquery.min.js"></script>
<script type="text/javascript">
	var url = '${pageContext.request.contextPath}';
	$(document).ready(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/jsonTest",
			success:function(data){
				//console.log(data);
				/*var str='';
				for(var item in data){
					str+=item+',';
				}*/
				console.log	(data);
			},
			headers:{"Accept": "application/xml"}
		});
	});
</script>
</head>
<body>



</body>
</html>