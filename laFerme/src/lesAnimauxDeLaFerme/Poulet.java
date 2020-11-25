package lesAnimauxDeLaFerme;

public final class Poulet extends Volaille implements ModifierPoids {
	private int poids;
	private static int prixAuKilo = 5;
	private int prixPoulet;
	private boolean abattable;
	private static int poidsAbattage = 3;

	public Poulet(int poids) {
		super();
		this.poids = poids;
		this.prixPoulet = this.poids * this.prixAuKilo;
		if (poidsAbattage <= this.poids) {
			abattable = true;
		} else {
			abattable = false;
		}
	}

	@Override

	public String toString() {
		return "\nIdentifiant : " + this.identifiant + "\nPoulet de " + this.poids + " kg son prix est de "
				+ this.getPrixPoulet() + "euros" + (abattable ? " il est abattable" : " il n'est pas abattable");
	}

	// GETTERS
	public int getPrixPoulet() {
		return this.prixPoulet;
	}

	public static String getPrixAuKilo() {
		return "prix au kilo poulets = " + prixAuKilo + "euros";
	}

	public int getPoidsAbattage2() {
		return poidsAbattage;
	}

	public static String getPoidsAbattage() {
		return "poids abattage poulets = " + poidsAbattage + "kg";
	}

	public int getPoids() {
		return poids;
	}

	public boolean isAbattable() {
		return abattable;
	}

	// SETTERS
	public static int setPrixAuKilo(int pPrixAuKilo) {
		return prixAuKilo = pPrixAuKilo;
	}

	public int setPoidsAbattage(int pPoidsAbattage) {
		return this.poidsAbattage = pPoidsAbattage;
	}

	@Override
	public void modifierPoids(int pPoids) {
		this.poids = pPoids;
	}

	public void setAbattable(boolean abattable) {
		this.abattable = abattable;
	}

	public void setPrixPoulet() {
		this.prixPoulet = this.poids * this.prixAuKilo;
	}

}
