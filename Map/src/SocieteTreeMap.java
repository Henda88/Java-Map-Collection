import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {

	TreeMap<Employe, Departement> tmap = new TreeMap<Employe, Departement>();

	@Override
	public void ajouterEmployeDepartement(Employe e, Departement d) {

		tmap.put(e, d);

	}

	@Override
	public void supprimerEmploye(Employe e) {

		tmap.remove(e);
	}

	@Override
	public void afficherLesEmployesLeursDepartements() {
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry myentry = (Map.Entry) iterator.next();
			System.out.print(myentry.getKey());
			System.out.println(myentry.getValue());
		}

	}

	@Override
	public void afficherLesEmployes() {
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry myentry = (Map.Entry) iterator.next();
			System.out.println(myentry.getKey());
		}

	}

	@Override
	public void afficherLesDepartements() {
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry myentry = (Map.Entry) iterator.next();
			System.out.println(myentry.getValue());
		}
	}

	@Override
	public void afficherDepartement(Employe e) {
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry myentry = (Map.Entry) iterator.next();
			if (myentry.getKey().equals(e)) {
				System.out.println(myentry.getValue());
				break;
			}
		}
	}

	@Override
	public boolean rechercherEmploye(Employe e) {
		if (tmap.containsKey(e)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean rechercherDepartement(Departement d) {
		if (tmap.containsValue(d)) {
			return true;
		}
		return false;
	}
}
