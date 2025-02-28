package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    int numero = 8;

    if (verificar(numero)) {
        System.out.println(numero + " é par");
    } else {
        System.out.println(numero + " é impar");
    }
    }
    public static boolean verificar(int numero){
     return numero %2 == 0;
    }
}
