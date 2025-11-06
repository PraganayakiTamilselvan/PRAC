package inheritance; 

//*****SIMPLE INHERITANCE*****

class schl { //PARENT CLASS
	String s ="Joseph Nursery and Primary school";
	void display() {
		System.out.println(s);
	}
}
class Primary extends schl{ //HERE THE PRIMARY IS THE CHILD CLASS AND IT EXTENDS THE PARENT CLASS
	void show() { 
		System.out.println("This is my primary school");
	}
}
public class School{ 
	public static void main(String[] args) {
		Primary  s = new Primary();
		s.display();
		s.show();
		
	}
}

