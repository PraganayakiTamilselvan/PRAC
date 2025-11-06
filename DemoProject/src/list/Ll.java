package list;
import java.util.*;
public class Ll {
public static void main(String[] args) {
	LinkedList a =new LinkedList(); //SAME TO ARRAYLIST
	a.add(5);//ADD ELEMENT USING ADD()
	a.add(0,"Hey");//ADD ELEMENT IN SPECIFIC INDEX
	a.add("Pragana");
	a.add(5); // ALLOWS DUPLICATE ELEMENT
	a.contains(5);//CHECKS THE ELEMENT IS PRESENT OR NOT--RETURNS BOOLEAN 
	System.out.println(a);
}
}
