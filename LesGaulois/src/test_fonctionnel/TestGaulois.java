package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	

	public static void main(String[] args) {
		
		Gaulois Astérix = new Gaulois("Astérix", 6);
		
		Gaulois Obélix = new Gaulois("Obélix", 16);
		
		Astérix.parler("Bonjour Obélix");
		
		Obélix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des\r\n"
				+ "sangliers ?");
		
		Astérix.parler("Oui très bonne idée.");
		
		Romain Minus = new Romain("Minus", 6);
		
		
		
		System.out.println("Dans la forêt" );
	}
	
	
	
	
}
