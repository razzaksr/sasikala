package spring.each.SasikalaUI.aop;

public class WaterBottle 
{
	private String brand;private int capacity, price;
	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", capacity=" + capacity + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
