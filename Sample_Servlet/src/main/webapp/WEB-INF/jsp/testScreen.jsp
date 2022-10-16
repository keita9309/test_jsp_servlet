<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="testbean" scope="session" class="test.TestBean" />
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>次の画面</title>
</head>
    <body>
        <p>
            入力した値①：<jsp:getProperty name="testbean" property="testvalue1" />
            <br>
            入力した値②：<jsp:getProperty name="testbean" property="testvalue2" />
        </p>
    </body>
</html>