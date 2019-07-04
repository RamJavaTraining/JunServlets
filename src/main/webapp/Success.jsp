<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.imcs.model.UserBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hello Welcome to JSP</h1>
<br>
<%! public int getUserID(int userID){
	
	return userID;
}
	%>

<% UserBean user1 = (UserBean) request.getAttribute("user");
%>
<jsp:useBean id="user" class="com.imcs.model.UserBean" scope="request">
  
</jsp:useBean>
<jsp:setProperty property="userName" name="user" value="IMCS"/>


Session : <%= session.getAttribute("userName") %>
<br>
Context : <%= application.getAttribute("userName") %>
<br>
Hello Mr : <%= user1.getUserName() %> 
<br>
Your User Id is :<%= user1.getUserID() %>


<br>
Your User Id from USE Bean  :<%= user.getUserID() %>
<br>
Your User Name from USE Bean  :<%= user.getUserName() %>

</body>
</html>