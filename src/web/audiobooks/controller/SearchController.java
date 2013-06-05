package web.audiobooks.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.audiobooks.data.factory.QueryFactory;
import web.audiobooks.data.template.QueryTemplate;
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
	
	/**
	 * 
	 * @param query
	 * @param model
	 * @return String link to main.jsp
 	 */
	
	@RequestMapping(value = "/getQuery.htm", method = RequestMethod.POST)
	public String getQuery(@ModelAttribute ("query") Query query, ModelMap model){
		//Query query = new Query();
		List<String> answer = queryTemplate.splitQuery(query.getQuery());
		
		int counter = 1;
		for(String i: answer){
			System.out.println(counter +" ---- "+i);
			counter++;
		}
		
		model.addAttribute("query", query);
		return "main";
	}
}
