package uclm.esi.equipo01.TIComo.Model;

import org.apache.commons.codec.digest.DigestUtils;

public class Administrator {
	private String adminName;
	private String adminSurname;
	private String adminEmail;
	private String adminpwd;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminSurname() {
		return adminSurname;
	}
	public void setAdminSurname(String adminSurname) {
		this.adminSurname = adminSurname;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminpwd() {
		return adminpwd;
	}
	public void setAdminpwd(String adminpwd) {
		this.adminpwd =  DigestUtils.sha512Hex(adminpwd);		
	}
}
