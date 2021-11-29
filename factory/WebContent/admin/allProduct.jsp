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

				<form action="${pageContext.request.contextPath }/FindProduct" method="post">
      <div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/admin/addProduct.jsp"> 新增</a></button>
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/ProductFindAll"> 全部</a></button>
						</div>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">

				</div>
				
				<div class="am-u-sm-12 am-u-md-3">
					<div class="am-input-group am-input-group-sm">
						<input type="text" class="am-form-field" placeholder="请输入产品名称" name="pname">
						<span class="am-input-group-btn">
            <button class="am-btn am-btn-default" type="submit">搜索</button>
          </span>
					</div>
				</div>
				</form>
				
			</div>
      </div>
      <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table  class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                </th><th class="table-title">产品号</th><th class="table-title">仓库号</th><th class="table-title">产品名称</th><th class="table-title">价格</th><th class="table-type">车间编号</th><th class="table-author am-hide-sm-only">生产日期</th><th class="table-title">备注</th><th class="table-set">操作</th>
              </tr>
              </thead>
              <c:forEach var="product" items="${product}">
              <tbody>
             	  <tr>
              	  <td>${product.pno }</td>
              	  <td>${product.hno }</td>
              	  <td>${product.pname }</td>
               	  <td>${product.pprice }</td>
              	  <td>${product.wnumber }</td>
              	  <td>${product.pcreateTime }</td>
              	  <td>${product.premark }</td>
              	  <td>
                 	 <div class="am-btn-toolbar">
                 	   <div class="am-btn-group am-btn-group-xs">
                 	   <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span>
                 	    <a href="${pageContext.request.contextPath }/FindProductId?pno=${product.pno}">编辑</a></button>
                  	    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span>
                  	    <a href="${pageContext.request.contextPath }/DeleteProduct?pno=${product.pno }" class="tablelink" onclick="return confirm('您确定要删除吗？')">删除</a></button>
                  	     
               	     </div>
               	   </div>
              	  </td>
              	</tr>
           
              </tbody>
              </c:forEach>
            </table>
            <div class="am-cf">
              
            </div>
            <hr>
          </form>
        </div>

      </div>
    </div>
	总价为：${price }元
	</body>
</html>
