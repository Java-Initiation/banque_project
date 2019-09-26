package com.company.models;

public class Compte {

    private final int code;
    protected double solde = 0.00;

    private static int ctCode = 0;

    public Compte() {
        this.code = ctCode;
        ctCode++;
    }

    public Compte(double solde) {
        // on appelle le constructeur Compte() à l'aide de this
        this();
        this.solde = solde;
    }

    public void depot(double montant){
        System.out.println("Dépôt de " + montant);
        solde += montant;
    }

    public void retrait(double montant){
        System.out.println("Retrait : " + solde);
        solde -= montant;
    }

    public void affSolde() {
        System.out.println("Solde : " + solde);
    }

    public int getCode() {
        return code;
    }

}
