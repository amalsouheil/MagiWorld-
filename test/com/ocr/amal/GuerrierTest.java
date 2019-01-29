package com.ocr.amal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {


    @Test
    public final void testGuerrierDescription() {
        Guerrier guerrier = new Guerrier(1, 10, 12, 8);
        assertEquals(guerrier.toString(), "Wouarggg ! Je suis le Guerrier, Joueur 1, niveau 30, je possÃ¨de 150 de vitalitÃ©, 10 de force, 12 d'agilitÃ© et 8 d'intelligence.");
    }




}