package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
    public static void main( String[] args )
    {
        String texto = "Java";
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + inverterString(texto));
    }
}
