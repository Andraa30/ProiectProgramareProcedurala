package main;

public class TestImobil {

	public static void main(String[] args) {

		/*Imobil imo = new Imobil();
		imo.setTipCasa("apartament");
		imo.setNrEtaje(1);
		imo.setPret(20000);
		
		Imobil imo1 = new Imobil("casa");
		imo1.setNrEtaje(3);
		imo1.setPret(100000);
		
		Imobil imo3 = new Imobil("casa", 2, 70000);
	
		System.out.println("Imobil: " + imo.getTipCasa() + "\nNumarEtaje: " + imo.getNrEtaje() + "\nPret: " + imo.getPret()+"�");
		System.out.println();
		System.out.println("Imobil: " + imo1.getTipCasa() + "\nNumarEtaje: " + imo1.getNrEtaje() + "\nPret: " + imo1.getPret()+"�");
		System.out.println();
		System.out.println("Imobil: " + imo3.getTipCasa() + "\nNumarEtaje: " + imo3.getNrEtaje() + "\nPret: " + imo3.getPret()+"�");		
		System.out.println();*/
		
		Apartament apartament1=new Apartament("apartament",2,15000);		
		Casa casa1=new Casa("caucazian",3,20000);
		
		System.out.println("Imobilul "+ apartament1.getTipCasa()+ " cu "+ apartament1.getNrEtaje()+ " etaje la pretul de "+ apartament1.getPret() + "�");
		System.out.println(apartament1.afiseazaDetalii());		
		System.out.println();
		System.out.println("Imobilul "+ casa1.getTipCasa()+ " cu "+ casa1.getNrEtaje()+ " etaje la pretul de "+ casa1.getPret() + "�");
		System.out.println(casa1.afiseazaDetalii());

	}

}
