package com.company.models;

public class ComptePayant extends Compte {

    private static final double FRAIS = 0.10;

    public ComptePayant() {
        super();
    }

    public ComptePayant(double solde) {
        super(solde);
    }

    @Override
    public void retrait(double montant) {
        super.retrait(montant);
        System.out.println("Frais de service : " + FRAIS);
        solde -= FRAIS;
    }

    @Override
    public void depot(double montant) {
        super.depot(montant);
        System.out.println("Frais de service : " + FRAIS);
        solde -= FRAIS;
    }

}
