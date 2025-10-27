package personnages;

public class Romain {
	private String nom;
	private int force;

	private boolean isInvariantVerified() {
		return force >= 0;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
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
		assert forceCoup>=0;
		int force_initial=force;
		force = force - forceCoup;
		if (force < 1)
			parler("J'abandonne !");
		else
			parler("Aie");
		assert force_initial < force;
		assert isInvariantVerified();
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}
}
