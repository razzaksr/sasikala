package spring.each.SasikalaUI.daytwo;

import spring.each.SasikalaUI.Assembly;

public class District 
{
	private String dtName;
	private Assembly assembly1;
	private Assembly assembly2;
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	public District(String dtName, Assembly assembly1, Assembly assembly2) {
		super();
		this.dtName = dtName;
		this.assembly1 = assembly1;
		this.assembly2 = assembly2;
	}
	@Override
	public String toString() {
		return "District [dtName=" + dtName + ", assembly1=" + assembly1 + ", assembly2=" + assembly2 + "]";
	}
	public String getDtName() {
		return dtName;
	}
	public void setDtName(String dtName) {
		this.dtName = dtName;
	}
	public Assembly getAssembly1() {
		return assembly1;
	}
	public void setAssembly1(Assembly assembly1) {
		this.assembly1 = assembly1;
	}
	public Assembly getAssembly2() {
		return assembly2;
	}
	public void setAssembly2(Assembly assembly2) {
		this.assembly2 = assembly2;
	}
}
