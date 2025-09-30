package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println(prendreParole() + "\"" + text + "\"");

	}

	private String prendreParole() {

		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
			
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((effetPotion*force)/3);
		if (effetPotion != 1) {
			effetPotion--;
		}
	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}
	
	/////////////////////////////////////////////////////////////////////MAIN/////////////////////////////////
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}

}
