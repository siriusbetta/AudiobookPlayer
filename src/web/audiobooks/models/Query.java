package web.audiobooks.models;
/**
 * <p>The model of query</p>
 * @author Aleksey
 * 
 */
public class Query {
	/**
	 * <p>Query</p>
	 */
	private String query;
	
	private boolean checkAuthor;
	
	private boolean checkKeyWorb;
	
	public boolean isCheckAuthor() {
		return checkAuthor;
	}

	public void setCheckAuthor(boolean checkAuthor) {
		this.checkAuthor = checkAuthor;
	}

	public boolean isCheckKeyWorb() {
		return checkKeyWorb;
	}

	public void setCheckKeyWorb(boolean checkKeyWorb) {
		this.checkKeyWorb = checkKeyWorb;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

}
