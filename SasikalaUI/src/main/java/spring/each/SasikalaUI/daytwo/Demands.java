package spring.each.SasikalaUI.daytwo;

import java.util.List;

import org.springframework.beans.factory.BeanNameAware;

public class Demands implements BeanNameAware
{
	private String bName;
	private Integer wardNo;
	private List<String> issues;
	private Integer promisingDays;
	public Demands() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demands(Integer wardNo, List<String> issues, Integer promisingDays) {
		super();
		this.wardNo = wardNo;
		this.issues = issues;
		this.promisingDays = promisingDays;
	}
	@Override
	public String toString() {
		return "Demands "+bName+ "[wardNo=" + wardNo + ", issues=" + issues + ", promisingDays=" + promisingDays + "]";
	}
	public Integer getWardNo() {
		return wardNo;
	}
	public void setWardNo(Integer wardNo) {
		this.wardNo = wardNo;
	}
	public List<String> getIssues() {
		return issues;
	}
	public void setIssues(List<String> issues) {
		this.issues = issues;
	}
	public Integer getPromisingDays() {
		return promisingDays;
	}
	public void setPromisingDays(Integer promisingDays) {
		this.promisingDays = promisingDays;
	}
	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		bName=name;
	}
}
