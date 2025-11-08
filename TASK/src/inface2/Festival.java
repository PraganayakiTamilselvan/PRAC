package inface2;

public class Festival extends Ladoo{
	public void gift() {
		System.out.println("Gift it");
	}
	public static void main(String[] args) {
		Festival f =new Festival(); // CREATING OBJECT FOR THE CHILD CLASS 
		//CALLS ALL THE METHOD 
		f.prepare();
		f.decorate();
		f.serve();
		f.serve("Box", "60");
		f.shape("Circle", 2);
		f.gift();
//		Sweet l = new Festival();
//		l.serve();
//l.serve("Box", "60") 
//while we are creating the object for festival and reference to the sweet it will print the methods in that class only.
	}
}
