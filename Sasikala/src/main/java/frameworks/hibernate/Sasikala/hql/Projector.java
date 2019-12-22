package frameworks.hibernate.Sasikala.hql;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate=true)
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE,region="projector")
@Cacheable
@Table(name="visions")
//@NamedQuery(name="myOwnOne",query="select lumens from Projector")
//@NamedNativeQuery(name="myOwnTwo",query="select * from visions",resultClass=Projector.class)
public class Projector 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="modNum")
	private int proId;
	@Column(name="modName")
	private String item;
	@Column(name="modPrice")
	private double price;
	@Column(name="modLums")
	private int lumens;
	@Column(name="modHr")
	private int hours;
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
