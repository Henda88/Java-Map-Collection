import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SocieteHashMap implements InterfaceSociete {

	HashMap<Departement, ArrayList<Employe>> hmap = new HashMap<Departement, ArrayList<Employe>>();

	@Override
	public void ajouterEmployeDepartement(Employe e, Departement d) {

		if (hmap.containsKey(d)) {
			hmap.get(d).add(e);
		} else {
			ArrayList<Employe> list = new ArrayList<Employe>();
			list.add(e);
			hmap.put(d, list);
		}
	}

	@Override
	public void supprimerEmploye(Employe e) {
		int index = -1;
		Iterator i = hmap.values().iterator();
		while (i.hasNext()) {
			ArrayList<Employe> liste = (ArrayList<Employe>) i.next();
			for (int ind = 0; ind < liste.size(); ind++) {
				if (liste.get(ind).equals(e)) {
					index = ind;
					break;
				}
			}
			if (index != -1) {
				liste.remove(index);
				break;
			}
		}
	}

	@Override
	public void afficherLesEmployesLeursDepartements() {

		Set set = hmap.entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			ArrayList<Employe> liste = (ArrayList<Employe>) me.getValue();
			for (int ind = 0; ind < liste.size(); ind++) {
				System.out.print("EMPLOYE :" + liste.get(ind) + ", Departement : " + me.getKey());
			}
		}
	}

	@Override
	public void afficherLesEmployes() {

		Set set = hmap.entrySet();
		Iterator i = set.iterator();
		System.out.println("Liste des employés : ");
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			ArrayList<Employe> liste = (ArrayList<Employe>) me.getValue();
			for (int ind = 0; ind < liste.size(); ind++) {
				System.out.print("EMPLOYE :" + liste.get(ind));
			}
		}
	}

	@Override
	public void afficherLesDepartements() {

		Set set = hmap.entrySet();
		Iterator i = set.iterator();
		System.out.println("Liste des départements : ");
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey());
		}
	}

	@Override
	public void afficherDepartement(Employe e) {

		int index = -1;
		Iterator i = hmap.entrySet().iterator();
		while (i.hasNext()) {
			Entry<Departement, ArrayList<Employe>> entry = (Entry<Departement, ArrayList<Employe>>) i.next();
			ArrayList<Employe> liste = entry.getValue();
			for (int ind = 0; ind < liste.size(); ind++) {
				if (liste.get(ind).equals(e)) {
					index = ind;
					break;
				}
			}
			if (index != -1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}

	@Override
	public boolean rechercherEmploye(Employe e) {
		Iterator i = hmap.entrySet().iterator();
		while (i.hasNext()) {
			Entry<Departement, ArrayList<Employe>> entry = (Entry<Departement, ArrayList<Employe>>) i.next();
			ArrayList<Employe> liste = entry.getValue();
			for (int ind = 0; ind < liste.size(); ind++) {
				if (liste.get(ind).equals(e)) {
					return true; 
				}
			}
		}
		return false;
	}

	@Override
	public boolean rechercherDepartement(Departement d) {
		if (hmap.containsKey(d)) {
			return true;
		}
		return false;
	}

}
