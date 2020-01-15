package spring.each.SasikalaUI.data;

public class Bike 
{
	private int bid,milage,price;
	private String model;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int milage, int price, String model) {
		super();
		this.milage = milage;
		this.price = price;
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", milage=" + milage + ", price=" + price + ", model=" + model + "]\n";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
