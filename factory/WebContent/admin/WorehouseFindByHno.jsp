<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="${pageContext.request.contextPath }/admin/css/style.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="css/amazeui.min.css" />
		<link rel="stylesheet" href="css/admin.css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/admin/js/jquery.js"></script>

<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});

});
</script>


</head>


<body>

	<%-- ${ms } --%>
	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">数据表</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>仓库号号</th>
        <th>管理员工号</th>
        <th>管理员姓名</th>
        <th>管理员电话</th>
        <th>地址</th>
        <th>产品号</th>
        <th>产品名</th>
        <th>产品价格</th>
        <th>产品数量</th>
        <th>产品生产日期</th>
        <th>材料号</th>
        <th>材料名</th>
        <th>材料数量</th>
        <th>材料价格</th>
        </tr>
        </thead>
        <tbody>
        
        <tr>
        <td><input name="" type="checkbox" value="" /></td>
        <td>${ms.hno }</td>
        <td>${ms.hmanagerId }</td>
        <td>${ms.hmanagerName }</td>
        <td>${ms.htel }</td>
        <td>${ms.hlocation }</td>
        <td>${ms.pno }</td>
        <td>${ms.pname }</td>
        <td>${ms.pprice }</td>
        <td>${ms.wnumber }</td>
        <td>${ms.pcreatTime }</td>
        <td>${ms.mno }</td>
        <td>${ms.mname }</td>
        <td>${ms.mnum }</td>
        <td>${ms.mprice }</td>
        </tr>
        
        
      
        		
        </tbody>
    </table>
    
   
    <div class="pagin">
    	<div class="message">共<i class="blue">1256</i>条记录，当前显示第&nbsp;<i class="blue">1&nbsp;</i>页</div>
        <ul class="paginList">
        <li class="paginItem"><a href="javascript:;"><span class="pagepre"></span></a></li>
        <li class="paginItem"><a href="javascript:;">1</a></li>
        <li class="paginItem current"><a href="javascript:;">2</a></li>
        <li class="paginItem"><a href="javascript:;">3</a></li>
        <li class="paginItem"><a href="javascript:;">4</a></li>
        <li class="paginItem"><a href="javascript:;">5</a></li>
        <li class="paginItem more"><a href="javascript:;">...</a></li>
        <li class="paginItem"><a href="javascript:;">10</a></li>
        <li class="paginItem"><a href="javascript:;"><span class="pagenxt"></span></a></li>
        </ul>
    </div>
   <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>


</body>
</html>
