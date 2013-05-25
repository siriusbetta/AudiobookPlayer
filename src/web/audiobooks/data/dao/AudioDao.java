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
	
	public void setDataSource(DataSource dataSource);
	
	public void addRecord(Audio audio);
	
	public Audio getRecord(Integer audioID);
	
	public Audio getRecord(String bookName);
	
	public List<Audio> getRecords();
	
	public List<Audio> getRecordByAuthorName(String authorName);
	
	public void delete(Integer audioID);
	
	public void delete(String bookName);
	
	public void deleteByAuthorName(String authorName);
	
}
