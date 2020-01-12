package spring.each.SasikalaUI.daythree;

public class Sangeetha implements Manipulation 
{
	private int size;
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	private HeadSet[] stock=new HeadSet[size];

	public HeadSet[] getStock() {
		return stock;
	}

	public void setStock(HeadSet[] stock) {
		this.stock = stock;
	}

	@Override
	public void update(int pos,Object obj) {
		// TODO Auto-generated method stub
		if(stock[pos]!=null)
		{
		stock[pos]=(HeadSet)obj;System.out.println(stock[pos].getModel()
				+" replace at: "+pos);
		}
	}

	@Override
	public Object erase() {
		// TODO Auto-generated method stub
		Object hai=stock[0];
		stock[0]=null;
		return hai;
	}

	@Override
	public Object erase(int index) {
		// TODO Auto-generated method stub
		HeadSet h=null;
		if(stock[index]!=null)
		{
			h=stock[index];
			stock[index]=null;
		}
		return h;
	}

	@Override
	public int findOne(Object obj) {
		// TODO Auto-generated method stub
		int pos=-1;
		for(int index=0;index<stock.length;index++)
		{
			if(stock[index]==obj)
			{
			System.out.println(obj+" found at: "+index);pos=index;
			break;
			}
		}
		return pos;
	}

	@Override
	public void listAll() {
		// TODO Auto-generated method stub
		for(HeadSet t:stock)
		{System.out.println(t);}
	}
}
