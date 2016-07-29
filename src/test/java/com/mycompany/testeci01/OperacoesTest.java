/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeci01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author camille
 */
public class OperacoesTest {

    Operacoes instance;
    int x;
    int w;

    @Before
    public void setUp() {

        instance = new Operacoes();
        
        x = 5;
        w = 0;

    }

    @Test
    public void testSoma() {
       
        instance.soma(x, w);
        
    }

    @Test
    public void testSubtracao() {
    
        instance.subtracao(x, w);
        
    }

}
