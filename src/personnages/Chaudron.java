package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		 quantitePotion = quantite;
		 this.forcePotion = forcePotion;
	}
	
	public boolean resterPotion() {
		if (quantitePotion == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public int prendreLouche() {
		
		if (resterPotion()) {
			quantitePotion--;
			return forcePotion;
		} else {
			return 0;
		}
	}
	
}
