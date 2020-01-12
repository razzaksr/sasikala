package spring.each.SasikalaUI.daythree;

import org.springframework.stereotype.Component;

@Component
public class HeadSet 
{
	private String model;
	private int price;
	private String feature;
	@Override
	public String toString() {
		return "HeadSet [model=" + model + ", price=" + price + ", feature=" + feature + "]";
	}
	public HeadSet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HeadSet(String model, int price, String feature) {
		super();
		this.model = model;
		this.price = price;
		this.feature = feature;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
}
