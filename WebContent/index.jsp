<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- <title>首页</title>-->
        <meta charset="utf-8">
		<meta name="viewport" content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
		<link href="${pageContext.request.contextPath}/css/ionic.css" rel="stylesheet">
		<script src="${pageContext.request.contextPath}/js/ionic.bundle.js"></script>
		<script src="${pageContext.request.contextPath}/js/project/index.js"></script>
		<script src="${pageContext.request.contextPath}/js/jquery/jquery.min.js"></script>
        <link href="${pageContext.request.contextPath}/css/project/index.css" rel="stylesheet"/>
    </head>
    <body ng-app="starter" ng-controller="actionsheetCtl">
        <ion-pane>
            <ion-side-menus>
                <!-- 中间内容 -->
                <ion-side-menu-content>
                    <%@include file="public/main.jsp" %>
                </ion-side-menu-content>
                <!-- 左侧菜单 -->
                <ion-side-menu side="left">
                    <%@include file="public/left.jsp" %>
                </ion-side-menu>
                
        </ion-pane>
        <div class="">
            <a href="">
            
            </a>
        </div>
    </body>
</html>
