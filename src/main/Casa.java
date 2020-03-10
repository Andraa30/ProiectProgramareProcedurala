package main;

public class Casa extends Imobil {

	public Casa() {
		// TODO Auto-generated constructor stub
	}

	public Casa(String tipCasa) {
		super(tipCasa);
		// TODO Auto-generated constructor stub
	}

	public Casa(String c, int nrEtaje, double pret) {
		super(c, nrEtaje, pret);
		// TODO Auto-generated constructor stub
	}
	public String afiseazaDetalii() {
		return "Imobil "+ getTipCasa()+ " cu "+ getNrEtaje()+ " cu "+ " la pretul de "+ getPret() + "£";
	}

}
