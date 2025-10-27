package personnages;

public class Village {
	private String nom;
	private int nbVillageois;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMax, Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = 0;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			gaulois.setVillage(this);
		} else {
			System.out.println("Le village est plein, impossible d'ajouter " + gaulois.getNom());
		}
	}

	public Gaulois trouverVillageois(int numVillageois) {
		int indice = numVillageois - 1;
		if (numVillageois < 1 || numVillageois > nbVillageois) {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return null;
		}
		return villageois[indice];
	}

	public void afficherVillage() {
		System.out.println("Dans le village" + nom + " du chef" + chef.getNom() + "vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());

		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourix", 6);
		Village village = new Village("Village des Irréductibles", 30, abraracourcix);
		abraracourcix.setVillage(village);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillage();
		Gaulois doublepolemix = new Gaulois("DoublePolémix", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
	}
}
