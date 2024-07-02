package Jour07.Job0;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Dupont", "Jean", "01/01/1980", "Paris", "123 Rue de la Paix", "0123456789");

        // Accès direct aux attributs publics
        System.out.println("Nom: " + p.nom);
        System.out.println("Prénom: " + p.prenom);

        // Accès via getters et setters pour les attributs privés
        System.out.println("Adresse: " + p.getAdresse());
        p.setAdresse("456 Avenue des Champs-Élysées");
        System.out.println("Nouvelle Adresse: " + p.getAdresse());

        // Accès via getters et setters pour les attributs protégés
        System.out.println("Date de Naissance: " + p.getDateDeNaissance());
        p.setDateDeNaissance("02/02/1981");
        System.out.println("Nouvelle Date de Naissance: " + p.getDateDeNaissance());

        System.out.println("Lieu de Naissance: " + p.getLieuDeNaissance());
        p.setLieuDeNaissance("Lyon");
        System.out.println("Nouveau Lieu de Naissance: " + p.getLieuDeNaissance());
    }
}

