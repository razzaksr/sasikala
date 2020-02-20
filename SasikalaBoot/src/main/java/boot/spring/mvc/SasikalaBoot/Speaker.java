package boot.spring.mvc.SasikalaBoot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Speaker 
{
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer num;
	private Integer price;
	private String name;
	private String feature;
	private Double qty;// 2.1, 5.1, 7.1
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Speaker [num=" + num + ", price=" + price + ", name=" + name + ", feature=" + feature + ", qty=" + qty
				+ "]";
	}
}