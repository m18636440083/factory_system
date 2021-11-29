<%@ page contentType="text/html; charset=utf-8" %> 
<%@ page pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>工厂自适应后台模板</title>
		<link rel="stylesheet" href="css/layui.css">
	</head>

	<body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header">
				<div class="layui-logo">工厂自适应后台管理</div>
				<!-- 头部区域（可配合layui已有的水平导航） -->

				<ul class="layui-nav layui-layout-right">
					<li class="layui-nav-item">
						<a href="javascript:;">
							<img src="images/1.gif" class="layui-nav-img"> 管理员
						</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="">基本资料</a>
							</dd>
							<dd>
								<a href="">安全设置</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="index00.html">退了</a>
					</li>
				</ul>
			</div>

			<div class="layui-side layui-bg-black">
				<div class="layui-side-scroll">
					<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
					<ul class="layui-nav layui-nav-tree" lay-filter="test">
						<li class="layui-nav-item layui-nav-itemed">
							<a class="" href="javascript:;">菜单栏</a>
							<dl class="layui-nav-child">
								<dd>
									<a href="${pageContext.request.contextPath }/ManagerServletList" target="right">管理员</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath }/FactoryFindAll" target="right">工厂信息</a>
								</dd>
								<dd>
									<a href="news.html" target="right">员工管理</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath }/WorehouseServletList" target="right">仓库管理</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath }/WorkshopServletList" target="right">车间管理</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath }/ProductFindAll" target="right">产品管理</a>
								</dd>
								<dd>
									<a href="${pageContext.request.contextPath }/MatericalFindAll" target="right">材料管理</a>
								</dd>
								<dd>
									<a href="javascript:void(0)"  onclick="updatePwd('修改密码',1)">修改密码</a>
								</dd>
							</dl>
						</li>			
					</ul>
				</div>
			</div>

			<div class="layui-body" style="z-index: 0;">
				<!-- 内容主体区域 -->
				<div style="padding: 15px;">
					<iframe src="product.html" name="right" frameborder="0" width="100%" height="1200"></iframe>

				</div>
			</div>

			<div class="layui-footer">
				<!-- 底部固定区域 -->
				底部固定区域
			</div>
		</div>
		
		<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
		<script type="text/javascript" src="myplugs/js/plugs.js">
		</script>
		<script type="text/javascript">
			//添加编辑弹出层
			function updatePwd(title, id) {
				$.jq_Panel({
					title: title,
					iframeWidth: 500,
					iframeHeight: 300,
					url: "updatePwd.html"
				});
			}
		</script>
		<script src="js/layui.js"></script>
		<script>
			//JavaScript代码区域
			layui.use('element', function() {
				var element = layui.element;

			});
		</script>
	</body>

</html>