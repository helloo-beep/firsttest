<%--
  Created by IntelliJ IDEA.
  User: CZL
  Date: 2021/7/21
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>1</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/onefile" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="myfile"><br/>
    文件描述:<input type="text" name="description"><br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
