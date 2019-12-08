package frameworks.hibernate.Sasikala;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Manufact 
{
	@Column(name="vendor")
	private String name;
	@Column(name="country")
	private String origin;
	@Column(name="reviews")
	private int rating;
	public Manufact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manufact(String name, String origin, int rating) {
		super();
		this.name = name;
		this.origin = origin;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Manufact [name=" + name + ", origin=" + origin + ", rating=" + rating + "]";
	}	
}
