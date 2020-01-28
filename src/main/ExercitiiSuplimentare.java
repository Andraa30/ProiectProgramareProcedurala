package main;

public class ExercitiiSuplimentare {
	
	public void SumaDivizori() {
		int i=1,aux=2,n;
		while (i<5) {
			n = aux;
			while(n>0) { 		
					int x=0;
				for(int j=1;j<=n/2;j++) {
					if (n % j ==0) {
						x+=j;
					}
				}
				if (x==n) {
					i++;
					aux=n+1;
					System.out.println(n);
					}
			n++;	
			}
		
		}
	}

}
