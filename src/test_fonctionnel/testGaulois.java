package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class testGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Asterix, ça te dirais de chasser des sangliers ?");
		asterix.parler("Oui trés bonne idée.");
		Romain minus = new Romain("minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Druide panoramix = new Druide("Panoramix", 2);
		System.out.println("Dans la forêt " + asterix.getNom() + " et " + obelix.getNom() + "tombent nez à nez sur le romain " + minus.getNom() + "");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
	}

}
