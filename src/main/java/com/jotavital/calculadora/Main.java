/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jotavital.calculadora;

import java.util.Scanner;

/**
 *
 * @author joao pedro vital
 */
public class Main {
    
        
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        String opc;
        int sair;
        float n1, n2, result;
        Scanner teclado = new Scanner(System.in);
        
        do {            
            System.out.println("\nCalculadora");
            System.out.println("\nInsira o primeiro número:");
            n1 = teclado.nextFloat();
            System.out.println("\nInsira o segundo número:");
            n2 = teclado.nextFloat();
            teclado.nextLine();
            System.out.println("\nInforme o operador + - / *");
            opc = teclado.nextLine();
            switch(opc){
                case "+":
                    result = op.somar(n1, n2);
                    System.out.println("\nResultado = " + result);
                    break;
                case "-":
                    result = op.sub(n1, n2);
                    System.out.println("\nResultado = " + result);
                    break;
                case "*":
                    result = op.mult(n1, n2);
                    System.out.println("\nResultado = " + result);
                    break;
                case "/":
                    result = op.div(n1, n2);
                    System.out.println("\nResultado = " + result);
                    break;
                default:
                    System.out.println("Operação inválida!");
            }
            System.out.println("Aperte 1 para continuar, 0 para sair");
            sair = teclado.nextInt();
        } while (sair != 0);
    }
}
