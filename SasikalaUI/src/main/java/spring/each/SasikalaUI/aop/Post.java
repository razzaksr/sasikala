package spring.each.SasikalaUI.aop;

public class Post 
{
	private String name, eligibility;
	private int vacancy, income;
	
	public String assignDirectly(String name)
	{
		this.name=name+" offerd By TamilNadu";
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Post [name=" + name + ", eligibility=" + eligibility + ", vacancy=" + vacancy + ", income=" + income
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEligibility() {
		return eligibility;
	}
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}
	public int getVacancy() {
		return vacancy;
	}
	public void setVacancy(int vacancy) {
		this.vacancy = vacancy;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
}
