package web.audiobooks.models;

/**
 * @author Aleksey
 *The file is data model of audio file. Can be mp3 or ogg formats
 */
public class Audio {
	/**
	 * <p>The ID of audio file into the database</p>
	 * @value Audio audioID 
	 */
	private int audioID;

	/**
	 * <p>The path is where located file</p>
	 * @value String path
	 */
	private String path;
	
	/**
	 * <p>The author of the book</p>
	 * @value String author 
	 */
	private String author;
	
	/**
	 * <p>The length of the file</p>
	 * @value Double length
	 */
	private double length;
	
	/**
	 * <p>The name of the book</p>
	 * @value String bookName
	 */
	private String bookName;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
		
	public int getAudioID() {
		return audioID;
	}

	public void setAudioID(int audioID) {
		this.audioID = audioID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
