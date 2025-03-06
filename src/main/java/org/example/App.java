package org.example;

/**
 * Hello world!
 *
 */
public class App
{
 
    public static double calcularMedia(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }

 public static String inverterString(String str) {
        String invertida = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }
  
    public static void main( String[] args )
    {
        double numero1 = 39;
        double numero2 = 14;

        double media = calcularMedia(numero1, numero2); // média chama o metodo calcular, que faz toda a conta
        System.out.println("A média de " + numero1 + " e " + numero2 + " é: " + media);
      
      
        String texto = "Java";
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + inverterString(texto));

    
}
