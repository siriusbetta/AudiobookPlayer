<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#play-bt").click(function(){
			audio2 = new Audio();
			audio2.src = "audio/Linda2.mp3";
			audio2.play();
			$("#message").text("Music started");
		})
 
		$("#pause-bt").click(function(){
			$("#audio-player")[0].pause();
			$("#message").text("Music paused");
		})
 
		$("#stop-bt").click(function(){
			$("#audio-player")[0].pause();
			$("#audio-player")[0].currentTime = 0;
			$("#message").text("Music Stopped");
		})
	});
	
</script>
<script>
function init(){
	audio1 = new Audio();
	audio1.src = "audio/Linda1.mp3";
	audio2 = new Audio();
	audio2.src = "audio/Linda2.mp3";
}

function onchange(){
	alert("asd");
	audio1 = new Audio( "audio/Linda1.mp3");
	audio1.play();
	
};	
</script>
<script type="text/javascript">
function init()
{
var p = document.getElementById("foo");
// NOTE: showAlert(); or showAlert(param); will NOT work here.
// Must be a reference to a function name, not a function call.
p.onclick = showAlert;

}
function showAlert()
{
	
		audio1 = new Audio( "audio/Linda1.mp3");
		audio1.play();
	
}
</script>

</head>
<body onload = "init()">
	<h1>${hello}</h1>
	<br>
	<p>Линда - Северный ветер</p>
	
	<audio controls>
		<source src="audio/Linda1.mp3" type="audio/mpeg"></source>
	</audio>
	<form:form method = "post" action = "/AudioPlayer/hello.htm" commandName = "audio">
	<form:select path="path">
		<form:option value="audio/Linda3.mp3" label = "3"></form:option>
								
								<form:option value="audio/Linda1.mp3" label = "1"></form:option>
								<form:option value="audio/Linda2.mp3" label = "2"></form:option>
							</form:select>	
	</</form:form>
	
	<audio id="audio-player" name="audio-player" >
		<source src="audio/Linda1.mp3"></source>
		
	</audio>
<div id="message"></div>
<a id="play-bt" href="#">Play music</a> | 
<a id="pause-bt" href="#">Pause music</a> | 
<a id="next-bt" href="#">Next music</a> |
<a id="stop-bt" href="#">Stop music</a>
<br>

<span id="foo">My Event Element</span>

</body>
</html>