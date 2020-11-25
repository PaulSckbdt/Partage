package lesAnimauxDeLaFerme;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Cygne extends Volaille {
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH'h'mm");
	private String vDate;

	public Cygne() {
		super();
		Date dateArrive = new Date();
		vDate = sdf.format(dateArrive);
	}

	@Override
	public String toString() {
		return "\nidentifiant : " + identifiant + "\nDate D'entrée : " + this.vDate;
	}

	public String getvDate() {
		return vDate;
	}
}
