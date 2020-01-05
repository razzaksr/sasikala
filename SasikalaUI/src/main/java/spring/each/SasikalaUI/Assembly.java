package spring.each.SasikalaUI;

public class Assembly 
{
	private Integer code, period;
	private String name, president;
	public Assembly() {
		super();
	}
	public Assembly(Integer code, Integer period, String name, String president) {
		super();
		this.code = code;
		this.period = period;
		this.name = name;
		this.president = president;
	}
	@Override
	public String toString() {
		return "Assembly [code=" + code + ", period=" + period + ", name=" + name + ", president=" + president + "]";
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public Integer getPeriod() {
		return period;
	}
	public void setPeriod(Integer period) {
		this.period = period;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
}
