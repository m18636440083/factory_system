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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">材料管理</strong><small></small></div>
      </div>

      <hr>
      </div>
      
     <form action="${pageContext.request.contextPath }/UpdateMaterial" method="post">
     	<table border="0"  align="center"  width="400" length="500">
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<c:forEach var="material" items="${material}">
      		<input name="mno" type="hidden" value="${material.mno }" class="dfinput" />
      		<tr>
        		<td>材料名称：</td>
        		<td><input type="text" name="mname" value="${material.mname }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td>&nbsp;库&nbsp;存&nbsp;量：</td>
        		<td><input type="text" name="mnum" value="${material.mnum }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td>&nbsp;&nbsp;价&nbsp;&nbsp;&nbsp;&nbsp;格：</td>
        		<td><input type="text" name="mprice" value="${material.mprice }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
        		<td>&nbsp;&nbsp;备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
        		<td><textarea rows="3" cols="23" name="mremark" style="width:300px; height:35px;">${material.mremark }</textarea></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		</c:forEach>
      		<tr>
        		<td colspan="2">
           		&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="确认">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          		<input type="reset" value="重置">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          		<input type="button" class="btn" value="返回" onclick="javascript:history.back(-1);";/>
        		</td>   
      		</tr>
    	</table>
     </from>
    
	</body>
</html>
