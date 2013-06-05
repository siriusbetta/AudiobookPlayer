package web.audiobooks.data.dao;

import java.util.List;

import javax.sql.DataSource;

import web.audiobooks.models.Audio;

/**
 * <p>There are methods which work with search queries</p>
 * @author Aleksey
 * @category Interface
 * @see Audio
 */
public interface QueryDao {
	/**
	 * <p>Set data source to the QueryTemplate class</p>
	 * @param DataSource dataSource
	 */
	public void setDataSource(DataSource dataSource);
	
	/**
	 * <p>Search audio by name</p>
	 * @param name
	 * @return List<Audio>
	 */
	public List<Audio> queryName(String name);
	
	/**
	 * <p>Search audio by author name</p>
	 * @param authorName
	 * @return List<Audio>
	 */
	
	public List<Audio> queryAuthorName(String authorName);
	
	/**
	 * <p>Search audio by query</p>
	 * @param query
	 * @return List<Audio>
	 */
	public List<Audio> queryByQuery(String query);
	
	/**
	 * <p>Search audio by key words</p>
	 * @param queryKey
	 * @return List<Audio>
	 */
	public List<Audio> queryByKey(String queryKey);
	
}
