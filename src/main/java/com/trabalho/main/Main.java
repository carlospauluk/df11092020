package com.trabalho.main;

import com.trabalho.entidade.Poligono;
import com.trabalho.entidade.Retangulo;
import com.trabalho.entidade.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Daniel F
 */
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String tipo;
        while (true) {
            System.out.println("Informe o tipo de polígono, sendo 'T' para triângulo e 'R' para retângulo: ");
            tipo = s.nextLine();
            if (tipo.equals("T") || tipo.equals("R")) {
                break;
            }
        }

        if (tipo.equals("T")) {
            System.out.println("Triângulo selecionado!");
            System.out.println("Informe um valor para a base:");
            int base = Main.lerNumeroInteiro(s);
            System.out.println("Informe um valor para a altura:");
            int altura = Main.lerNumeroInteiro(s);
            
            Poligono triangulo = new Triangulo(base, altura);
            triangulo.imprimir();
        } else if (tipo.equals("R")) {
            System.out.println("Retângulo selecionado!");
            System.out.println("Informe um valor para o primeiro lado:");
            int lado1 = Main.lerNumeroInteiro(s);
            System.out.println("Informe um valor para o segundo lado:");
            int lado2 = Main.lerNumeroInteiro(s);
            
            Poligono retangulo = new Retangulo(lado1, lado2);
            retangulo.imprimir();
        }

    }

    private static int lerNumeroInteiro(Scanner s) {
        int lado;
        while (true) {
            try {
                lado = Integer.valueOf(s.nextLine());
                if (lado > 0) {
                    return lado;
                } else {
                    System.out.println(">>> (o número deve ser inteiro positivo)");
                }
            } catch (NumberFormatException e) {
                System.out.println(">>> (o valor informado deve ser um número inteiro)");
            }
        }
    }
}
