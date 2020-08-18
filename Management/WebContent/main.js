var WORD = ["编号","名称","版本","类型","所属项目","业务大类","业务类型","运行方式","运行环境","负载方式","代码位置"];

window.onload = function() {
	var time = document.getElementById("time");
	displayTime();
	window.setInterval(displayTime,1000);
}

function changeColor(obj) {
	obj.style.backgroundColor="black";
}

function jar(id) {
	/** 
        调用接口访问数据库表apply2，呈现返回的信息
    */
    alert(id);
    alert("查看jar包信息功能待完善");
    /*
    var table = obj.parentNode.parentNode.parentNode;
    var tr = obj.parentNode.parentNode;
    table.removeChild(tr);*/
}

function machine(id) {
    /** 
        调用接口访问数据库表apply1，呈现返回的信息
    */  
    alert("查看机器信息功能待完善");
}

function displayTime() {
	time.innerHTML = new Date().toLocaleString();
}

function insertInfo() {
	var xmlhttp;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		xmlhttp = new ActiveXObject(Mircrosoft.XMLHTTP);
	}
	xmlhttp.open("GET","InsAppServlet",true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var responseText = xmlhttp.responseText;
			if(responseText == "true") {
				var x = "成功新增应用及相关信息";
				alert(x);
			} else {
				alert("添加失败，请检查输入的应用信息是否有效");
			}
			location.reload();
		}
	}
}

function deleteInfo() {
	var applicationId = window.prompt("请输入要删除的应用编号");
	if (applicationId == null) {
		return;
	}
	//判断是否符合格式，数字字符串
	var regPos = /^[0-9]+$/;
	if (!(regPos.test(applicationId))) {
		alert("输入格式错误");
		return;
	}
	var flag = window.confirm("您确定要删除应用编号为" + applicationId + "的相关信息吗？");
	if (!flag) {
		location.reload();
	}
	//ajax 交互
	var xmlhttp;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		xmlhttp = new ActiveXObject(Mircrosoft.XMLHTTP);
	}
	xmlhttp.open("GET","DeleteServlet?id=" + applicationId,true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var responseText = xmlhttp.responseText;
			if(responseText == "true") {
				var x = "编号为" + applicationId + "的应用及相关信息已删除";
				alert(x);
			} else {
				alert("删除失败，请检查输入的应用编号是否有效");
			}
			location.reload();
		}
	}
}

function updateInfo() {
	var applicationId = window.prompt("请输入要更新的应用编号");
	if (applicationId == null) {
		return;
	}
	//判断是否符合格式，数字字符串
	var regPos = /^[0-9]+$/;
	if (!(regPos.test(applicationId))) {
		alert("输入格式错误");
		return;
	}
	/**
		获取表单信息 
	*/
	var xmlhttp;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		xmlhttp = new ActiveXObject(Mircrosoft.XMLHTTP);
	}
	xmlhttp.open("GET","DeleteServlet?id=" + applicationId,true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var responseText = xmlhttp.responseText;
			if(responseText == "true") {
				var x = "编号为" + applicationId + "的应用及相关信息已删除";
				alert(x);
			} else {
				alert("删除失败，请检查输入的应用编号是否有效");
			}
			location.reload();
		}
	}
	/**
		收集新的表单信息
	 */
	
	var flag = window.confirm("您确定要更新应用编号为" + applicationId + "的相关信息吗？");
	if (!flag) {
		location.reload();
	}
	//ajax 交互
	var xmlhttp;
	if (window.XMLHttpRequest) {
		xmlhttp = new XMLHttpRequest();
	} else {
		smlhttp = new ActiveXObject(Mircrosoft.XMLHTTP);
	}
	xmlhttp.open("GET","DeleteServlet?id=" + applicationId,true);
	xmlhttp.send();
	xmlhttp.onreadystatechange = function() {
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var responseText = xmlhttp.responseText;
			if(responseText == "true") {
				var x = "编号为" + applicationId + "的应用及相关信息已删除";
				alert(x);
			} else {
				alert("删除失败，请检查输入的应用编号是否有效");
			}
			location.reload();
		}
	}
}

function display() {
	var item = document.getElementById("myForm");
	item.style.display = "block";
}

function hide() {
	var item = document.getElementById("myForm");
	item.style.display = "none";
}