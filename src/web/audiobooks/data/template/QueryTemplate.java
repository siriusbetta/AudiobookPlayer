package web.audiobooks.data.template;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import web.audiobooks.data.dao.QueryDao;
import web.audiobooks.data.mapper.AudioMapper;
import web.audiobooks.models.Audio;

/**
 * <p>Template for Query</p>
 * <p>Processes users search queries</p>
 * @author Aleksey
 * @category Template
 * @see QueryDao
 * @see Audio
 */


public class QueryTemplate implements QueryDao{
	DataSource dataSource;
	JdbcTemplate jdbcTemplate;
	
	/**
	 * @param DataSource dataSource
	 * <p>Set DataSource into the object</p>
	 */
	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	
	/**
	 * <p>Returns audio by name</p>
	 * @param String name
	 * @return List<Audio> audiosAnswer
	 */
	@Override
	public List<Audio> queryName(String name) {
		String SQL = "SELECT * FROM audio WHERE name LIKE '#?#'";
		List<Audio> audioAnswer = null;
		try{
			audioAnswer = jdbcTemplate.query(SQL, new AudioMapper(), name);
		} catch(EmptyResultDataAccessException e){
			return null;
		}
		return audioAnswer;
	}
	
	/**
	 * 
	 * <p>Returns audio by author name</p>
	 * @param String authorName
	 * @exception SQLException
	 * @return List<Audio> audiosAnswer
	 */
	@Override
	public List<Audio> queryAuthorName(String authorName) {
		String SQL = "SELECT * FROM audio WHERE name LIKE '#?#'";
		List<Audio> audioAnswer = null;
		try{
			audioAnswer = jdbcTemplate.query(SQL, new AudioMapper(), authorName);
		}catch(EmptyResultDataAccessException e){
			return null;
		}
		return audioAnswer;
	}
	
	/**
	 * <p>Returns audio by name, author name</p>
	 * @param String query
	 * @return List<Audio> audiosAnswer
	 */
	@Override
	public List<Audio> queryByQuery(String query) {
		List<String> words = splitQuery(query);
		List<Audio> audio = null;
		
		for (String word:words){
			List<Audio> bufer = queryName(word);
			//if (bufer != )
		}
		return null;
	}


	@Override
	public List<Audio> queryByKey(String queryKey) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * <p>Splits queries by each word</p>
	 * @param String query
	 * @return List<String> words
	 */
	public List<String> splitQuery(String query){
		/**
		 * <p>Return parameter</p>
		 * <p>List<String> words</p>
		 */
		List<String> words = new ArrayList<String>();
		
		System.out.println(query);
		/**
		 * <p>Qurey is splitted by comma</p>
		 * <p>String[] wordsComma</p>
		 */
		String[] wordsComma = query.split(",");
		/**
		 * <p>Qurey is splitted by space</p>
		 * <p>String[] wordsSpace</p>
		 */
		for(String w: wordsComma){
			System.out.println(w);
		}
		String[] wordSpace = null;
		for (String word : wordsComma){
			if(word.contains(" ")){
				wordSpace = word.split(" ");
				
				for (String spaceWord : wordSpace){
					
						words.add(spaceWord);
						System.out.println(spaceWord);
					
				}
			}else{
				words.add(word);
			}
		}
		return words;
	}
}
