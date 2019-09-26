package com.company.models;

public class CompteEpargne extends Compte {

    private static final double TAUX_INTERET = 6.00;

    public CompteEpargne() {
        super();
    }

    public CompteEpargne(double solde) {
        super(solde);
    }

    public void calculInteret(){
        solde += solde * (TAUX_INTERET / 100);
    }

}
