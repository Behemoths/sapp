<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统管理平台</title>
<script type="text/javascript">
	$(function(){
		<%-- 初始化左侧系统菜单 --%>
		initLeftMenu();
		
	});
	
	<%-- ------------------------------------------------------------------------------------------------------------------------- --%>
	<%-- 初始化左侧系统菜单 --%>
	function initLeftMenu(){
		$.ajax({
			url:"${ctx}/sc040406/refresh.sc",
			dataType:"json",
			success: function(data){
				data = data.apps;
				
			}
		});
	}
</script>
</head>
<body>
	

</body>
</html>