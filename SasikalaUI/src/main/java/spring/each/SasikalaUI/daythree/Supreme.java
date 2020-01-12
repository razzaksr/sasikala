package spring.each.SasikalaUI.daythree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Supreme 
{
	private HeadSet head1,head2,head3;

	@Override
	public String toString() {
		return "Supreme [head1=" + head1 + ", head2=" + head2 + ", head3=" + head3 + "]";
	}

	public HeadSet getHead1() {
		return head1;
	}
	
	@Autowired
	@Qualifier("pointingone")
	public void setHead1(HeadSet head1) {
		this.head1 = head1;
	}

	public HeadSet getHead2() {
		return head2;
	}
	@Autowired
	@Qualifier("pointingtwo")
	public void setHead2(HeadSet head2) {
		this.head2 = head2;
	}

	@Autowired
	public HeadSet getHead3() {
		return head3;
	}

	public void setHead3(HeadSet head3) {
		this.head3 = head3;
	}
}
