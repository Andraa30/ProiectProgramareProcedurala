package main;

public class TestPersoana {
	

	public static void main(String[] args) {
		Sef angajator1 = new Sef();
		angajator1.setNume("Popescu");
		angajator1.setPrenume("Iulian");
		angajator1.setVarsta(45);
		
		Angajat angajat1 = new Angajat("Mirs", "Carina", 25);
		angajat1.setAngajator(angajator1);
		
		Angajat angajat2 = new Angajat("Ninescu", "Carol", 20);
		System.out.println(angajat2.afiseazaDetalii());
		
		System.out.println("Angajatul "+ angajat1.getNume()+ " "+ angajat1.getPrenume()+ " are ca sef pe "+ angajator1.getNume() + " "+ angajator1.getPrenume() );
		System.out.println("Angajatul "+ angajat2.getNume()+ " "+ angajat2.getPrenume()+ " are ca sef pe "+ angajator1.getNume() + " "+ angajator1.getPrenume() );
	}
}
