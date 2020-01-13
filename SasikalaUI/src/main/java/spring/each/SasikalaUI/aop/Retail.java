package spring.each.SasikalaUI.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Retail 
{
	private WaterBottle bottleA,bottleB;

	@Override
	public String toString() {
		return "Retail [bottleA=" + bottleA + ", bottleB=" + bottleB + "]";
	}

	public WaterBottle getBottleA() {
		return bottleA;
	}

	@Autowired
	public void setBottleA(WaterBottle bottleA) {
		this.bottleA = bottleA;
	}

	public WaterBottle getBottleB() {
		return bottleB;
	}

	@Autowired
	public void setBottleB(WaterBottle bottleB) {
		this.bottleB = bottleB;
	}
	
}
