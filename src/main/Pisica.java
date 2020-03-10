package main;

public class Pisica extends Animal {

	public Pisica() {
		super(); // TODO Auto-generated constructor stub
	}

	public Pisica(String tipAnimal) {
		super(tipAnimal);
		// TODO Auto-generated constructor stub
	}

	public Pisica(String a, String culoare, int varsta) {
		super(a, culoare, varsta);
		// TODO Auto-generated constructor stub
	}

	public String afiseazaDetalii() {
		return "Pisica "+ getTipAnimal()+ " de culoarea "+ getCuloare()+ " cu varsta de "+ getVarsta() + "ani";
	}
}
