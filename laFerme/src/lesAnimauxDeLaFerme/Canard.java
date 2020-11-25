package lesAnimauxDeLaFerme;

public final class Canard extends Volaille implements ModifierPoids {
	private int poids;
	private static int prixAuKilo = 6;
	private int prixCanard;
	private boolean abattable;

	private static int poidsAbattage = 3;

	public Canard(int poids) {
		super();
		this.poids = poids;
		this.prixCanard = this.poids * this.prixAuKilo;
		if (poidsAbattage <= this.poids) {
			abattable = true;
		} else {
			abattable = false;
		}
	}

	@Override
	public String toString() {
		return "\nIdentifiant : " + this.identifiant + "\nCanard de " + this.poids + " kg son prix est de "
				+ this.getPrixCanard() + "euros" + (abattable ? " il est abattable" : " il n'est pas abattable");
	}

	// GETTERS
	public int getPrixCanard() {
		return this.prixCanard;
	}

	public int getPoids() {
		return poids;
	}

	public boolean isAbattable() {
		return abattable;
	}

	public int getPoidsAbattage2() {
		return poidsAbattage;
	}

	public static String getPrixAuKilo() {
		return "prix au kilo canards = " + prixAuKilo + "euros";
	}

	public static String getPoidsAbattage() {
		return "poids abattage canards = " + poidsAbattage + "kg";
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

	public void setPrixCanard() {
		this.prixCanard = this.poids * this.prixAuKilo;
	}
}
