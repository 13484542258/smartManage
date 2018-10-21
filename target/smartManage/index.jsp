<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>后台管理系统</title>
    </head>
    <body>
        <form action="user/login" method="post">
            <div>
                用户名：<input type="text" id="username" name="username"><br/>
                密码：<input type="password" id="password" name="password"><br/>
                <input type="submit" value="登陆">
            </div>
        </form>
    </body>
</html>
