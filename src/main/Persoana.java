package main;

public class Persoana {
	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana() {
		nume = "";
		prenume = "";
		varsta = 0;
	}
	
	public Persoana(String nume) {
		this.nume = nume;
		this.prenume = "";
		this.varsta = 0;
	}
	
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}
	
	
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public String afiseazaDetalii() {
		return "nume: " + nume + "; Prenume: " + prenume + "; Varsta: " + varsta;
	}
}
