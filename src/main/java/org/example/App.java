package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int contarVogais(String str) {
        int contador = 0; //contador usado de vogais
        str = str.toLowerCase(); // Converte para minúsculas para facilitar a comparação

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void main( String[] args ) {

        String texto = "Save Rock and Roll!"; // texto será inserido no método
        System.out.println("Número de vogais na frase " + texto + ": " + contarVogais(texto));
    }
}
