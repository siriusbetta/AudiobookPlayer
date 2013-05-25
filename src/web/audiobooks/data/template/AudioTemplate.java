package web.audiobooks.data.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import web.audiobooks.data.dao.AudioDao;
import web.audiobooks.data.mapper.AudioMapper;
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
	
	/**
	 * <p>Adds to database object Audio</p>
	 * @param Audio audio 
	 */
	@Override
	public void addRecord(Audio audio) {
		String SQL = "INSERT INTO audio (path, author, length, bookName) VALUES (?, ?, ?, ?)";
		String path = audio.getPath();
		String author = audio.getAuthor();
		Double length = audio.getLength();
		String bookName = audio.getBookName();
		
		jdbcTemplate.update(SQL, path, author, length, bookName);
	}
	
	
	/**
	 * <p>Get record from database by audio Id</p>
	 * @param Integer audioID
	 * @return Audio audio
	 */
	@Override
	public Audio getRecord(Integer audioID) {
		String SQL = "SELECT * FROM audio WHERE audioID = ?";
		Audio audio = jdbcTemplate.queryForObject(SQL,new  Object[]{audioID}, new AudioMapper());
		return audio;
	}

	
	/**
	 * <p>Get record from database by book name</p>
	 * @param String bookName
	 * @return Audio audio
	 */
	@Override
	public Audio getRecord(String bookName) {
		String SQL = "SELECT * FROM audio WHERE bookName = ?";
		Audio audio = jdbcTemplate.queryForObject(SQL,new  Object[]{bookName}, new AudioMapper());
		return audio;
	}

	
	/**
	 * <p>Get records all from database</p>
	 * @return List of Audio audio
	 */
	@Override
	public List<Audio> getRecords() {
		String SQL = "SELECT * FROM audio";
		List<Audio> audio = jdbcTemplate.query(SQL, new AudioMapper());
		return audio;
	}

	/**
	 * <p>Get records from database by author name Id</p>
	 * @return List of Audio audio
	 */
	@Override
	public List<Audio> getRecordByAuthorName(String authorName) {
		String SQL = "SELECT * FROM audio WHERE author = ?";
		List<Audio> audio = jdbcTemplate.query(SQL, new AudioMapper(), authorName);
		return audio;
	}

	
	/**
	 * <p>Delete record from audio by audio ID</p>
	 * @param Integer audioID
	 */
	@Override
	public void delete(Integer audioID) {
		String SQL = "DELTE FROM audio WHERE audioID = ?";
		jdbcTemplate.update(SQL, audioID);		
	}

	
	/**
	 * <p>Delete record from audio by book name</p>
	 * @param String bookName
	 */
	@Override
	public void delete(String bookName) {
		String SQL = "DELTE FROM audio WHERE bookName = ?";
		jdbcTemplate.update(SQL, bookName);
		
	}

	
	/**
	 * <p>Delete record from audio by author name</p>
	 * @param String authorName
	 */
	@Override
	public void deleteByAuthorName(String authorName) {
		String SQL = "DELTE FROM audio WHERE author = ?";
		jdbcTemplate.update(SQL, authorName);
		
	}

}
