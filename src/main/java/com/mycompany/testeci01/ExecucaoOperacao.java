/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeci01;

/**
 *
 * @author camille
 */
public class ExecucaoOperacao {
    
    public static void main(String[] args) {
        
        Operacoes op = new Operacoes();
        
        int x = op.soma(3, 5);
        
        System.out.println("resultado: "+x);
        
    }
    
}
