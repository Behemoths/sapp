
<%
response.setStatus(403);

//获取异常类
Throwable ex = Exceptions.getThrowable(request);

// 如果是异步请求或是手机端，则直接返回信息
if (Servlets.isAjaxRequest(request)) {
	if (ex!=null && StringUtils.startsWith(ex.getMessage(), "msg:")){
		out.print(StringUtils.replace(ex.getMessage(), "msg:", ""));
	}else{
		out.print("操作权限不足.");
	}
}

//输出异常信息页面
else {
%>
<%@page import="com.boiling.kitbox.util.Servlets"%>
<%@page import="com.boiling.kitbox.util.Exceptions"%>
<%@page import="com.boiling.kitbox.util.StringUtils"%>
<%@page contentType="text/html;charset=UTF-8" isErrorPage="true"%>
<%@include file="/WEB-INF/views/include/taglib.jsp"%>
<%@ include file="/WEB-INF/views/include/common.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${ctxStatic}/ui/css/screen.css" />
<link rel="stylesheet" href="${ctxStatic}/ui/css/common.css" />
<title>403 - 操作权限不足</title>
<%@include file="/WEB-INF/views/include/head.jsp"%>
</head>
<%-- <body>
	<div class="container-fluid">
		<div class="page-header"><h1>操作权限不足.</h1></div>
		<%
			if (ex!=null && StringUtils.startsWith(ex.getMessage(), "msg:")){
				out.print("<div>"+StringUtils.replace(ex.getMessage(), "msg:", "")+" <br/> <br/></div>");
			}
		%>
		<div><a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a></div>
	</div>
</body> --%>

<body>
	<!-- error -->
	<div class="content-error">
		<div class="con-error">
			<h2 class="error403"></h2>
			<h3>很抱歉！您的操作权限不足......</h3>
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
} out = pageContext.pushBody();
%>