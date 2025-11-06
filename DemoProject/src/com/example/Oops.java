package com.example;

public class Oops {
	class Parent {
	    Parent() {
	        System.out.println("Parent constructor");
	    }
	}

	class Child extends Oops {
	    // No constructor defined
	}

	public class Test {
	    public static void main(String[] args) {
	        Child c = new Child(); // Calls Parent()
	    }
	}

}
