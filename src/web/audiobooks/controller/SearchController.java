package web.audiobooks.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.audiobooks.data.factory.QueryFactory;
import web.audiobooks.data.template.AudioTemplate;
import web.audiobooks.data.template.QueryTemplate;
import web.audiobooks.models.Audio;
import web.audiobooks.models.Query;

/**
 * <p>The class processes search queries by books name, authors, series</p>
 * @author Aleksey
 *
 */
@Controller
public class SearchController {
	/**
	 * <p>Singleton object for templates</p>
	 * @value factory
	 */
	QueryFactory factory = new QueryFactory();
	
	
	/**
	 * @value queryTemplate
	 */
	QueryTemplate queryTemplate = factory.querySearch();
	AudioTemplate audioTemplate = factory.queryAudio();
	/**
	 * 
	 * @param query
	 * @param model
	 * @return String link to main.jsp
 	 */
	
	@RequestMapping(value = "/getQuery.htm", method = RequestMethod.POST)
	public String getQuery(@ModelAttribute ("query") Query query, ModelMap model){
		
		
		List<Audio> answer = new ArrayList<Audio>();
		
		int min = 0;
		int max = 10;
		
		if(query.isCheckAuthor()){
			
			answer = audioTemplate.getRecordByAuthorName(query.getQuery(), min, max);
		
		}
		if(query.isCheckKeyWorb()){
			
			answer = audioTemplate.getRecordsByKeyWord(query.getQuery(), min, max);
			
		}
		
		if(!query.isCheckAuthor()&&!query.isCheckKeyWorb()){
			
			answer = audioTemplate.getRecord(query.getQuery(), min, max);
		}
		model.addAttribute("answer", answer);
		return "main";
	}
}
