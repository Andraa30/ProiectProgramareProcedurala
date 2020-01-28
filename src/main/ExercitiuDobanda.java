package main;

import java.util.Scanner;

public class ExercitiuDobanda {
	public void Dobanda(){
		double suma;
		int ani;
		Scanner sc = new Scanner(System.in);
		System.out.print("introdu suma aici:");
		suma = sc.nextDouble();
		System.out.print("introdu numar de ani aici:");
		ani = sc.nextInt();
		
		for(int i=1; i<=ani; i++) {
			double d;
			d = 0.4*suma;
			suma+=d;
		}
		System.out.println(suma);
	}

	

}
