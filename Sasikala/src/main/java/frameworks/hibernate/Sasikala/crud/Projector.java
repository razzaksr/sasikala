package frameworks.hibernate.Sasikala.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
public class Projector 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int proId;
	private String item;
	private double price;
	private int lumens, hours;
	@Override
	public String toString() {
		return "Projector [proId=" + proId + ", item=" + item + ", price=" + price + ", lumens=" + lumens + ", hours="
				+ hours + "]";
	}
	public Projector() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projector(String item, double price, int lumens, int hours) {
		super();
		this.item = item;
		this.price = price;
		this.lumens = lumens;
		this.hours = hours;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getLumens() {
		return lumens;
	}
	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
}
