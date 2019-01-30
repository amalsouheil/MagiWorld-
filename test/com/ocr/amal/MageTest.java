package com.ocr.amal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public final void testGuerrierDescription() {
        Mage mage = new Mage(1, 10, 12, 8);
        assertEquals(mage.toString(), "Abracadabraaa ! Je suis le Mage, Joueur 1, niveau 30, je possÃ¨de 150 de vitalitÃ©, 10 de force, 12 d'agilitÃ© et 8 d'intelligence.");
    }

    @Test
    public final void testGuerrierJouerCoupClassique() {
        Mage mage = new Mage(1, 10, 12, 8);
        Mage adversaire = new Mage(2, 10, 12, 8);
        mage.setAdversaire(adversaire);
        assertEquals(mage.jouer(1), "Joueur 1 utilise boule de feu et inflige 8 de dégats");
    }

    @Test
    public final void testGuerrierJouerCoupSpecial() {
        Mage mage = new Mage(1, 10, 12, 8);
        Mage adversaire = new Mage(2, 10, 12, 8);
        mage.setAdversaire(adversaire);
        assertEquals(mage.jouer(2), "Joueur 1 utilise Soin et gagne 0 de vitalité");
        mage.vie = 0;
        assertEquals(mage.jouer(2), "Joueur 1 utilise Soin et gagne 16 de vitalité");
    }

}