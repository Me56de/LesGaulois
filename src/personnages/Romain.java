package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
		assert isInvariantVerified();
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
		return "Le Romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert forceCoup >= 0;
		int force_initial = force;
		force = force - forceCoup;
		if (force < 1)
			parler("J'abandonne !");
		else
			parler("Aie");
		assert force_initial < force;
		assert isInvariantVerified();
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 0:
		case 1:
			if (aDejaEquipement(equipement)) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
			} else {
				equipements[nbEquipement] = equipement;
				nbEquipement++;
				System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + ".");
			}
			break;
		default:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		}
	}

	private boolean aDejaEquipement(Equipement equipement) {
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == equipement) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
