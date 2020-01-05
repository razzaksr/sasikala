package spring.each.SasikalaUI.daytwo;

public class Corporation 
{
	private Integer pinCode;
	private Demands demandsOne;
	private Demands demandsTwo;
	private Demands demandsThree;
	public Corporation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Corporation(Integer pinCode, Demands demandsOne, Demands demandsTwo, Demands demandsThree) {
		super();
		this.pinCode = pinCode;
		this.demandsOne = demandsOne;
		this.demandsTwo = demandsTwo;
		this.demandsThree = demandsThree;
	}
	@Override
	public String toString() {
		return "Corporation [pinCode=" + pinCode + ", demandsOne=" + demandsOne + ", demandsTwo=" + demandsTwo
				+ ", demandsThree=" + demandsThree + "]";
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public Demands getDemandsOne() {
		return demandsOne;
	}
	public void setDemandsOne(Demands demandsOne) {
		this.demandsOne = demandsOne;
	}
	public Demands getDemandsTwo() {
		return demandsTwo;
	}
	public void setDemandsTwo(Demands demandsTwo) {
		this.demandsTwo = demandsTwo;
	}
	public Demands getDemandsThree() {
		return demandsThree;
	}
	public void setDemandsThree(Demands demandsThree) {
		this.demandsThree = demandsThree;
	}
}
