<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>management</title>
		<link href="main.css" type="text/css" rel="stylesheet"><link/>
		<script src="main.js" type="text/javascript"></script>
	</head>
	<body>
		<h1>应用信息管理系统</h1>
		<div id="time" align = "right">
			<%-- (new java.util.Date()).toLocaleString() --%>
		</div>
		<hr/>
		<div>
		    <button onclick="window.location.href = '${pageContext.request.contextPath}/ApplicationServlet'">全部显示</button>
			<button onclick="window.location.href = '${pageContext.request.contextPath}/insert.jsp'">新建</button>
			<button onclick="window.location.href = '${pageContext.request.contextPath}/update.jsp'">更新</button>
			<button onclick="window.location.href = '${pageContext.request.contextPath}/update.jsp'">查询</button>
			<button onclick="deleteInfo();">删除</button>
			<br/>
        	<label>查询结果如下</label>
		</div>
		<hr/>
		<table id="mytable" border="1">
			<tr>
				<th>编号</th>
				<th>名称</th>
				<th>版本</th>
				<th>类型</th>
				<th>所属项目</th>
				<th>业务大类</th>
				<th>业务类型</th>
				<th>运行方式</th>
				<th>运行环境</th>
				<th>负载均衡方式</th>
				<th>代码位置</th>
				<th>其它信息</th><!-- 机器信息、 jar包信息 -->
			</tr>
			<!-- 根据应用列表 初始化表格 -->
			<c:forEach items = "${list}" var = "application" varStatus = "a">
				<c:if test="${a.count % 2 == 0}">
					<tr bgcolor="#f0f0f5">
						<td>${application.id}</td>
						<td>${application.name}</td>
						<td>${application.version}</td>
						<td>${application.type}</td>
						<td>${application.project}</td>
						<td>${application.bussinessCategory}</td>
						<td>${application.bussinessType}</td>
						<td>${application.runningMode}</td>
						<td>${application.environment}</td>
						<td>${application.loadMode}</td>
						<td>${application.location}</td>
						<td>
							<a href="javascript:void(0);" onclick="jar(${application.id});">jar包信息</a>
							<br />
							<a href="javascript:void(0);" onclick="machine(${application.id});">机器信息</a>
						</td>
					</tr>
				</c:if>
				<c:if test="${a.count % 2 == 1}">
					<tr bgcolor="white">
						<td>${application.id}</td>
						<td>${application.name}</td>
						<td>${application.version}</td>
						<td>${application.type}</td>
						<td>${application.project}</td>
						<td>${application.bussinessCategory}</td>
						<td>${application.bussinessType}</td>
						<td>${application.runningMode}</td>
						<td>${application.environment}</td>
						<td>${application.loadMode}</td>
						<td>${application.location}</td>
						<td>
                            <a href="javascript:void(0);" onclick="jar(${application.id});">jar包信息</a>
                            <br />
                            <a href="javascript:void(0);" onclick="machine(${application.id});">机器信息</a>
                        </td>
					</tr>
				</c:if>
			</c:forEach>
		</table>
	</body>
</html>