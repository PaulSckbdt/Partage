package laFermeProjet;

import java.util.Scanner;

import fermier.*;
import lesAnimauxDeLaFerme.*;

public class LaFermeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean sortie1 = true;
		boolean sortie2 = true;

		while (sortie1) {

			System.out.println("\n0 : Fermer l'application" + "\n1 : Onglet ajouter"
					+ "\n2 : Onglet voir volailles/modifier poids abattage" + "\n3 : Onglet prix"
					+ "\n4 : Onglet voir/modifier poids" + "\n5 : Onglet valeur des volailles " + "\n6 : Onglet ventes "
					+ "\n7 : Onglet parc ");

			int i = sc.nextInt();

			switch (i) {
			case 0:
				System.out.println("fermeture");
				sortie1 = false;
				break;

			case 1:

				while (sortie2) {

					System.out.println("\n0 : Retour à l'accueil" + "\n1 : Ajouter un poulet"
							+ "\n2 : Ajouter un canard" + "\n3 : Ajouter un paon" + "\n4 : Ajouter un cygne");

					int j = sc.nextInt();
					switch (j) {

					case 0:
						System.out.println("Retour à l'accueil");
						sortie2 = false;
						break;

					case 1:
						System.out.println("\nSaisir le poids du Poulet");
						Eleveur.ajouterPoulet(sc.nextInt());
						break;

					case 2:
						System.out.println("\nSaisir le poids du Canard");
						Eleveur.ajouterCanard(sc.nextInt());
						break;

					case 3:
						Eleveur.ajouterPaon();
						break;

					case 4:
						Eleveur.ajouterCygne();
					}
					break;
				}
				break;

			case 2:
				boolean sortie3 = true;
				while (sortie3) {

					System.out.println("\n0 : Retour à l'accueil" + "\n1 : Modifier poids abattage des poulets"
							+ "\n2 : Voir le poids d'abattage actuel des poulets"
							+ "\n3 : Modifier poids abattage des canards "
							+ "\n4 : Voir le poids d'abattage actuel des canards");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie3 = false;
						break;

					case 1:
						System.out.println("\nSaisir le nouveau poids d'abattage des poulets");
						Eleveur.modifierPoidsAbattagePoulets(sc.nextInt());
						Eleveur.compteModifPoidsPoulet();
						break;

					case 2:
						System.out.println(Poulet.getPoidsAbattage());
						break;
					case 3:
						System.out.println("\nSaisir le nouveau poids d'abattage des canards");
						Eleveur.modifierPoidsAbattageCanards(sc.nextInt());
						Eleveur.compteModifPoidsCanard();
						break;

					case 4:
						System.out.println(Canard.getPoidsAbattage());
						break;
					}
					break;
				}
				break;

			case 3:

				boolean sortie4 = true;
				while (sortie4) {

					System.out.println("\n0 : Retour à l'accueil" + "\n1 : Modifier le prix au kilo des poulets"
							+ "\n2 : Voir le prix au kilo actuel des poulets"
							+ "\n3 : Modifier le prix au kilo des canards "
							+ "\n4 : Voir le prix au kilo actuel des canards");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie4 = false;
						break;

					case 1:
						System.out.println("\nSaisir le nouveau prix au kilo des poulets");
						Poulet.setPrixAuKilo(sc.nextInt());
						Eleveur.recalculePrixPoulets();
						break;

					case 2:
						System.out.println(Poulet.getPrixAuKilo());
						break;
					case 3:
						System.out.println("\nSaisir le nouveau prix au kilo des canards");
						Canard.setPrixAuKilo(sc.nextInt());
						Eleveur.recalculePrixCanards();
						break;

					case 4:
						System.out.println(Canard.getPrixAuKilo());
						break;
					}
					break;
				}
				break;

			case 4:

				boolean sortie5 = true;
				while (sortie5) {

					System.out.println("\n0 : Retour à l'accueil" + "\n1 : voir toutes les volailles"
							+ "\n2 : Voir le nombre de volailles par type" + "\n3 : Modifier le poids d'un poulet "
							+ "\n4 : Modifier le poids d'un canard");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie5 = false;
						break;

					case 1:

						Eleveur.voirLesVolailles();
						break;

					case 2:
						Eleveur.voirLeNombreParType();
						break;
					case 3:
						System.out.println("saisir l'identifiant du poulet et son nouveau poids");
						Eleveur.modifierPoidsPoulet(sc.nextInt(), sc.nextInt());
						Eleveur.compteModifPoidsPoulet();
						Eleveur.recalculePrixPoulets();
						break;

					case 4:
						System.out.println("saisir l'identifiant du canard et son nouveau poids");
						Eleveur.modifierPoidsCanard(sc.nextInt(), sc.nextInt());
						Eleveur.compteModifPoidsCanard();
						Eleveur.recalculePrixCanards();
						break;
					}
					break;
				}
				break;

			case 5:
				boolean sortie6 = true;
				while (sortie6) {

					System.out
							.println("\n0 : Retour à l'accueil" + "\n1 : Voir le total de prix des volailles abattables"
									+ "\n2 : Voir le total de prix des poulets abattables"
									+ "\n3 : Voir le total de prix des canards abattables");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie6 = false;
						break;

					case 1:

						Eleveur.totalPrixAbattable();
						break;

					case 2:
						Eleveur.totalPrixAbattablePoulets();
						break;
					case 3:
						Eleveur.totalPrixAbattableCanards();
						break;

					}
					break;
				}
				break;

			case 6:

				boolean sortie7 = true;
				while (sortie7) {

					System.out.println("\n0 : Retour à l'accueil" + "\n1 : Vendre un poulet" + "\n2 : Vendre un canard"
							+ "\n3 : Voir le compte en banque");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie7 = false;
						break;

					case 1:
						System.out.println("saisir l'identifiant du poulet à vendre");
						Eleveur.vendrePoulet(sc.nextInt());
						break;

					case 2:
						System.out.println("saisir l'identifiant du canard à vendre");
						Eleveur.vendreCanard(sc.nextInt());
						break;
					case 3:
						Eleveur.voirCompte();
						break;

					}
					break;
				}
				break;

			case 7:

				boolean sortie8 = true;
				while (sortie8) {

					System.out.println(
							"\n0 : Retour à l'accueil" + "\n1 : Rendre un paon au parc" + "\n2 : Rendre un cygne");

					int j = sc.nextInt();
					switch (j) {
					case 0:
						System.out.println("Retour à l'accueil");
						sortie8 = false;
						break;

					case 1:
						System.out.println("Saisir l'identifiant du paon à rendre : ");
						Eleveur.rendrePaon(sc.nextInt());
						break;

					case 2:
						System.out.println("saisir l'identifiant du cygne à rendre : ");
						Eleveur.rendreCygne(sc.nextInt());
						break;
					case 3:

						break;

					}
					break;
				}
				break;

			}

		}

	}

}
