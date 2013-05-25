package web.audiobooks.data.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.audiobooks.data.template.AudioTemplate;


/**
 * 
 * @author Aleksey
 *
 *  @category Factory
 *  <p>
 *  	The class returns Template objects 
 *  </p>
 */
public class QueryFactory {
	/**
	 * <p>Return audio template with queries</p>
	 * @return AudioTemplate audioTemplate 
	 */
	public AudioTemplate queryBag(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AudioTemplate audioTemplate = (AudioTemplate)context.getBean("audioTemplate");
		return audioTemplate;
	}
}
