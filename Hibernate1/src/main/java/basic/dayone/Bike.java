package basic.dayone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bikeId;
	private String bikeModel;
	private Integer bikeMilage;
	private Double bikePrice;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeModel=" + bikeModel + ", bikeMilage=" + bikeMilage + ", bikePrice="
				+ bikePrice + "]";
	}
	public Bike(String bikeModel, int bikeMilage, double bikePrice) {
		super();
		this.bikeModel = bikeModel;
		this.bikeMilage = bikeMilage;
		this.bikePrice = bikePrice;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	public int getBikeMilage() {
		return bikeMilage;
	}
	public void setBikeMilage(int bikeMilage) {
		this.bikeMilage = bikeMilage;
	}
	public double getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(double bikePrice) {
		this.bikePrice = bikePrice;
	}
}
