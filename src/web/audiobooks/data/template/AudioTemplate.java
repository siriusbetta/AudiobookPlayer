package web.audiobooks.data.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.audiobooks.data.dao.AudioDao;
import web.audiobooks.models.Audio;

/**
 * 
 * @author Aleksey
 * <p>The class consists methods SQL queries to database</p>
 * @category Template
 * 
 */
public class AudioTemplate implements AudioDao{
	
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
	
	@Override
	public void addRecord(Audio audio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Audio getRecord(Integer audioID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Audio getRecord(String bookName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audio> getRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Audio> getRecordByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer audioID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String bookName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByAuthorName(String authorName) {
		// TODO Auto-generated method stub
		
	}

}
