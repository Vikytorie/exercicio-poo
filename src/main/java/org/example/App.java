package org.example;


public class App 
{
    public static void main( String[] args ) {
        int num = 5;
        System.out.println("O fatorial de " + num + " é: " + fatoriar(num));
    }

    public static long fatoriar(int num){
       long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i; // Multiplica o valor atual pelo índice i
        }

            return fatorial;

        }
    }

