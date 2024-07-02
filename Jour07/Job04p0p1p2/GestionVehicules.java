package Jour07.Job04p0p1p2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GestionVehicules {

    public static class Vehicule {
        private String marque;
        private LocalDate dateAchat;
        private double prixAchat;
        private double prixCourant;

        public Vehicule(String marque, String dateAchat, double prixAchat) {
            this.marque = marque;
            this.dateAchat = LocalDate.parse(dateAchat, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.prixAchat = prixAchat;
            this.prixCourant = prixAchat;
        }

        public void calculePrix(int anneeActuelle) {
            int annees = anneeActuelle - dateAchat.getYear();
            this.prixCourant = prixAchat * Math.pow(0.99, annees);
            if (this.prixCourant < 0) {
                this.prixCourant = 0;
            }
        }

        public void affiche() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Marque: " + marque);
            System.out.println("Date d'achat: " + dateAchat.format(formatter));
            System.out.println("Prix d'achat: " + prixAchat);
            System.out.println("Prix courant: " + prixCourant);
        }

        public String getMarque() {
            return marque;
        }

        public LocalDate getDateAchat() {
            return dateAchat;
        }

        public double getPrixAchat() {
            return prixAchat;
        }

        public double getPrixCourant() {
            return prixCourant;
        }

        public void setMarque(String marque) {
            this.marque = marque;
        }

        public void setDateAchat(String dateAchat) {
            this.dateAchat = LocalDate.parse(dateAchat, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            this.prixCourant = prixAchat;
        }

        public void setPrixAchat(double prixAchat) {
            this.prixAchat = prixAchat;
            this.prixCourant = prixAchat;
        }
    }

    public static class Voiture extends Vehicule {
        private double cylindree;
        private int nombrePortes;
        private int puissance;
        private double kilometrage;

        public Voiture(String marque, String dateAchat, double prixAchat, double cylindree, int nombrePortes, int puissance, double kilometrage) {
            super(marque, dateAchat, prixAchat);
            this.cylindree = cylindree;
            this.nombrePortes = nombrePortes;
            this.puissance = puissance;
            this.kilometrage = kilometrage;
        }

        @Override
        public void calculePrix(int anneeActuelle) {
            int annees = anneeActuelle - getDateAchat().getYear();
            double devaluation = 0.02 * annees;
            devaluation += 0.05 * (Math.round(kilometrage / 10000.0));

            if (getMarque().equalsIgnoreCase("Renault") || getMarque().equalsIgnoreCase("Fiat")) {
                devaluation += 0.10;
            } else if (getMarque().equalsIgnoreCase("Ferrari") || getMarque().equalsIgnoreCase("Porsche")) {
                devaluation -= 0.20;
            }

            double prixCourant = getPrixAchat() * (1 - devaluation);
            if (prixCourant < 0) {
                prixCourant = 0;
            }
            setPrixCourant(prixCourant);
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("Cylindrée: " + cylindree + " L");
            System.out.println("Nombre de portes: " + nombrePortes);
            System.out.println("Puissance: " + puissance + " CV");
            System.out.println("Kilométrage: " + kilometrage + " km");
        }

        public double getCylindree() {
            return cylindree;
        }

        public void setCylindree(double cylindree) {
            this.cylindree = cylindree;
        }

        public int getNombrePortes() {
            return nombrePortes;
        }

        public void setNombrePortes(int nombrePortes) {
            this.nombrePortes = nombrePortes;
        }

        public int getPuissance() {
            return puissance;
        }

        public void setPuissance(int puissance) {
            this.puissance = puissance;
        }

        public double getKilometrage() {
            return kilometrage;
        }

        public void setKilometrage(double kilometrage) {
            this.kilometrage = kilometrage;
        }

        public void setPrixCourant(double prixCourant) {
            super.prixCourant = prixCourant;
        }
    }

    public static class Avion extends Vehicule {
        private String typeMoteur;
        private double heuresDeVol;

        public Avion(String marque, String dateAchat, double prixAchat, String typeMoteur, double heuresDeVol) {
            super(marque, dateAchat, prixAchat);
            this.typeMoteur = typeMoteur;
            this.heuresDeVol = heuresDeVol;
        }

        @Override
        public void calculePrix(int anneeActuelle) {
            double devaluation;
            if (typeMoteur.equalsIgnoreCase("HELICES")) {
                devaluation = 0.10 * (Math.round(heuresDeVol / 100.0));
            } else {
                devaluation = 0.10 * (Math.round(heuresDeVol / 1000.0));
            }

            double prixCourant = getPrixAchat() * (1 - devaluation);
            if (prixCourant < 0) {
                prixCourant = 0;
            }
            setPrixCourant(prixCourant);
        }

        @Override
        public void affiche() {
            super.affiche();
            System.out.println("Type de moteur: " + typeMoteur);
            System.out.println("Heures de vol: " + heuresDeVol + " h");
        }

        public String getTypeMoteur() {
            return typeMoteur;
        }

        public void setTypeMoteur(String typeMoteur) {
            this.typeMoteur = typeMoteur;
        }

        public double getHeuresDeVol() {
            return heuresDeVol;
        }

        public void setHeuresDeVol(double heuresDeVol) {
            this.heuresDeVol = heuresDeVol;
        }

        public void setPrixCourant(double prixCourant) {
            super.prixCourant = prixCourant;
        }
    }

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Toyota", "2020-05-15", 20000.0, 1.8, 4, 140, 30000.0);
        voiture.calculePrix(2024); 
        voiture.affiche();

        Avion avion = new Avion("Boeing", "2015-07-23", 120000000.0, "REACTION", 5000.0);
        avion.calculePrix(2024); 
        avion.affiche();
    }
}