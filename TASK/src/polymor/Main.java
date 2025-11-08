package polymor;
//METHOD OVERRRIDING 
	class Animal {
	    void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
	    void sound() {
	        System.out.println("Cat meows");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Animal a1 = new Dog();  // Polymorphism
	        Animal a2 = new Cat();  // Polymorphism
	        a1.sound();  // Output: Dog barks
	        a2.sound();  // Output: Cat meows
	    }
	}

