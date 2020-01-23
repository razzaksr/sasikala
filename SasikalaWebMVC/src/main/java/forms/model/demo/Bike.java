package forms.model.demo;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Bike 
{
	private Integer bid,milage,price;
	private String model;
	private Date manufactured;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int milage, int price, String model, Date manufactured) {
		super();
		this.milage = milage;
		this.price = price;
		this.model = model;
		this.manufactured = manufactured;
	}

	public Bike(int bid, int milage, int price, String model, Date manufactured) {
		super();
		this.bid = bid;
		this.milage = milage;
		this.price = price;
		this.model = model;
		this.manufactured = manufactured;
	}

	@Override
	public String toString() {
		return "Bike [bid=" + bid + ", milage=" + milage + ", price=" + price + ", model=" + model + ", manufactured="
				+ manufactured + "]";
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public Integer getMilage() {
		return milage;
	}
	public void setMilage(Integer milage) {
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

	public Date getManufactured() {
		return manufactured;
	}

	public void setManufactured(Date manufactured) {
		this.manufactured = manufactured;
	}
}
