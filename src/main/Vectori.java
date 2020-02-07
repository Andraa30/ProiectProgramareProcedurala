package main;

public class Vectori {
	public void Du() {

	Double[] vector1 = {100.04, 301.5, 298.7};	
    	for (int i = 0; i < vector1.length; i++) {
    		System.out.println(vector1[i]);
    	}
	}
	
	public void MM() {
		int[] arr;
		arr =  new int[10];		
		arr[0] = 17; arr[1] = 11; arr[2]= 12; arr[3]= 13; arr[4]= 14; arr[5]= 15; arr[6]= 16; arr[7]= 17; arr[8]= 19; arr[9]= 18;
		int min = arr[0], max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	public void Neg() {
		int[] arr;
		arr = new int[4];
		arr[0] = 17; arr[1] = 11; arr[2]= -12; arr[3]= 13;
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < 0) {
				System.out.println(i);
			}
		}
	}
	
	public void Conv() {
		 String sir = new String("textulet"); 
		 int len = sir.length();
		 char[] ch = new char[len]; 
	     for (int i = 0; i < len; i++) { 
	            ch[i] = sir.charAt(i); 
	            System.out.println(ch[i]);
	     } 
	    			
	}
	
	public void Sir() {
		StringBuffer sir = new StringBuffer("textulet");
		int len = sir.length();
		
		for(int i=0; i< len; i++) {
			Character c = sir.charAt(i);
			if ( Character.isLowerCase(c) && i % 2 != 0) {				
					sir.replace(i, i+1, Character.toUpperCase(c)+ "");
			}
			
		}
		System.out.println(sir);
	}
	
	public void Aduna() {
		int[] arr1 = {12, 4, 5, 2, 5};
		double[] arr2 = new double[5];
		double c = 12.04;
	      for (int i = 0; i < 5; ++i) {
	    	  arr2[i] = arr1[i] +c;
	    	  System.out.println(arr2[i]);
	      }
	}
	
	public void Sup() {
		String cuv = new String("Mara este bine");
		int len = cuv.length();
		String[] arr = cuv.split(" ");
				
		System.out.print("arr este: ");
		boolean OK= true;
        for (int i = 0; i < 3; i++) {				//nu am gasit solutie sa inlocuiesc lungimea cu o formula, am eroare orice am incercat
            System.out.print(arr[i]+" ,");
            if (arr[i].length() != arr[0].length()) {
            	OK =false;
            }
        	
        }
        System.out.println();		
        char[][] m = new char[8][8];        
        if (OK==true) {
			for (int i=0; i<arr.length; i++) {
				for (int j=0; j<arr[i].length(); j++) {
					m[i][j] = arr[i].charAt(j);
				}
			}
			
		} 
        else {
			System.out.println("Elementele nu sunt egale");
		}
        
        for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length(); j++) {
				System.out.print(m[i][j] +" ");
			}
			System.out.println();
        }
	}
	
}