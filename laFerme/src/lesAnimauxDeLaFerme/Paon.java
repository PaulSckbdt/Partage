package lesAnimauxDeLaFerme;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Paon extends Volaille {
	private String espece;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH'h'mm");
	private String vDate;

	public Paon(String espece) {
		super();
		Date dateArrive = new Date();
		this.espece = espece;
		vDate = sdf.format(dateArrive);
	}

	@Override
	public String toString() {
		return "\nidentifiant : " + identifiant + "\npaon " + this.vDate;
	}

	public String getvDate() {
		return vDate;
	}

}
