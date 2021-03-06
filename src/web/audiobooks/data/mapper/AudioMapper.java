package web.audiobooks.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import web.audiobooks.models.Audio;


/**
 * 
 * @author Aleksey
 * @category Mapper
 * @see Audio
 * <p>
 * 	Class returns object Audio from Data Base
 * </p>
 *
 */
public class AudioMapper implements RowMapper<Audio>{
	/**
	 * @param ResultSet resultSet, Integer rowNumber
	 * <p>
	 * 	Object formed from audio's table in database
	 * </p>
	 * @return Audio audio 
	 * @exception SQLException If get exception return NULL
	 * 
	 */
	public Audio mapRow(ResultSet resultSet, int rowNumber) throws SQLException{
	/**
	 * <p>Creates new object Audio which mapping from table</p>
	 * @value Audio audio 
	 */
		Audio audio = new Audio();
		
		try{
			
			audio.setAudioID(resultSet.getInt("audioID"));
			
			audio.setAuthor(resultSet.getString("author"));
			
			audio.setBookName(resultSet.getString("bookName"));
			
			audio.setLength(resultSet.getDouble("length"));
			
			audio.setPath(resultSet.getString("path"));
			
		}catch(SQLException e){
			
			return null;
		}
		
		return audio;	
	}


}
