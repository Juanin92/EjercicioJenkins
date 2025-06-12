package com.equipo.saludo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testSaludar() {
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }
}
