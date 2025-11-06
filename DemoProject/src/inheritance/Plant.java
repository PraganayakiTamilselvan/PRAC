package inheritance;
class pla{ // PARENT CLASS 
	String name;
	String type;
	pla(String name,String type){
		System.out.println("Name of the plants: "+name);
		System.out.println("Type of the plants: "+type);
	}
	void display() { //METHOD 
		System.out.println("****Flower details****");
	}
}
class Floweringplant extends pla{ //CHILD CLASS EXTEND FROM PARENT CLASS
	String fname;
	String season;
	Floweringplant(){ 
		super("Rosemary","Medicinal"); 
	}
	void setflower(String fname,String season) { //METHOD TO SET FLOWER NAME
		this.fname= fname;
		this.season= season;
	}
	void showFlower(){ // METHOD TO DISPLAY 
		System.out.println("Flower Name: "+fname);
		System.out.println("Season: "+season);
	}	
}
public class Plant {
	public static void main(String[] args) {
		Floweringplant f =new Floweringplant(); // CALLING THE PARENT CLASS CONSTRUCTOR 
		f.display();
		f.setflower("Jasmine", "Winter"); // CALLING THE METHOD 
		f.showFlower();
	}
	
	
}
