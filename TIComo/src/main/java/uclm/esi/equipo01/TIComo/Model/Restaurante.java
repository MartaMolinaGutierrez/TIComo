package uclm.esi.equipo01.TIComo.Model;

public class Restaurante {
	private String restaurantName;
	private String socialReason;
	private String CIF;
	private String direction;
	private String phoneNumber;
	private String restaurantEmail;
	private String category;
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getSocialReason() {
		return socialReason;
	}
	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}
	public String getCIF() {
		return CIF;
	}
	public void setCIF(String cIF) {
		CIF = cIF;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRestaurantEmail() {
		return restaurantEmail;
	}
	public void setRestaurantEmail(String restaurantEmail) {
		this.restaurantEmail = restaurantEmail;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
