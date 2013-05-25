package web.audiobooks.data.dao;

import java.util.List;

import javax.sql.DataSource;

import web.audiobooks.models.Audio;

/***
 * 
 * @author Aleksey
 * @category Interface
 * The methods for operate with Audio data
 * @see Audio
 * @see AudioTemplate
 */
public interface AudioDao {
	/**
	 * <p>Set data source to the AudioTemplate class</p>
	 * @param DataSource dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * <p>Add record of object of Audio to database</p>
	 * @param Audio audio
	 */
	public void addRecord(Audio audio);
	
	/**
	 * <p>Get Audio object by audio ID</p>
	 * @param Integer audioID
	 * @return Audio audio
	 */
	public Audio getRecord(Integer audioID);
	
	/**
	 * <p>Get Audio object by book name</p>
	 * @param String bookName
	 * @return Audio audio
	 */
	public Audio getRecord(String bookName);
	
	/**
	 * <p>Get List of Audio objects</p>
	 * @return List<Audio> audio 
	 */
	public List<Audio> getRecords();
	
	/**
	 * <p>Get list of Audio objects by author name</p>
	 * @param String authorName
	 * @return List<Audio> audio
	 */
	public List<Audio> getRecordByAuthorName(String authorName);
	
	/**
	 * <p>Deletes record in database by audio ID</p>
	 * @param Integer audioID
	 */
	public void delete(Integer audioID);
	
	/**
	 * <p>Deletes record in database by book name</p>
	 * @param String bookName
	 */
	public void delete(String bookName);
	
	/**
	 * <p>Deletes record in database by author name</p>
	 * @param String authorName
	 */
	public void deleteByAuthorName(String authorName);
	
}
