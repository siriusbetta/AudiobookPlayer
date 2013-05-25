package web.audiobooks.models;

import java.util.Date;
import java.util.List;

/**
 * <p>Data model of user's playlist</p>
 * @author Aleksey
 *
 */
public class Playlist {
	
	/**
	 * @value Integer playlistID;
	 */
	private int playlistID;
	
	/**
	 * @value Integer userID
	 */
	private int userID;
	/**
	 * <p>List of user's audio </p>
	 * @value List<Audio> audio 
	 */
	
	/**
	 * <p>List of user's audio</p>
	 * @value List<Audio> audio
	 */
	private List<Audio> playlist;
	
	/**
	 * <p>Time of last modification</p>
	 * @value Date timeOfModification
	 */
	private Date timeOfModification;
	
	public int getPlaylistID() {
		return playlistID;
	}
	public void setPlaylistID(int playlistID) {
		this.playlistID = playlistID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public Date getTimeOfModification() {
		return timeOfModification;
	}
	public void setTimeOfModification(Date timeOfModification) {
		this.timeOfModification = timeOfModification;
	}
	public List<Audio> getPlaylist() {
		return playlist;
	}
	public void setPlaylist(List<Audio> playlist) {
		this.playlist = playlist;
	}
	
}
