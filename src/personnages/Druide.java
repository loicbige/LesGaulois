package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		this.chaudron = new Chaudron(0, 0);
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void parler(String text) {
		System.out.println(prendreParole() + "\"" + text + "\"");
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + "doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		
		boolean contientPotion = chaudron.resterPotion();
		String nomGaulois = gaulois.getNom();		
		if (contientPotion) {
			if (nomGaulois == "Oblélix") {
				parler("Non" + nomGaulois + "Non !... et tu le sais très bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nomGaulois +" un peu de potion magique.");
			}
			
		} else {
			parler("Désolé " + nomGaulois + "il n'y a plus une seule goutte de potion.");			
		}
	}

	public String getNom() {
		return nom;
	}

}
