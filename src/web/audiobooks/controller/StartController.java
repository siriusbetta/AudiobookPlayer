package web.audiobooks.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.audiobooks.models.Audio;
import web.audiobooks.models.Query;

/**
 * @author Aleksey
 *The class consists method of starting page
 */

@Controller
public class StartController {
	
	/**
	 * <p>Calling the main page</p>
	 * @request main.htm
	 * @param model ModelMap
	 * @return main String 
	 */
	@RequestMapping("/main.htm")
	public String main(ModelMap model){
		Query query = new Query();
		
		model.addAttribute("query", query);
		return "main";
	}
	
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
