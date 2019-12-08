package frameworks.hibernate.Sasikala.mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop 
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int lapId;
	private String model, feature;
	private int ram;
	private double price;
	/*@ManyToOne
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}*/
	
	@ManyToMany(mappedBy="more")
	private Collection<Person> extra=new ArrayList<Person>();
	public Collection<Person> getExtra() {
		return extra;
	}
	public void setExtra(Collection<Person> extra) {
		this.extra = extra;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", feature=" + feature + ", ram=" + ram + ", lapId=" + lapId + ", price="
				+ price + "]";
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String model, String feature, int ram, double price) {
		super();
		this.model = model;
		this.feature = feature;
		this.ram = ram;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
	}
}
