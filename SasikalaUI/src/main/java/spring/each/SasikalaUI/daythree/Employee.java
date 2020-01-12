package spring.each.SasikalaUI.daythree;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Manipulation
{
	private List<String> staffs=new ArrayList<String>();

	@Override
	public String toString() {
		return "Employee [staffs=" + staffs + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(List<String> staffs) {
		super();
		this.staffs = staffs;
	}

	public List<String> getStaffs() {
		return staffs;
	}

	public void setStaffs(List<String> staffs) {
		this.staffs = staffs;
	}

	@Override
	public void update(int pos, Object obj) {
		// TODO Auto-generated method stub
		if(staffs.get(pos)!=null)
		{
			staffs.set(pos, (String)obj);System.out.println("Replacement done @"+pos);
		}
	}

	@Override
	public Object erase() {
		// TODO Auto-generated method stub
		if(!staffs.isEmpty())
		{
			return staffs.remove(0);
		}
		return null;
	}

	@Override
	public Object erase(int index) {
		// TODO Auto-generated method stub
		if(staffs.get(index)!=null)
		{
			return staffs.remove(index);
		}
		return null;
	}

	@Override
	public int findOne(Object obj) {
		// TODO Auto-generated method stub
		if(staffs.contains((String)obj))
		{
			return staffs.indexOf((String)obj);
		}
		return -1;
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		for(String y:staffs)
		{
			System.out.println(y);
		}
	}
}
