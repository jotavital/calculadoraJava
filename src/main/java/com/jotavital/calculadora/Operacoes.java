/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jotavital.calculadora;

/**
 *
 * @author picle
 */
public class Operacoes {
    private float resultado;
    
    public Operacoes(){
        
    }
    
    float somar(float n1, float n2){
        this.resultado = n1 + n2;
        return resultado;
    }
    
    float sub(float n1, float n2){
        this.resultado = n1 - n2;
        return resultado;
    }
    
    float mult(float n1, float n2){
        this.resultado = n1 * n2;
        return resultado;
    }
    
    float div(float n1, float n2){
        this.resultado = n1 / n2;
        return resultado;
    }
}
