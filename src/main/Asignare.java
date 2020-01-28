package main;

import java.util.Scanner;

public class Asignare {
		
	public void Ex() {
		int a=3;
		int b=(a=2)*a;
		int c= b*(b=5);
		System.out.println("a=" + a + ",b=" + b + ",c=" +c);
	}	
	
		
		//a=2, b=5, c=20
		// a este initializat ca 3, dar apoi ca 2
		//b are ecuatie, dar apoi este initializat 5
		//c este b initial(4) inmultit cu noul b(5)
	public void Ecuatie(){
		double d=2.95;
		int i=4;
		System.out.println(++d>i?d:i);
	}
	
	//4
	//daca 3.95>4 atunci 3.95 altfel 4 
	
	public void Ecu(){
		int a=3;
		if (++a<4)
			if(a++ <4)
				System.out.println("a="+a);
			else
				System.out.println("a="+a);
		
		//nu se afiseaza nimic, conditiile nu se indeplinesc
	}
	
	public void Suma() {
		int suma =0;
		for(int i=1;i<4;i++){
			suma+=suma+i;
		}
		System.out.println("Suma este "+ suma);
	}
	//suma este 1,4,11,26,57,120,247,502,1013 =>1013
	
	public void Inmultire() {
		int n=13,s=1;
		for (int i=1; i<=n; i++) {
			s*=i;
		}
		System.out.println("N factorial este "+s);
	}
	
	public void Min() {
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.print("introdu x aici:");
		x = sc.nextInt();
		System.out.print("introdu y aici:");
		y = sc.nextInt();
		System.out.print("introdu z aici:");
		z = sc.nextInt();
		//int x=20,y=30,z=10;
		if (x<=y && x<=z) {
			System.out.println(" Cel mai mic este x");
		}
		else if (y<=z && y<=x) {
			System.out.println("Cel mai mic este y");
		}
		else System.out.println("Cel mai mic este z");
	}
	
	public void Paritate() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Pentru paritate introdu x aici:");
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("X este par");
		}
		else System.out.println("X este impar");
	}

	public void Zi() {
		int zi;
		Scanner sc = new Scanner(System.in);
		System.out.print(" Introdu nr de la 1 la 7:");
		zi = sc.nextInt();
		switch (zi) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
	}

	
}