import java.util.ArrayList;

abstract class Personne {
    protected String nom;
    protected String prenom;
    protected int anneeDeNaissance;
    protected String email;

    public Personne(String nom, String prenom, int anneeDeNaissance, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneeDeNaissance = anneeDeNaissance;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Année de naissance: " + anneeDeNaissance + ", Email: " + email;
    }
}

class EtudiantImpl extends Personne implements Etudiant {
    private String numeroEtudiant;
    private Classe classe;

    public EtudiantImpl(String nom, String prenom, int anneeDeNaissance, String email, String numeroEtudiant, Classe classe) {
        super(nom, prenom, anneeDeNaissance, email);
        this.numeroEtudiant = numeroEtudiant;
        this.classe = classe;
    }

    @Override
    public void sInscrire() {
        System.out.println("L'étudiant s'inscrit.");
    }

    @Override
    public void suivreCours() {
        System.out.println("L'étudiant suit un cours.");
    }

    @Override
    public void passerExamen() {
        System.out.println("L'étudiant passe un examen.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Numéro étudiant: " + numeroEtudiant + ", Classe: " + classe.name();
    }
}

class ProfesseurImpl extends Personne implements Professeur {
    private String specialite;

    public ProfesseurImpl(String nom, String prenom, int anneeDeNaissance, String email, String specialite) {
        super(nom, prenom, anneeDeNaissance, email);
        this.specialite = specialite;
    }

    @Override
    public void enseigner() {
        System.out.println("Le professeur enseigne.");
    }

    @Override
    public void corrigerExamen() {
        System.out.println("Le professeur corrige un examen.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Spécialité: " + specialite;
    }
}

enum Classe {
    L3, M1, M2
}

interface Etudiant {
    void sInscrire();
    void suivreCours();
    void passerExamen();
}

interface Professeur {
    void enseigner();
    void corrigerExamen();
}

