public class Main {
    public static void main(String[] args) {
        GestionEnseignant gestionHashSet = new EspritHashSet();
        GestionEnseignant gestionTreeSet = new EspritTreeSet();

        Enseignant e1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant e2 = new Enseignant(2, "Durand", "Marie");
        Enseignant e3 = new Enseignant(3, "Martin", "Paul");

        // Test avec HashSet
        System.out.println("** Gestion avec HashSet **");
        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.ajouterEnseignant(e3);
        gestionHashSet.displayEnseignants();

        System.out.println("Recherche de l'enseignant avec ID 2: " + gestionHashSet.rechercherEnseignant(2));
        gestionHashSet.supprimerEnseignant(e2);
        gestionHashSet.displayEnseignants();

        // Test avec TreeSet
        System.out.println("\n** Gestion avec TreeSet **");
        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);
        gestionTreeSet.displayEnseignants();

        System.out.println("Recherche de l'enseignant avec ID 2: " + gestionTreeSet.rechercherEnseignant(2));
        gestionTreeSet.supprimerEnseignant(e2);
        gestionTreeSet.displayEnseignants();
    }
}
