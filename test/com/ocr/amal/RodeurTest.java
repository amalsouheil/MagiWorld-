package com.ocr.amal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    public final void testGuerrierDescription() {
        Rodeur rodeur = new Rodeur(1, 10, 12, 8);
        assertEquals(rodeur.toString(), "Chuuut ! Je suis le RÃ´deur, Joueur 1, niveau 30, je possÃ¨de 150 de vitalitÃ©, 10 de force, 12 d'agilitÃ© et 8 d'intelligence.");
    }

}