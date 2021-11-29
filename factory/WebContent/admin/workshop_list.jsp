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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">车间管理</strong><small></small></div>
      </div>

      <hr>
      <div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/admin/workshop_add.jsp"> 新增</a></button>
						</div>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">

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
                <th class="table-id">车间号</th>
                <th class="table-title">厂名</th>
                <th class="table-type">车间主任</th>
                <th class="table-author am-hide-sm-only">车间主任电话</th>
                <th class="table-type">车间地址</th>
                <th class="table-date am-hide-sm-only">备注</th>
              </tr>
              </thead>
              <c:forEach var="m" items="${ms }">
              <tbody>
             	  <tr>
					<td>${m.wno }</td>
        			<td>${m.fname}</td>
        			<td>${m.wmanager }</td>
        			<td>${m.wtel }</td>
        			<td>${m.wlocation }</td>
        			<td>${m.wremark }</td>
              	  	<td>
                 	 <div class="am-btn-toolbar">
                 	   <div class="am-btn-group am-btn-group-xs">
                 	   <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span>
                 	    <a href="${pageContext.request.contextPath }/Workshop_product_materalFindByWno?wno=${m.wno }">查看</a></button>
                  	    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span>
                  	    <a href="${pageContext.request.contextPath }/WorkshopServletSelectByWno?wno=${m.wno }" >修改</a></button>
                  	    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span>
                  	    <a href="${pageContext.request.contextPath }/WorkshopServletDelete?wno=${m.wno }" class="tablelink" onclick="return confirm('您确定要删除吗？')">删除</a></button>
                  	     
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
        </div>

      </div>
    </div>
	</body>
</html>
