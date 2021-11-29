<%@ page contentType="text/html; charset=utf-8" %> 
<%@ page pageEncoding="utf-8"%> 
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="css/reset.css" rel="stylesheet" />
    <link href="css/index.css" rel="stylesheet" />
    <title>登录页</title>
</head>
<body>
    <div class="LoginBox">
        <div class="VerticalCenteredBox">
            <div class="LoginHead">
                工厂自适应管理系统
            </div>
            <form action="${pageContext.request.contextPath }/LoginServlet" method="post">
            <div class="LoginUserBoxOut ">
                <div class="LoginUserBox mar_top30">
                    <input class="LoginUserInput" name="username" value="username" placeholder="请输入账号" />
                    <span>请输入账号</span>
                </div>
            </div>
            <div class="LoginUserBoxOut">
                <div class="LoginUserBox">
                    <input class="LoginUserInput" name="password" value="password" placeholder="请输入密码" type="password" />
                    <span>请输入密码</span>
                </div>
            </div>

            <div class="LoginUserBoxOut">

                <div class="LoginLastBox clearfix">
                    <div class="leftBox">
                        <input id="inputcheck" class="inputcheck" type="checkbox" name="inputcheck" />
                        <label for="inputcheck"></label>
                        <span>下次自动登录</span>
                    </div>
                    <div class="RightBox">
                    
                    	<input type="submit" value="登录" name="登录">
                    </div>
                </div>
            </div>
		</form>
        </div>
    </div>
</body>
</html>