package Jour07.Job0;

public class Personne {
    // Attributs publics
    public String nom;
    public String prenom;

    // Attributs protégés
    protected String dateDeNaissance;
    protected String lieuDeNaissance;

    // Attributs privés
    private String adresse;
    private String telephone;

    // Constructeur
    public Personne(String nom, String prenom, String dateDeNaissance, String lieuDeNaissance, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    // Getter pour adresse
    public String getAdresse() {
        return adresse;
    }

    // Setter pour adresse
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    // Getter pour téléphone
    public String getTelephone() {
        return telephone;
    }

    // Setter pour téléphone
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    // Getter pour date de naissance
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    // Setter pour date de naissance
    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    // Getter pour lieu de naissance
    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    // Setter pour lieu de naissance
    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }
}