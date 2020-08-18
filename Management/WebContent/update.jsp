<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<meta charset="utf-8" />
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <title>修改应用信息</title>
	</head>
    <body>
        <div align = "center">
        	<h3 style="text-align: center;">应用信息</h3>
	     	<form id="myForm" action="${pageContext.request.contextPath}/QueAppServlet" method="post">
	             <input type="text" id="id" name="id" placeholder="请输入应用编号：">
	             <input type="submit" value="确认"/>
	             <input type="reset" value="重置" />
	             <input type="button" value="取消" onclick="window.location.href = '${pageContext.request.contextPath}/ApplicationServlet'"/>
	         </form>
	     	<!-- 
	     	   在表单中显示QueAppServlet转发过来的application 
	     	-->
	     	<c:forEach items = "${list}" var = "application" varStatus = "a">
				<form action="${pageContext.request.contextPath}/UpdAppServlet" method="post">
					<div>
					    <label for="id">编号：</label>
					    <input type="text" id="id" name="id" value="${application.id}" readonly="readonly" placeholder="请输入编号" />
					</div>
				  
					<div>
					    <label for="name">名称：</label>
					    <input type="text" id="name" name="name" value="${application.name}" placeholder="请输入名称">
					</div>
				
					 <div>
					     <label for="version">版本：</label>
					     <input type="text" id="version" name="version" value="${application.version}" placeholder="请输入版本号">
					 </div>
					
					 <div>
					     <label for="type">类型：</label>
					     <input type="text" id="type" name="type" value="${application.type}" placeholder="请输入类型">
					 </div>
					 
					 <div>
					     <label for="project">所属项目：</label>
					     <input type="text" id="project" name="project" value="${application.project}" placeholder="请输入所属项目名称">
					 </div>
					 
					 <div>
					     <label for="bussinessCategory">业务大类：</label>
					     <input type="text" id="bussinessCategory" name="bussinessCategory" value="${application.bussinessCategory}" placeholder="请输入业务大类">
					 </div>
					 
					 <div>
					     <label for="bussinessType">业务类型：</label>
					     <input type="text" id="bussinessType" name="bussinessType" value="${application.bussinessType}" placeholder="请输入业务类型">
					 </div>
					 
					 <div>
					     <label for="runningMode">运行方式：</label>
					     <input type="text" id="runningMode" name="runningMode" value="${application.runningMode}" placeholder="请输入运行方式">
					 </div>
					 
					 <div>
					     <label for="environment">运行环境：</label>
					     <input type="text" id="environment" name="environment" value="${application.environment}" placeholder="请输入运行环境">
					 </div>
					 
					 <div>
					     <label for="loadMode">均衡方式：</label>
					     <input type="text" id="loadMode" name="loadMode" value="${application.loadMode}" placeholder="请输入负载均衡方式">
					 </div>
					 
					 <div>
					     <label for="location">代码位置：</label>
					     <input type="text" id="location" name="location" value="${application.location}" placeholder="请输入代码位置">
					</div>
					       
					<div>
					    <input type="submit" value="提交修改" />
					    <input type="reset" value="重置" />
					    <input type="button" value="返回" onclick="window.location.href = '${pageContext.request.contextPath}/ApplicationServlet'"/>
					</div>
		     </form>
		  </c:forEach>
		</div>
    </body>
</html>