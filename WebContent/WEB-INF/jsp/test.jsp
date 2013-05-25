<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Shit</title>

<script>
	function changeText(){
		info.innerHTML = "Hui";
	}
	
	function init(){
		audio = new Audio("audio/Linda1.mp3");
	}
	
	function player(command){
		if (command == 'play'){
			if (typeof(audio) == 'undefined'){
				init();}
			audio.play();
		}
		else if(command == 'stop'){
			audio.pause();
		}
		
		
	}
</script>

</head>
<body>
	<div id = "info">Info</div>
	<br>
	<audio id = "music"></audio>
	<button onclick="player('play')" value = "Play">Play</button>
	<button onclick="player('stop')" value = "Pause">Pause</button>
</body>
</html>