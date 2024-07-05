package jour08.job04;

import java.util.Scanner;
import java.util.Vector;
import java.util.Date;

public class Commerciale {
    private Vector<Article> articles;
    private Vector<Client> clients;
    private Vector<Commande> commandes;
    private Vector<Ligne> lignes;

    public Commerciale() {
        this.articles = new Vector<>();
        this.clients = new Vector<>();
        this.commandes = new Vector<>();
        this.lignes = new Vector<>();
    }

    public void passerCommande(Commande c) {
        commandes.add(c);
    }

    public void annulerCommande(Commande c) {
        commandes.remove(c);
    }

    public void ajouterArticle(Article a) {
        articles.add(a);
    }

    public void supprimerArticle(Article a) {
        articles.remove(a);
    }

    public void ajouterClient(Client c) {
        clients.add(c);
    }

    public void supprimerClient(Client c) {
        clients.remove(c);
    }

    public void afficherMenu() {
        System.out.println("Menu de Gestion Commerciale");
        System.out.println("1. Ajouter un article");
        System.out.println("2. Supprimer un article");
        System.out.println("3. Ajouter un client");
        System.out.println("4. Supprimer un client");
        System.out.println("5. Passer une commande");
        System.out.println("6. Annuler une commande");
        System.out.println("7. Afficher les articles");
        System.out.println("8. Afficher les clients");
        System.out.println("9. Afficher les commandes");
        System.out.println("0. Quitter");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Commerciale commerciale = new Commerciale();
        int choix;

        do {
            commerciale.afficherMenu();
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine();  // Consomme le reste de la ligne

            switch (choix) {
                case 1:
                    System.out.print("Référence : ");
                    String reference = scanner.nextLine();
                    System.out.print("Désignation : ");
                    String designation = scanner.nextLine();
                    System.out.print("Prix unitaire : ");
                    double prixUnitaire = scanner.nextDouble();
                    System.out.print("Quantité en stock : ");
                    int quantiteStock = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne

                    Article article = new Article(reference, designation, prixUnitaire, quantiteStock);
                    commerciale.ajouterArticle(article);
                    break;
                case 2:
                    System.out.print("Référence de l'article à supprimer : ");
                    reference = scanner.nextLine();
                    Article articleASupprimer = null;
                    for (Article a : commerciale.articles) {
                        if (a.getReference().equals(reference)) {
                            articleASupprimer = a;
                            break;
                        }
                    }
                    if (articleASupprimer != null) {
                        commerciale.supprimerArticle(articleASupprimer);
                        System.out.println("Article supprimé.");
                    } else {
                        System.out.println("Article non trouvé.");
                    }
                    break;
                case 3:
                    System.out.print("Numéro client : ");
                    int identite = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne
                    System.out.print("Nom  : ");
                    String nomSocial = scanner.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Chiffre d'affaire : ");
                    double chiffreAffaire = scanner.nextDouble();
                    scanner.nextLine();  // Consomme le reste de la ligne

                    Client client = new Client(identite, nomSocial, adresse, chiffreAffaire);
                    commerciale.ajouterClient(client);
                    break;
                case 4:
                    System.out.print("Identité du client à supprimer : ");
                    identite = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne
                    Client clientASupprimer = null;
                    for (Client c : commerciale.clients) {
                        if (c.getIdentite() == identite) {
                            clientASupprimer = c;
                            break;
                        }
                    }
                    if (clientASupprimer != null) {
                        commerciale.supprimerClient(clientASupprimer);
                        System.out.println("Client supprimé.");
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;
                case 5:
                    System.out.print("Numéro de commande : ");
                    int numeroCommande = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne
                    System.out.print("Date de commande (format YYYY-MM-DD) : ");
                    String dateCommande = scanner.nextLine();
   

                    System.out.print("Identité du client : ");
                    identite = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne
                    Client clientCommande = null;
                    for (Client c : commerciale.clients) {
                        if (c.getIdentite() == identite) {
                            clientCommande = c;
                            break;
                        }
                    }
                    if (clientCommande != null) {
                        Commande commande = new Commande(numeroCommande, dateCommande, clientCommande);
                        commerciale.passerCommande(commande);
                        System.out.println("Commande ajoutée.");
                    } else {
                        System.out.println("Client non trouvé.");
                    }
                    break;
                case 6:
                    System.out.print("Numéro de la commande à annuler : ");
                    numeroCommande = scanner.nextInt();
                    scanner.nextLine();  // Consomme le reste de la ligne
                    Commande commandeASupprimer = null;
                    for (Commande c : commerciale.commandes) {
                        if (c.getNumeroCommande() == numeroCommande) {
                            commandeASupprimer = c;
                            break;
                        }
                    }
                    if (commandeASupprimer != null) {
                        commerciale.annulerCommande(commandeASupprimer);
                        System.out.println("Commande annulée.");
                    } else {
                        System.out.println("Commande non trouvée.");
                    }
                    break;
                case 7:
                    for (Article a : commerciale.articles) {
                        a.affiche();
                    }
                    break;
                case 8:
                    for (Client c : commerciale.clients) {
                        c.affiche();
                    }
                    break;
                case 9:
                    for (Commande c : commerciale.commandes) {
                        c.affiche();
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 0);

        scanner.close();
    }
}
