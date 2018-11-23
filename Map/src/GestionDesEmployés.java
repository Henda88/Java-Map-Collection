
public class GestionDesEmployés {

	public static void main(String[] args) {
		
		Employe e1 = new Employe(8, 1525, "Ouni", "Henda");
		Employe e2 = new Employe(9, 1246, "Seif", "Seif");
		Employe e3 = new Employe(11, 2285, "Haythem", "Haythem");
		Employe e4 = new Employe(7, 1102, "Mohamed", "Mohamed");
		
		
		
		Departement dep1 = new Departement(1, "Informatique");
		Departement dep2 = new Departement(2, "Marketing");
		Departement dep3 = new Departement(3, "Finance");

		System.out.println("<<<<<<<<<<<<<<<<<<<H A S H M A P>>>>>>>>>>>>>>>>>>>>>>");
		
		SocieteHashMap soc1 = new SocieteHashMap();
		
		soc1.ajouterEmployeDepartement(e1, dep1);
		soc1.ajouterEmployeDepartement(e2, dep1);
		soc1.ajouterEmployeDepartement(e3, dep3);
		soc1.ajouterEmployeDepartement(e4, dep2);
		
		System.out.println("******************afficher emp + dep ***********************");
		soc1.afficherLesEmployesLeursDepartements();

		System.out.println("\n******************afficher emp ***********************");
		soc1.afficherLesEmployes();
		
		System.out.println("\n******************afficher dep***********************");
		soc1.afficherLesDepartements();
		
		System.out.println("\n******************recherche dep***********************");
		System.out.println(soc1.rechercherDepartement(dep3));
		
		System.out.println("\n******************recherche emp***********************");
		System.out.println(soc1.rechercherEmploye(e2));
		
		System.out.println("\n*******************afficher après suppression***************************");
		soc1.supprimerEmploye(e3);
		soc1.afficherLesEmployes();
		System.out.println(soc1.rechercherEmploye(e3));
		
		System.out.println("\n*******************afficher dep by key emp***************************");

		soc1.afficherDepartement(e1);
		soc1.afficherDepartement(e4);
		soc1.afficherDepartement(e3);
		
		System.out.println("<<<<<<<<<<<<<<<<<<< T R E E M A P>>>>>>>>>>>>>>>>>>>>>>");
		
		SocieteTreeMap soc2 = new SocieteTreeMap();
		
		soc2.ajouterEmployeDepartement(e3, dep1);
		soc2.ajouterEmployeDepartement(e1, dep3);
		soc2.ajouterEmployeDepartement(e2, dep1);
		soc2.ajouterEmployeDepartement(e4, dep2);
		
		soc2.afficherLesEmployesLeursDepartements();
		soc2.afficherLesEmployes();
		soc2.afficherLesDepartements();
		System.out.println("\n*******************afficher après suppression***************************");
		soc2.supprimerEmploye(e1);
		soc2.afficherLesEmployes();
		System.out.println(soc2.rechercherEmploye(e1));
		System.out.println(soc2.rechercherEmploye(e2));
		
	}

}
