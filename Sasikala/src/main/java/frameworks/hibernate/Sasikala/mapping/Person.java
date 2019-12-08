package frameworks.hibernate.Sasikala.mapping;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String empName, empTeam;
	/*@OneToOne
	@JoinColumn(name="LapIden")
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}*/
	
	/*@OneToMany
	@JoinTable(name="Corporate",joinColumns=@JoinColumn(name="PERID"),
	inverseJoinColumns=@JoinColumn(name="LAPNO"))
	private Collection<Laptop> more=new ArrayList<Laptop>();
	
	public Collection<Laptop> getMore() {
		return more;
	}
	public void setMore(Collection<Laptop> more) {
		this.more = more;
	}*/
	
	@ManyToMany
	private Collection<Laptop> more=new ArrayList<Laptop>();
	
	public Collection<Laptop> getMore() {
		return more;
	}
	public void setMore(Collection<Laptop> more) {
		this.more = more;
	}
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [empId=" + empId + ", empName=" + empName + ", empTeam=" + empTeam + "]";
	}
	public Person(String empName, String empTeam) {
		this.empName = empName;
		this.empTeam = empTeam;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpTeam() {
		return empTeam;
	}
	public void setEmpTeam(String empTeam) {
		this.empTeam = empTeam;
	}
}
