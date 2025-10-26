package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
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
		return "Le gaulois " + nom + " : ";
	}
	
	public String toString() {
		return nom;
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}
	public void frapper(Romain romain) {
		if (romain.getForce() <= 0) return; // ne frappe pas un Romain déjà KO
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    int degats = (force * effetPotion) / 3;
	    if (degats < 1) degats = 1;
	    romain.recevoirCoup(degats);
	    effetPotion = 1;
		
	}
}
