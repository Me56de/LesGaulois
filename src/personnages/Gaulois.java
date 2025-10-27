package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	public String toString() {
		return nom;
	}

	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force * effetPotion / 3);
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public Village getVillage() {
		return village;
	}

	public void sePresenter() {
		if (village != null && this.equals(village.getChef())) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom
					+ ". Je suis le chef du village " + village.getNom() + ".\"");
		} else if (village != null) {
			System.out.println("Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + ". Je vis dans le village "
					+ village.getNom() + ".\"");
		} else {
			System.out.println(
					"Le Gaulois " + nom + " : \"Bonjour, je m'appelle " + nom + " Je voyage de villages en villages.");
		}
	}

}
