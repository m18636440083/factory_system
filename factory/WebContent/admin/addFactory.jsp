<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/amazeui.min.css" />
		 <link rel="stylesheet" href="${pageContext.request.contextPath }/admin/css/admin.css" />
	</head>
	<body>
		<div class="admin-content-body">
      <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">工厂信息管理</strong><small></small></div>
      </div>

      <hr>
      </div>
      
     <form action="${pageContext.request.contextPath }/AddFactory" method="post">
     	<table border="0"  align="center" width="500" length="500">
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td align="center">厂&nbsp;&nbsp;&nbsp;&nbsp;名：</td>
        		<td align="center"><input type="text" name="fname" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td align="center">法&nbsp;定&nbsp;人：</td>
        		<td align="center"><input type="text" name="fleader" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td align="center">注&nbsp;册&nbsp;地：</td>
        		<td align="center"><input type="text" name="flocation" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td align="center">注册日期：</td>
        		<td align="center"><input type="date" name="fregistertTime" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td align="center">工厂简介：</td>
        		<td align="center"><textarea rows="5" cols="23" name="fintroduction" style="width:300px; height:60px;"></textarea></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td colspan="2" align="center">
           		<input type="submit" value="确认">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          		<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          		<input type="button" class="btn" value="返回" onclick="javascript:history.back(-1);";/>
        		</td>   
      		</tr>
    	</table>
     </from>
    
	</body>
</html>
