package com.exemple.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IMCCalcul calcul=new IMCCalcul();
        System.out.println( calcul.calculIMC(1.80, 100) );
    }
}
