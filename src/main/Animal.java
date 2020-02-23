package main;

public class Animal {
	private String tipAnimal;
	private String culoare;
	private int varsta;
	
	//constructor implicit
	public Animal() {
		tipAnimal = "";
		culoare ="";
		varsta = 0;
	}
	
	//constructor cu un parametru
	public Animal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
		culoare = "";
		varsta = 0;
	}
	
	//constructor cu 3 parametri
	public Animal (String a, String culoare, int varsta) {
		tipAnimal = a;
		this.culoare = culoare;
		this.varsta = varsta;
	}
	
	public String getTipAnimal() {
		return tipAnimal;
	}
	
	public void setTipAnimal(String tipAnimal) {
		this.tipAnimal = tipAnimal;
	}
	
	public String getCuloare() {
		return culoare;
	}
	
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	
	public int getVarsta() {
		return varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
}
