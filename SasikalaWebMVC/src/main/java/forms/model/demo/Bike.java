package forms.model.demo;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Bike 
{
	private Integer bid;
	@Max(50)
	@Min(20)
	private Integer milage;
	private Integer price;
	@Pattern(regexp="[^0-9]*")
	@Size(max=15,min=4)
	private String model;
	@Past
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

	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public Integer getPrice() {
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
