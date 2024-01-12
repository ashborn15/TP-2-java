import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(new EtudiantImpl("Wembayama", "Victor", 2002, "victorwemby@hotmail.com", "DUP19950001", Classe.L3));
        personnes.add(new EtudiantImpl("Anne", "Amar", 2001, "amaranne@gmail.com", "MAR199600512", Classe.M1));
        personnes.add(new EtudiantImpl("Sung", "Jinwoo", 2000, "sungjinwoo@yahoo.com", "DUP1950228", Classe.M2));
        personnes.add(new ProfesseurImpl("Curry", "Stephen", 1985, "stephencurry@gmail.com", "PHP,C#,Java"));
        personnes.add(new ProfesseurImpl("James", "Lebron", 1980, "lebronjames@yahoo.com", "C#,Java,PHP"));
        personnes.add(new ProfesseurImpl("Onizuka", "Eikichi", 1989, "eikichionizuka@hotmail.com", "Java,C#,PHP"));

        for (Personne personne : personnes) {
            System.out.println(personne);
        }
    }
}
