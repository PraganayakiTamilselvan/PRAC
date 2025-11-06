package inheritance;
class clg{
	String name;
	String loc;
	clg(){ //DEFAULT CONSTRUCTOR IN PARENT CLASS
		System.out.println("Im default college constructor");
	}
	clg(String name,String loc){ //PARAMETERIZED CONSTRUCTOR IN PARENT CLASS
		System.out.println("College Name: "+name);
		System.out.println("Location: "+loc);
	}
}
class engineering extends clg{
	String depn;
	int dep;
	
	engineering(){ 
		super("Anna university","chennai"); // INVOKING THE PARENTCLASS PARAMETER CONSTRUCTOR
		System.out.println("Im engineering default constructor");
	}
	engineering(String depn,int dep){
		System.out.println("Name of the department: "+depn);
		System.out.println("No of students: "+dep);
	}
}
public class College {
public static void main(String[] args) {
	engineering e = new engineering();//CALLS DEFAULT OF CHILD CLASS AND PARAMETERIZED CONSTRUCTOR OF PARENT CLASS
	engineering e1=new engineering("CSE",70);//CALLS THE PARAMETERIZED CONSTRUCTOR OF CHILD CLASS AND PRINT THE DEPARTMENT INFO
}
}
