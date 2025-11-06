package com.example;
import java.util.Scanner;
public class Xzz {
	/*public static void main(String[] args) {
		int n = 7;
		boolean isPrime = true;
		if (n <= 1) {
		    isPrime = false;
		} else {
		    for (int i = 2; i <= Math.sqrt(n); i++) {
		        if (n % i == 0) {
		            isPrime = false;
		            break;
		        }
		    }
		}
		if (isPrime) {
		    System.out.println("Prime");
		} else {
		    System.out.println("Not");
		}
	}*/
	/*public static void main(String[] args) {
		int n=10;
		String r=String.valueOf(n);
		int d;
		while(n!=0) {
			d=n%2;
			r+=d;
			n=n/2;
		}
		System.out.println(r);
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				c++;
			}
		}
		System.out.println(c);
	}*/
	
	//------PALINDROME IN NUMBERS
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		int d;
		int r=0;
		while(a!=0) {
			d= a %10;
			r=(r*10)+d;
			a=a/10;
		}
		if(r==b) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}*/
	// FACTORIAL OF  A NUMBER
/*public static void main(String []args) {
		int n=5;
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		System.out.println(f);
	}
}*/
	/*public static void main(String[] args) {
		String s="WeLCome";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int a=(int)c;
			 if (a >= 65 && a <= 90) { 
			        a = a + 32; 
			    } else if (a >= 97 && a <= 122) { 
			        a = a - 32; 
			    }
			 System.out.print((char) a);		
		}
	}*/
	@Override
	public String toString() {
		return "Hello";
	}
	
	public static void main(String[] args) {
		Xzz x = new Xzz();
		System.out.println(x);
	}
}

	
	
