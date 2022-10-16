<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP/Servlet/Strutsの学習用プロジェクト</title>
</head>
<body>
	<h1>TEST：Webサーバ正常に接続完了！！</h1>
	<!-- actionに設定するのは、内部処理を実装するservletのファイル名(※拡張子.javaは不要) -->
	<FORM method="GET" action="TestSend">
	   入力項目① ： <INPUT type="text" name="testvalue1"><br><br>
	   入力項目② ： <INPUT type="text" name="testvalue2"><br><br>
	   <INPUT type="submit" name="testpage" value="送信">
	</FORM>
</body>
</html>