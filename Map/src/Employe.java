
public class Employe implements Comparable<Employe> {

	private int cin;
	private int matricule;
	private String nom;
	private String prenom;

	public Employe() {

	}

	public Employe(int cin, int matricule, String nom, String prenom) {
		this.cin = cin;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (cin != other.cin)
			return false;
		if (matricule != other.matricule)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employe o) {

		if (this.cin == o.getCin()) {
			return 0;
		} else {
			if (this.cin > o.getCin()) {
				return 1;
			}

			return -1;
		}
	}
}