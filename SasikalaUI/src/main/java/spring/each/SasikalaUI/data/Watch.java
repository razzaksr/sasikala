package spring.each.SasikalaUI.data;

public class Watch 
{
	private String model,os;
	private boolean isWifi,isBluetooth;
	private int watchId,price;
	@Override
	public String toString() {
		return "Watch [model=" + model + ", os=" + os + ", isWifi=" + isWifi + ", isBluetooth=" + isBluetooth
				+ ", watchId=" + watchId + ", price=" + price + "]\n";
	}
	public Watch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Watch(String model, String os, boolean isWifi, boolean isBluetooth, int price) {
		super();
		this.model = model;
		this.os = os;
		this.isWifi = isWifi;
		this.isBluetooth = isBluetooth;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public boolean isWifi() {
		return isWifi;
	}
	public void setWifi(boolean isWifi) {
		this.isWifi = isWifi;
	}
	public boolean isBluetooth() {
		return isBluetooth;
	}
	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}
	public int getWatchId() {
		return watchId;
	}
	public void setWatchId(int watchId) {
		this.watchId = watchId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
