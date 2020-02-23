package main;

public class Imobil {
	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	//constructor implicit
	public Imobil() {
		tipCasa = "";
		nrEtaje = 0;
		pret = 0;
	}
	
	//constructor cu un parametru
	public Imobil(String tipCasa) {
		this.tipCasa = tipCasa;
		nrEtaje = 0;
		pret = 0;
	}
	
	//constructor cu 3 parametri
	public Imobil(String c, int nrEtaje, double pret) {
		tipCasa = c;
		this.nrEtaje = nrEtaje;
		this.pret = pret;
	}
	
	public String getTipCasa() {
		return tipCasa;
	}
	
	public void setTipCasa(String tipCasa) {
		this.tipCasa = tipCasa;
	}
	
	public int getNrEtaje() {
		return nrEtaje;
	}
	
	public void setNrEtaje(int nrEtaje) {
		this.nrEtaje = nrEtaje;
	}
	
	public double getPret() {
		return pret;
	}
	
	public void setPret(double pret) {
		this.pret = pret;
	}
}
