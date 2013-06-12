<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listen audio books which you like</title>
<link rel = "stylesheet" type = "text/css" href = "/AudiobooksPlayer/css/main.css">
</head>
<body>
	<div class = "body">
		<div class = "head">head</div>
		<div class = "background">
			<div class = "welcomePicture"></div>
			<div class = "login">
				<input class = "log" type = "text">
				<input class = "pass" type = "text">
				
				<input class = "submit" type = "submit">
				
				<a  class = "link" href = "login.hmt">Registration</a>
				
			</div>
			<div class = "prop"></div>
			<div class = "welcomeLogo">Search and Listen what you want</div>
			
			<!-- Query form -->
			
			<form:form method = "post" action = "/AudiobooksPlayer/getQuery.htm" commandName = "query">
			<div class = "searchLineContainer">
				<div class = "searchLine">
					<form:input path="query" class = "searchLineEdit" size = "50"/>
					<!--  <input class = "searchLineEdit" type = "text" size = "50"> -->
					<input class = "submitSearch" type = "submit">
					<div class = "checkBox">
					
						<form:checkbox path="checkAuthor" class = "checkBoxAuthor"/>
						<form:label path="checkAuthor" class = "checkBoxAuthor">By author</form:label>
						
						<form:checkbox path="checkKeyWorb" class = "checkBoxKeyWorb"/>
						<form:label path="checkKeyWorb" class = "checkBoxKeyWorb">By key worb</form:label>
					</div>
				</div>
				
			</div>
			<c:if test="${answer!= null }">
				${fn:length(answer)}
			</c:if>
			</form:form>
			
			
		</div>
	<div class = "footer"></div>
	</div>
</body>
</html>