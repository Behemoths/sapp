
<%
response.setStatus(500);

// 获取异常类
Throwable ex = Exceptions.getThrowable(request);

//如果是异步请求或是手机端，则直接返回信息
if (Servlets.isAjaxRequest(request)) {
	if (ex!=null && StringUtils.startsWith(ex.getMessage(), "msg:")){
		out.print(StringUtils.replace(ex.getMessage(), "msg:", ""));
	}else{
		out.print("网络不稳定，票据检查失败.");
	}
}

// 输出异常信息页面
else {
%>
<%@page import="javax.validation.ConstraintViolation"%>
<%@page import="javax.validation.ConstraintViolationException"%>
<%@page import="org.springframework.validation.BindException"%>
<%@page import="org.springframework.validation.ObjectError"%>
<%@page import="org.springframework.validation.FieldError"%>
<%@page import="org.slf4j.Logger,org.slf4j.LoggerFactory"%>
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
<title>token-error - 网络不稳定，票据检查失败</title>
</head>
<%-- <body>
	<div class="container-fluid">
		<div class="page-header"><h1>参数有误,服务器无法解析.</h1></div>
		<div class="errorMessage">
			<%=StringUtils.toHtml(sb.toString())%> <br/>
		</div>
		<a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a> &nbsp;
		<br/> <br/>
	</div>
</body> --%>


<body>
	<!-- error -->
	<div class="content-error">
		<div class="con-error">
			<h2 class="error-1"></h2>
			<h3>很抱歉！因网络不稳定，票据检查失败......</h3>
			<p>
				<!-- <a href="#" title="" class="btn-first">回主页</a> -->
				<a href="#" title="" class="btn-last" onclick="hgoBack();">返回</a>
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
	$(window).resize(function(){
		$('.content-error').height($(window).height());
	});
});
</script>
</body>

</html>
<%
} out = pageContext.pushBody();
%>