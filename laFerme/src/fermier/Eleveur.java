package fermier;

import java.util.ArrayList;
import java.util.Scanner;

import lesAnimauxDeLaFerme.*;

public class Eleveur {
	private static Scanner sc = new Scanner(System.in);
	private static int nombreMaxCanards = 4;
	private static int nombreMaxPoulets = 5;
	private static int nombreMaxPaons = 3;
	private static int nombreMaxCygnes = 2;
	private static int compteEnBanque;
	private static int nombreCanards;
	private static int nombrePoulets;
	private static int nombrePaons;
	private static int nombreCygnes;

	public static ArrayList<Volaille> listVolailles = new ArrayList<>();

	public Eleveur() {

	}

	// AJOUTER VOLAILLE
	public static void ajouterPoulet(int poids) {

		if (listVolailles.size() >= 8) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de volaille");
		} else if (nombrePoulets == nombreMaxPoulets) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de poulet");
		} else {
			Poulet poulet = new Poulet(poids);
			System.out.println(poulet);

			listVolailles.add(poulet);
		}
	}

	public static void ajouterCanard(int poids) {

		if (listVolailles.size() >= 8) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de volaille");
		} else if (nombreCanards == nombreMaxCanards) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de canards");
		} else {
			Canard canard = new Canard(poids);
			System.out.println(canard);
			nombreCanards++;
			listVolailles.add(canard);
		}
	}

	public static void ajouterPaon() {

		if (listVolailles.size() >= 8) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de volaille");
		} else if (nombrePaons == nombreMaxPaons) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de paon");
		} else {
			Paon paon = new Paon("bleu");
			System.out.println(paon);
			nombrePaons++;
			listVolailles.add(paon);
		}
	}

	public static void ajouterCygne() {

		if (listVolailles.size() >= 8) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de volaille");
		} else if (nombreCygnes == nombreMaxCygnes) {
			System.out.println("\nl'éleveur ne peut pas acceuillir plus de Cygnes");
		} else {
			Cygne cygne = new Cygne();
			System.out.println(cygne);
			nombreCygnes++;
			listVolailles.add(cygne);
		}
	}

	// FIN AJOUTER VOLAILLE
	// VENDRE/RENDRE VOLAILLE

	public static void vendrePoulet(int index) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;

				if (poulet.getIdentifiant() == index) {
					if (poulet.isAbattable()) {
						compteEnBanque += poulet.getPrixPoulet();
						nombreCanards--;
						listVolailles.remove(poulet);
						System.out.println("Votre compte en banque : " + compteEnBanque + "euros");
						break;
					}
				}
			}
		}
	}

	public static void vendreCanard(int index) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;

				if (canard.getIdentifiant() == index) {
					if (canard.isAbattable()) {
						compteEnBanque += canard.getPrixCanard();
						nombreCanards--;
						listVolailles.remove(canard);
						System.out.println("Votre compte en banque : " + compteEnBanque + "euros");
						break;
					}

				}
			}
		}
	}

	public static void rendrePaon(int index) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Paon) {
				Paon paon = (Paon) volaille;

				if (paon.getIdentifiant() == index) {
					listVolailles.remove(paon);
					nombrePaons--;
					System.out.println("Vous avez rendu : " + paon.toString());
					break;
				}

			}
		}
	}

	public static void rendreCygne(int index) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Cygne) {
				Cygne cygne = (Cygne) volaille;

				if (cygne.getIdentifiant() == index) {
					listVolailles.remove(cygne);
					nombreCygnes--;
					System.out.println("Vous avez rendu : " + cygne.toString());
					break;
				}

			}
		}
	}

	public static void voirCompte() {

		System.out.println("Votre compte en banque : " + compteEnBanque + "euros");

	}
	// FIN VENDRE/RENDRE VOLAILLE

	// VOIR

	public static void voirLesVolailles() {

		for (Volaille volaille : listVolailles) {
			System.out.println(volaille);
		}

	}

	public static void voirLeNombreParType() {
		int nbPoul = 0;
		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				nbPoul++;
			}

		}
		int nbC = 0;
		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Canard) {
				nbC++;
			}

		}
		int nbPaon = 0;
		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Paon) {
				nbPaon++;
			}

		}
		int nbCygnes = 0;
		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Cygne) {
				nbCygnes++;
			}

		}

		System.out.println("nombre de poulets = " + nbPoul);
		System.out.println("nombre de canards = " + nbC);
		System.out.println("nombre de paons = " + nbPaon);
		System.out.println("nombre de cygnes = " + nbCygnes);
	}

	public static void totalPrixAbattable() {

		int nbPoul = 0;
		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;
				if (poulet.isAbattable()) {
					nbPoul += poulet.getPrixPoulet();
				}

			}

		}
		int nbC = 0;
		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;
				if (canard.isAbattable()) {
					nbC += canard.getPrixCanard();
				}
			}

		}
		System.out.println("le total de prix des volailles abattables : " + (nbC + nbPoul));
	}

	public static void totalPrixAbattablePoulets() {

		int nbPoul = 0;
		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;
				if (poulet.isAbattable()) {
					nbPoul += poulet.getPrixPoulet();
				}

			}

		}
		System.out.println("le total de prix des poulets abattables : " + nbPoul);
	}

	public static void totalPrixAbattableCanards() {

		int nbC = 0;
		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;
				if (canard.isAbattable()) {
					nbC += canard.getPrixCanard();
				}
			}

		}
		System.out.println("le total de prix des canards abattables : " + nbC);
	}

	public static void modifierPoidsPoulet(int index, int poids) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;

				if (poulet.getIdentifiant() == index) {

					poulet.modifierPoids(poids);
					System.out.println("poids du poulet " + poulet.getIdentifiant() + " modifié");

				}
			}

		}

	}

	public static void modifierPoidsCanard(int index, int poids) {

		for (Volaille volaille : listVolailles) {
			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;

				if (canard.getIdentifiant() == index) {

					canard.modifierPoids(poids);
					System.out.println("poids du canard " + canard.getIdentifiant() + " modifié");

				}
			}

		}

	}

	public static void compteModifPoidsPoulet() {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;
				if (poulet.getPoids() < poulet.getPoidsAbattage2()) {
					poulet.setAbattable(false);
				} else {
					poulet.setAbattable(true);
				}
			}
		}

	}

	public static void compteModifPoidsCanard() {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;
				if (canard.getPoids() < canard.getPoidsAbattage2()) {
					canard.setAbattable(false);
				} else {
					canard.setAbattable(true);
				}
			}
		}

	}

	public static void modifierPoidsAbattagePoulets(int poids) {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;
				poulet.setPoidsAbattage(poids);

			}
		}
	}

	public static void modifierPoidsAbattageCanards(int poids) {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;
				canard.setPoidsAbattage(poids);

			}
		}
	}

	public static void recalculePrixCanards() {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Canard) {
				Canard canard = (Canard) volaille;
				canard.setPrixCanard();

			}
		}

	}

	public static void recalculePrixPoulets() {

		for (Volaille volaille : listVolailles) {

			if (volaille instanceof Poulet) {
				Poulet poulet = (Poulet) volaille;
				poulet.setPrixPoulet();

			}
		}

	}

	// FIN MODIFIER POIDS POULET

}
