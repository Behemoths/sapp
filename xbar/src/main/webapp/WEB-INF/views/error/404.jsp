
<%
response.setStatus(404);

// 如果是异步请求或是手机端，则直接返回信息
if (Servlets.isAjaxRequest(request)) {
	out.print("页面不存在.");
}

//输出异常信息页面
else {
%>
<%@page import="com.boiling.kitbox.util.Servlets"%>
<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${ctxStatic}/ui/css/screen.css" />
<link rel="stylesheet" href="${ctxStatic}/ui/css/common.css" />
<title>404 - 页面不存在</title>
<%@include file="/WEB-INF/views/include/head.jsp"%>
</head>
<!-- <body>
	<div class="container-fluid">
		<div class="page-header"><h1>页面不存在.</h1></div>
		<div><a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a></div>
	</div>
</body> -->

<!-- error -->
<div class="content-error">
	<div class="con-error">
		<h2 class="error404"></h2>
		<h3>很抱歉！您访问的页面不存在......</h3>
		<p>
			<!-- <a href="#" title="" class="btn-first">回主页</a> -->
			<a href="#" title="" class="btn-last" onclick="goBack();">返回</a>
		</p>
	</div>
</div>
<!-- error -->
<script type="text/javascript">
function goBack(){
	if(self == top){
		location.href = location.protocol+"//"+location.host+"${pageContext.request.contextPath}";
	}else{
		top.$("#tabs").tabs("close",top.$('#tabs').tabs('getTabIndex',top.$('#tabs').tabs('getSelected')));
	}
}
$(function(){
	$('.content-error').height($(window).height());
});
</script>
</body>
</html>
<%
out.print("<!--"+request.getAttribute("javax.servlet.forward.request_uri")+"-->");
} out = pageContext.pushBody();
%>