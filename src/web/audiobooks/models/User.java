package web.audiobooks.models;

import java.util.Date;
import java.util.List;

/**
 * @author Aleksey
 *The class data model of user
 */
public class User {
	/**
	 * @value userIDUser ID into the database
	 */
	private Integer userID;
	
	/**
	 * @value name The user's name
	 */
	private String name;
	
	/**
	 * @value password Password
	 */
	private String password;
	
	/**
	 * @value playlist The list of audio files which were added by user for playing
	 */
	private List<String> playList;
	
	/**
	 * @value dateOfRegistration Date of user's registration on site
	 */
	private Date dateOfRegistration;

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getPlayList() {
		return playList;
	}

	public void setPlayList(List<String> playList) {
		this.playList = playList;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	
	

}
