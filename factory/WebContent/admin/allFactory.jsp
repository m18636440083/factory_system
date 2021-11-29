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

				<form action="${pageContext.request.contextPath }/FindFactory" method="post">
      <div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/admin/addFactory.jsp"> 新增</a></button>
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/FactoryFindAll"> 全部</a></button>
						</div>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">

				</div>
				
				<div class="am-u-sm-12 am-u-md-3">
					<div class="am-input-group am-input-group-sm">
						<input type="text" class="am-form-field" placeholder="请输入工厂名称" name="fname">
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
                </th><th class="table-title">厂名</th><th class="table-title">法定人</th><th class="table-title">工厂简介</th><th class="table-author am-hide-sm-only">注册日期</th><th class="table-date am-hide-sm-only">注册地</th><th class="table-set">操作</th>
              </tr>
              </thead>
              <c:forEach var="factory" items="${factory}">
              <tbody>
             	  <tr>
              	  <td>${factory.fname }</td>
              	  <td>${factory.fleader }</td>
              	  <td>${factory.fintroduction }</td>
               	  <td>${factory.fregistertTime }</td>
              	  <td>${factory.flocation }</td>
              	  <td>
                 	 <div class="am-btn-toolbar">
                 	   <div class="am-btn-group am-btn-group-xs">
                 	   <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span>
                 	    <a href="${pageContext.request.contextPath }/FindFactoryFname?fname=${factory.fname }">编辑</a></button>
                  	    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span>
                  	    <a href="${pageContext.request.contextPath }/DeleteFactory?fname=${factory.fname }" class="tablelink" onclick="return confirm('您确定要删除吗？')">删除</a></button>
                  	     
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
	</body>
</html>
