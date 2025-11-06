package task;

public class Hotel implements Veg,Nonveg{
	int totalprice=0;
	@Override
	public void Briyani() {
		int p=280;
		System.out.println("Briyani cost:"+p);
		totalprice=totalprice+p;		
	}
	
	@Override
	public void Tandoor() {
		int p=190;
		System.out.println("Tandoor cost:"+p);
		totalprice+=p;
	}

	@Override
	public void Idly() {
		// TODO Auto-generated method stub
		int p=30;
		System.out.println("Idly cost:"+p);
		totalprice+=p;
		
	}

	@Override
	public void Meals() {
		// TODO Auto-generated method stub
		int p=180;
		System.out.println("Meals cost:"+p);
		totalprice+=p;	
	}
	public void total() {
		System.out.println("Total price:" +totalprice);
	}

}
