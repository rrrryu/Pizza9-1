<%@ page 
import="com.google.appengine.api.users.*" 
pageEncoding="utf-8"
contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
※ユーザ認証を行って下さい。<br>
<%
UserService userService = UserServiceFactory.getUserService();
User user = userService.getCurrentUser();
String msg;
if( user != null ){

  msg = "ようこそ!<br>あなたは <b>" + user.getNickname() + "</b> という名前でログインしています。<br><br>"
    +" <a href='index.html'>注文に進む</a>"+ " <a href='" + userService.createLogoutURL("/") + "'>サインアウト</a>";
  
}
else {

  msg = "こんにちは! こちらから "
    + "<a href='" + userService.createLoginURL("/auth/") + "'>サインイン</a> してください!";
}

System.out.println( msg );
%>
<p class="round"><%= msg %></p>
</body>
</html>