package spring.each.SasikalaUI.daytwo;

import java.util.List;

import spring.each.SasikalaUI.Assembly;

public class Zone 
{
	private String parliment;
	private List<Assembly> wards;
	public void begin()
	{
		System.out.println("Bean Initiated");
	}
	public void end()
	{
		System.out.println("Bean Destroyed");
	}
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zone(String parliment, List<Assembly> wards) {
		super();
		this.parliment = parliment;
		this.wards = wards;
	}
	@Override
	public String toString() {
		return "Zone [parliment=" + parliment + ", wards=" + wards + "]";
	}
	public String getParliment() {
		return parliment;
	}
	public void setParliment(String parliment) {
		this.parliment = parliment;
	}
	public List<Assembly> getWards() {
		return wards;
	}
	public void setWards(List<Assembly> wards) {
		this.wards = wards;
	}
}
