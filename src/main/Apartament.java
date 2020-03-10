package main;

public class Apartament extends Imobil {

	public Apartament() {
		// TODO Auto-generated constructor stub
	}

	public Apartament(String tipCasa) {
		super(tipCasa);
		// TODO Auto-generated constructor stub
	}

	public Apartament(String c, int nrEtaje, double pret) {
		super(c, nrEtaje, pret);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() {
		return "Imobil "+ getTipCasa()+ " cu "+ getNrEtaje()+ " cu "+ " la pretul de "+ getPret() + "£";
	}

}
