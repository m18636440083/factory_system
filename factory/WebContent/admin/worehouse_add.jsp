<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">添加仓库</a></li>
    </ul>
    </div>
    
    <div class="formbody">
    
    <div class="formtitle"><span>基本信息${pageContext.request.contextPath }</span></div>
    <form action="${pageContext.request.contextPath }/WorehouseServletAdd" method="post">
    <ul class="forminfo">
    <li><label>仓库号</label><input name="hno" type="text" class="dfinput" /><i>数字</i></li>
    <li><label>管理员ID</label><input name="hmanagerId" type="text" class="dfinput" /><i>数字</i></li>
    <li><label>管理员名字</label><input name="hmanagerName" type="text" class="dfinput" /><i></i></li>
    <li><label>联系方式</label><input name="htel" type="text" class="dfinput" value="" /></li>
    <li><label>地址</label><input name="hlocation" type="text" class="dfinput" value="" /></li>
    <li><label>备注</label><textarea name="hremark" cols="" rows="" class="textinput"></textarea></li>
    <li><label>&nbsp;</label><input name="保存" type="submit" class="" value="确认保存"/></li>
    </ul>
    </form>
    
    </div>



</body>
</html>
