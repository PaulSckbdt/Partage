package lesAnimauxDeLaFerme;

public abstract class Volaille {
	private static int count = 1;
	protected int identifiant;
	protected int age = 3;

	public Volaille() {
		this.identifiant = count;
		count++;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Volaille identifiant = " + identifiant + ", age = " + age + " semaines";
	}

	public int getIdentifiant() {
		return identifiant;
	}

}
