package main;

public class Caine extends Animal {

	public Caine() {
		// TODO Auto-generated constructor stub
	}

	public Caine(String tipAnimal) {
		super(tipAnimal);
		// TODO Auto-generated constructor stub
	}

	public Caine(String a, String culoare, int varsta) {
		super(a, culoare, varsta);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() {
		return "Caine "+ getTipAnimal()+ " de culoarea "+ getCuloare()+ " cu varsta de "+ getVarsta() + "ani";
	}

}
