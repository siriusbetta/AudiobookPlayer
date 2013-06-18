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
<script>
function open_win(){
	myWindow=window.open('','','width=200,height=100')
	myWindow.document.write("<object type="application/x-shockwave-flash" data="player_mp3_multi.swf" width="200" height="20"><param name="movie" value="player_mp3_multi.swf" /><param name="FlashVars" value="mp3=test.mp3|test2.mp3" /></object>");
	myWindow.focus()}
</script>
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
						<form:label path="checkKeyWorb" class = "checkBoxKeyWorb">By key word</form:label>
					</div>
				</div>
				
				
			</div>
			</form:form>
			
			<div class = "searchresult">
						
						<c:choose>
						<c:when test="${answer!= null }">
						<c:set var = "playlist" value = ""></c:set>
						<c:forEach items = "${answer}" var = "item">
						<c:set var = "playlist" value = "${playlist}|${item.path}"></c:set>
												
						<div class = "showResult">
						<input type="checkbox" class = "playItem"><p>${item.author} - ${item.bookName}</p>
						
						<object class = "audioControls" type="application/x-shockwave-flash" data="/AudiobooksPlayer/player/player_mp3_maxi.swf" width="200" height="20">
     						<param name="movie" value="player_mp3_maxi.swf" />
     						<param name="FlashVars" value="mp3=/AudiobooksPlayer/audio/${item.path}&showinfo=1&showvolume=1" />
						</object>
						<div class = "button"><button>add</button></div>
						</div>
						</c:forEach> 
						
						<div class = "playAll"><input type="button" value="Play all" onclick="window.open('playlist ${playlist}.htm', 'newwindow', 'width=300, height=250');"></div>
						</c:when>
						
						
						
						<c:otherwise >
							<p>Nothing was found</p>
						</c:otherwise>
						</c:choose>
					</div>
				</div>
			
			
			
		
	<div class = "footer">
	
		<p class = "copyright">Copyright Alexey</p>
	</div>
	</div>
	
</body>
</html>