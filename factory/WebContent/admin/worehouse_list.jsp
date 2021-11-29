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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">仓库管理</strong><small></small></div>
      </div>

      <hr>
      <div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span><a href="${pageContext.request.contextPath }/admin/worehouse_add.jsp"> 新增</a></button>
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
                </th><th class="table-id">仓库号</th><th class="table-title">管理员ID</th><th class="table-type">管理员姓名</th><th class="table-author am-hide-sm-only">管理员电话</th><th class="table-date am-hide-sm-only">地址</th><th class="table-date am-hide-sm-only">备注</th><th class="table-set">操作</th>
              </tr>
              </thead>
              <c:forEach var="m" items="${ms }">
              <tbody>
             	  <tr>
					<td>${m.hno }</td>
        			<td>${m.hmanagerId }</td>
        			<td>${m.hmanagerName }</td>
        			<td>${m.htel }</td>
        			<td>${m.hlocation }</td>
        			<td>${m.hremark }</td>
              	  <td>
                 	 <div class="am-btn-toolbar">
                 	   <div class="am-btn-group am-btn-group-xs">
                 	   <button class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span>
                 	    <a href="${pageContext.request.contextPath }/Worehouse_product_materalFindByHno?hno=${m.hno }">查看</a></button>
                  	    <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span>
                  	    <a href="${pageContext.request.contextPath }/WorehouseServletSelectByHno?hno=${m.hno }" >修改</a></button>
                  	     
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
