package com.exemple.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	CalculSomme calcul=new CalculSomme();
	IMCCalcul imc=new IMCCalcul();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testSomme() {
    	
    	assertTrue(calcul.calculSomme(1, 2)==3);
    	
    }
    
    @Test
    public void testIMC() {
    	
    	
    	assertTrue(imc.calculIMC(1.80, 100)==31);
    }
}
