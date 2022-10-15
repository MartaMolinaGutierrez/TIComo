package uclm.esi.equipo01.TIComo.Model;

import java.util.ArrayList;

public class Order {
	private String state;
	private Restaurante restaurant;
	private Client client;
	private Rider rider;
	private ArrayList<Plate> plates;
	private double price;
	public Order(String state, Restaurante restaurant, Client client, Rider rider, ArrayList<Plate> plates,
			double price) {
		super();
		this.state = state;
		this.restaurant = restaurant;
		this.client = client;
		this.rider = rider;
		this.plates = plates;
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Restaurante getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurante restaurant) {
		this.restaurant = restaurant;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Rider getRider() {
		return rider;
	}
	public void setRider(Rider rider) {
		this.rider = rider;
	}
	public ArrayList<Plate> getPlates() {
		return plates;
	}
	public void setPlates(ArrayList<Plate> plates) {
		this.plates = plates;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
