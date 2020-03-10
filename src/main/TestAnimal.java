package main;

public class TestAnimal {

	public static void main(String[] args) {
		/*Animal ani = new Animal();
			ani.setTipAnimal("iepure");
			ani.setCuloare("alb");
			ani.setVarsta(2);
			
		Animal ani1 = new Animal("caine");
			ani1.setCuloare("negru");
			ani1.setVarsta(10);
			
		Animal ani3 = new Animal("pisica", "gri", 3);
		
		System.out.println("Animal: " + ani.getTipAnimal() + "\nCuloare: " + ani.getCuloare() + "\nVarsta: " + ani.getVarsta());
		System.out.println();
		System.out.println("Animal: " + ani1.getTipAnimal() + "\nCuloare: " + ani1.getCuloare() + "\nVarsta: " + ani1.getVarsta());
		System.out.println();
		System.out.println("Animal: " + ani3.getTipAnimal() + "\nCuloare: " + ani3.getCuloare() + "\nVarsta: " + ani3.getVarsta());		
		System.out.println();*/
				
		
		Pisica pisi=new Pisica("birmaneza","alba",2);		
		Caine caine1=new Caine("caucazian","marou",3);
		
		System.out.println("Pisica "+ pisi.getTipAnimal()+ " de culoarea "+ pisi.getCuloare()+" si varsta de "+ pisi.getVarsta() + "ani");
		System.out.println(pisi.afiseazaDetalii());		
		System.out.println();
		System.out.println("Caine "+ caine1.getTipAnimal()+ " de culoarea "+ caine1.getCuloare()+" si varsta de "+ caine1.getVarsta() +"ani");
		System.out.println(caine1.afiseazaDetalii());
		}

}
