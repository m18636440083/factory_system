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
    <form action="${pageContext.request.contextPath }/WorehouseServletUpdate" method="post">
    <ul class="forminfo">
    <input name="hno" type="hidden" value="${m.hno }" class="dfinput" />
    <li><label>管理员ID</label><input name="hmanagerId" type="text" value="${m.hmanagerId }" class="dfinput" /><i>数字</i></li>
    <li><label>管理员姓名</label><input name="hmanagerName" type="text" class="dfinput" value="${m.hmanagerName }"/></li>
    <li><label>电话</label><input name="htel" type="text" class="dfinput" value="${m.htel }" /></li>
    <li><label>地址</label><input name="hlocation" type="text" class="dfinput" value="${m.hlocation }" /></li>
    <li><label>备注</label><textarea name="hremark" cols="" rows="" class="textinput">${m.hremark }</textarea></li>
    <li><label>&nbsp;</label><input name="" type="submit" class="btn" value="确认保存"/></li>
    </ul>
    </form>
    
    </div>



</body>
</html>
