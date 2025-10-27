package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron;

	public String getNom() {
		return nom;
	}

	public Druide(String nom, int force, Chaudron chaudron) {
		this.nom = nom;
		this.force = force;
		this.chaudron = chaudron;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			if ("Obélix".equals(gaulois.getNom())) {
				parler("Non, " + gaulois.getNom() + " Non!... Et tu le sais très bien !");
			} else {
				chaudron.prendreLouche();
				gaulois.boirePotion(force);
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique");
			}
		} else {
			parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion");
		}
	}

}
