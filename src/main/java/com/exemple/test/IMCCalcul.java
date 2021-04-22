package com.exemple.test;

public class IMCCalcul {
	
	public double calculIMC(double taille,double poids) {
		return Math.round(poids/(taille*taille));
	}

}
