package web.audiobooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.audiobooks.models.Audio;

/**
 * @author Aleksey
 *The class consists method of starting page
 */

@Controller
public class StartController {
	
	/**
	 * @param model
	 * @return String The path to main.jsp
	 */
	
	@RequestMapping("/test.htm")
	public String test(ModelMap model){
		/**
		 * @value audio The object of audio file
		 * @see Audio
		 */
				
		Audio audio = new Audio();
		model.addAttribute("audio", audio);
		return "player";
	}
}
