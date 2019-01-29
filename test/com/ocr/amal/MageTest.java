package com.ocr.amal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    public final void testGuerrierDescription() {
        Mage mage = new Mage(1, 10, 12, 8);
        assertEquals(mage.toString(), "Abracadabraaa ! Je suis le Mage, Joueur 1, niveau 30, je possÃ¨de 150 de vitalitÃ©, 10 de force, 12 d'agilitÃ© et 8 d'intelligence.");
    }



}