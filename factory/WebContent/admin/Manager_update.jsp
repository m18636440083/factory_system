<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/admin/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">修改仓库信息</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息${pageContext.request.contextPath }</span></div>
    <form action="${pageContext.request.contextPath }/ManagerServletUpdate" method="post">
    <ul class="forminfo">
    <input name="id" type="hidden" value="${m.id }" class="dfinput" />
    <li><label>管理员姓名</label><input name="mname" type="text" class="dfinput" /><i></i></li>
    <li><label>用户名</label><input name="username" type="text" class="dfinput" /><i></i></li>
    <li><label>密码</label><input name="password" type="password" class="dfinput" value="" /></li>
    <li><label>电话</label><input name="mtel" type="text" class="dfinput" /><i></i></li>
    <li><label>邮箱</label><input name="memail" type="text" class="dfinput" /><i></i></li>
    <li><label>种类</label><input name="mcategory" type="text" class="dfinput" /><i></i></li>
    <li><label>备注</label><textarea name="mremark" cols="" rows="" class="textinput"></textarea></li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
    </ul>
    </form>
    
    </div>



</body>
</html>
