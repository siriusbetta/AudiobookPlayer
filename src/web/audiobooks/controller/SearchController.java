package web.audiobooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.audiobooks.models.Query;

/**
 * <p>The class processes search queries by books name, authors, series</p>
 * @author Aleksey
 *
 */
@Controller
public class SearchController {
	@RequestMapping("/getQuery.htm")
	public String getQuery(ModelMap model){
		Query query = new Query();
		model.addAttribute("query", query);
		return "main";
	}
}
