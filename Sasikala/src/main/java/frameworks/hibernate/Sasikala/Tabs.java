package frameworks.hibernate.Sasikala;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="tablet")
public class Tabs implements Serializable 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tabId")
	private int id;
	@Column(name="tabModel")
	private String model;
	@Column(name="tabStock")
	private int qty;
	@Column(name="tabPrice")
	private double price;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="Tabs_Manucat", joinColumns=@JoinColumn(name="TabIden"))
	@GenericGenerator(name="increment-gen",strategy="increment")
	@CollectionId(columns= {@Column(name="VendorNumbers")},generator="increment-gen",type=@Type(type="int"))
	private Collection<Manufact> multi=new ArrayList<Manufact>();
	public Collection<Manufact> getMulti() {
		return multi;
	}
	public void setMulti(Collection<Manufact> multi) {
		this.multi = multi;
	}
	public Tabs() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Embedded
	private Manufact manufact;
	@Embedded
	@AttributeOverrides
	(
			{
			@AttributeOverride(name="name",column=@Column(name="cam_provider")),
			@AttributeOverride(name="origin",column=@Column(name="cam_place")),
			@AttributeOverride(name="rating",column=@Column(name="cam_feedback")),
			}
	)
	private Manufact manufact2;
	public Tabs(String model, int qty, double price, Manufact manufact, Manufact manufact2) {
		super();
		this.model = model;
		this.qty = qty;
		this.price = price;
		this.manufact = manufact;
		this.manufact2 = manufact2;
	}
	public Manufact getManufact2() {
		return manufact2;
	}
	public void setManufact2(Manufact manufact2) {
		this.manufact2 = manufact2;
	}*/
	/*public Tabs(String model, int qty, double price, Manufact manufact) {
		super();
		this.model = model;
		this.qty = qty;
		this.price = price;
		this.manufact = manufact;
	}*/
	public Tabs(String model, int qty, double price) {
		super();
		this.model = model;
		this.qty = qty;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Tabs [id=" + id + ", model=" + model + ", qty=" + qty + ", price=" + price + "]";
	}
	/*public Manufact getManufact() {
		return manufact;
	}
	public void setManufact(Manufact manufact) {
		this.manufact = manufact;
	}*/	
}