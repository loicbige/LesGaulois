package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parole(String text) {
		System.out.println(prendreParole() + "\"" + text + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		this.force -= forceCoup;

		if (force < 1) {
			parole("J'abandonne !");
		} else {
			parole("Aïe !");
		}
	}

}
