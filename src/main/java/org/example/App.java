package org.example;



public class App
{
  //Métodos

  public static int soma(int n1, int n2){
        return n1 +n2;
  
    
    public static long fatoriar(int numfatoral){
       long fatorial = 1;
        for (int i = 1; i <= numfatoral; i++) {
            fatorial *= i; // Multiplica o valor atual pelo índice i
        }

            return fatorial;

        }
    }
  
  
  public static int contarVogais(String str) {
        int contador = 0; //contador usado de vogais
        str = str.toLowerCase(); // Converte para minúsculas para facilitar a comparação

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
  
  
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
    
    
      public static boolean verificar(int numero){
     return numero %2 == 0;

    }
    
  // Início da main-------------------------------------------------
    public static void main( String[] args ){
      
      
      
      int resultado = soma(3,5);
        System.out.println("A soma é: " + resultado);
      
      

    int numfatoral = 5;
    System.out.println("O fatorial de " + numfatoral + " é: " + fatoriar(numfatoral));  
      
    int numero = 8;

    if (verificar(numero)) {
        System.out.println(numero + " é par");
    } else {
        System.out.println(numero + " é impar");
    }
    }
  

        double numero1 = 39;
        double numero2 = 14;

        double media = calcularMedia(numero1, numero2); // média chama o metodo calcular, que faz toda a conta
        System.out.println("A média de " + numero1 + " e " + numero2 + " é: " + media);
      
      
        String texto = "Java";
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + inverterString(texto));
      
      
        String texto = "Save Rock and Roll!"; // texto será inserido no método
        System.out.println("Número de vogais na frase " + texto + ": " + contarVogais(texto));

}

