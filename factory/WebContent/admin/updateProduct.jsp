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
      
     <form action="${pageContext.request.contextPath }/UpdateProduct" method="post">
     	<table border="0"  align="center"  width="400" length="500">
      		<tr>
      			<td style="width:300px; height:35px;"></td>
      		</tr>
      		<input name="pno" type="hidden" value="${product.pno }" class="dfinput" />
      		<tr>
        		<td align="center">仓&nbsp;&nbsp;库&nbsp;&nbsp;号：</td>
        		<td align="center"><input type="text" name="hno" value="${product.hno }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
      		<tr>
        		<td align="center">产品名称：</td>
        		<td align="center"><input type="text" name="pname" value="${product.pname }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
      		<tr>
        		<td align="center">价&nbsp;&nbsp;&nbsp;&nbsp;格：</td>
        		<td align="center"><input type="text" name="pprice" value="${product.pprice }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
      		<tr>
        		<td align="center">车间编号：</td>
        		<td align="center"><input type="text" name="wnumber" value="${product.wnumber }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
      		<tr>
        		<td align="center">生产日期：</td>
        		<td align="center"><input type="date" name="pcreateTime" value="${product.pcreateTime }" style="width:300px; height:35px;"></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
      		<tr>
        		<td align="center">备&nbsp;&nbsp;&nbsp;&nbsp;注：</td>
        		<td align="center"><textarea rows="5" cols="23" name="premark" value="${product.premark }" style="width:300px; height:60px;"></textarea></td>
      		</tr>
      		<tr>
      			<td style="width:300px; height:20px;"></td>
      		</tr>
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
