package com.equipo.saludo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String saludar(String nombre){
        return String.format("¡Hola, %s!", nombre);
    }

    public static void main( String[] args )
    {
        System.out.println( saludar("DevOps") );
    }
}
