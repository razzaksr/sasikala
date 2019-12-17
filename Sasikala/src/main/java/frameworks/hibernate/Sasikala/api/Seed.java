package frameworks.hibernate.Sasikala.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seed 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String name, type;
	private int duration, price;
	@Override
	public String toString() {
		return "Seed [sid=" + sid + ", name=" + name + ", type=" + type + ", duration=" + duration + ", price=" + price
				+ "]\n";
	}
	public Seed() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seed(String name, String type, int duration, int price) {
		super();
		this.name = name;
		this.type = type;
		this.duration = duration;
		this.price = price;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
