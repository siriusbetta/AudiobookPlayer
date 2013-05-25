package web.audiobooks.models;

/**
 * @author Aleksey
 *The file is data model of audio file. Can be mp3 or ogg formats
 */
public class Audio {
	/**
	 * @value audioID The ID of audio file into the database
	 */
	private int audioID;

	/**
	 * @value path - The path is where located file
	 */
	private String path;
	
	/**
	 * @value The author of the book
	 */
	private String author;
	
	/**
	 * @value The length of the file
	 */
	private double length;
	
	/**
	 * The name of the book
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
