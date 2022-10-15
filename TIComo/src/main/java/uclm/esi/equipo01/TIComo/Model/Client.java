package uclm.esi.equipo01.TIComo.Model;

import org.apache.commons.codec.digest.DigestUtils;

public class Client {

	private String userName;
	private String userSurname;
	private String userEmail;
	private String userpwd;
	private String userNIF;
	private String userDirection;
	private String userPhone;
	private boolean userActiveAccount;
	private String userObservation;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public String getUserNIF() {
		return userNIF;
	}

	public void setUserNIF(String userNIF) {
		this.userNIF = userNIF;
	}

	public String getUserDirection() {
		return userDirection;
	}

	public void setUserDirection(String userDirection) {
		this.userDirection = userDirection;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public boolean isUserActiveAccount() {
		return userActiveAccount;
	}

	public void setUserActiveAccount(boolean userActiveAccount) {
		this.userActiveAccount = userActiveAccount;
	}

	public String getUserObservation() {
		return userObservation;
	}

	public void setUserObservation(String userObservation) {
		this.userObservation = userObservation;
	}

	public void setPwd(String pwd) {
		this.userpwd = DigestUtils.sha512Hex(pwd);		
	}


}
