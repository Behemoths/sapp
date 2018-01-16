
<%
response.setStatus(500);

// 获取异常类
Throwable ex = Exceptions.getThrowable(request);
if (ex != null){
	LogFactory.getLog("500.jsp").error(ex.getMessage(), ex);
}

// 编译错误信息
StringBuilder sb = new StringBuilder("错误信息：\n");
if (ex != null) {
	sb.append(Exceptions.getStackTraceAsString(ex));
} else {
	sb.append("未知错误.\n\n");
}

// 如果是异步请求或是手机端，则直接返回信息
if (Servlets.isAjaxRequest(request)) {
	out.print(sb);
}

// 输出异常信息页面
else {
%>
<%@page import="org.apache.commons.logging.LogFactory"%>
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
<title>500 - 系统内部错误</title>
<%@include file="/WEB-INF/views/include/head.jsp"%>
</head>
<%-- <body>
	<div class="container-fluid">
		<div class="page-header"><h1>系统内部错误.</h1></div>
		<div class="errorMessage">
			错误信息：<%=ex==null?"未知错误.":StringUtils.toHtml(ex.getMessage())%> <br/> <br/>
			请点击“查看详细信息”按钮，将详细错误信息发送给系统管理员，谢谢！<br/> <br/>
			<a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a> &nbsp;
			<a href="javascript:" onclick="$('.errorMessage').toggle();" class="btn">查看详细信息</a>
		</div>
		<div class="errorMessage hide">
			<%=StringUtils.toHtml(sb.toString())%> <br/>
			<a href="javascript:" onclick="history.go(-1);" class="btn">返回上一页</a> &nbsp;
			<a href="javascript:" onclick="$('.errorMessage').toggle();" class="btn">隐藏详细信息</a>
			<br/> <br/>
		</div>
	</div>
</body> --%>

<!-- error -->
<div class="content-error">
	<div class="con-error">
		<h2 class="error500"></h2>
		<h3>很抱歉！服务器暂时无法响应......</h3>
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