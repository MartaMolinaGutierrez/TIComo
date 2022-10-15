package uclm.esi.equipo01.TIComo.Model;

public class Plate {
	private String plateName;
	private String picture;
	private String description;
	private boolean vegan;
	public String getPlateName() {
		return plateName;
	}
	public void setPlateName(String plateName) {
		this.plateName = plateName;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isVegan() {
		return vegan;
	}
	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
}
