package com.ocr.amal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    public final void testGuerrierDescription() {
        Rodeur rodeur = new Rodeur(1, 10, 12, 8);
        assertEquals(rodeur.toString(), "Chuuut ! Je suis le Rodeur, Joueur 1, niveau 30, je posséde 150 de vitalité, 10 de force, 12 d'agilité et 8 d'intelligence.");
    }
    @Test
    public final void testGuerrierJouerCoupClassique() {
        Rodeur rodeur = new Rodeur(1, 10, 12, 8);
        Rodeur adversaire = new Rodeur(2, 10, 12, 8);
        rodeur.setAdversaire(adversaire);
        assertEquals(rodeur.jouer(1), "Joueur 1 utilise Tir à  l'Arc et inflige 12 de dégats");
    }

    @Test
    public final void testGuerrierJouerCoupSpecial() {
        Rodeur rodeur = new Rodeur(1, 10, 12, 8);
        Rodeur adversaire = new Rodeur(2, 10, 12, 8);
        rodeur.setAdversaire(adversaire);
        assertEquals(rodeur.jouer(2), "Joueur 1 utilise Concentration et gagne 15 d'agilité");
    }
}