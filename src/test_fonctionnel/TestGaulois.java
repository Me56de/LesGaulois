package test_fonctionnel;

import personnages.Chaudron;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		// TODO Romain minus = new Romain("Minus", 6);
		Romain brutus = new Romain("Brutus", 14);
		Chaudron chaudron = new Chaudron();
		Druide panoramix = new Druide("Panoramix", 2, chaudron);

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		while (brutus.getForce() > 1) {
			asterix.frapper(brutus);
		}
	}
}
