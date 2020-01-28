package main;

import java.util.Scanner;

public class ExercitiuSecunde {
	public void Secunde(){
		int x,m,s,h;
		Scanner sc = new Scanner(System.in);
		System.out.print("introdu x aici:");
		x = sc.nextInt();
		
		s = x % 60; //4 min
		m = x / 60;	//123 min	
        h = m / 60; //2h
        m = m % 60; //3 min
        System.out.println(h + " ore " + m + " minute si " + s + " secunde ");
        
	}
}
