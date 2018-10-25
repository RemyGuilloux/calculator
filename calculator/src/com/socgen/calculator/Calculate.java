package com.socgen.calculator;

public class Calculate {
    private double value1;
    private double value2;
    
    
    public Calculate (double value1,double value2) {
	
    this.value1 = value1;
    
    this.value2 = value2;
    }
	   public double add() {
	return value1 +value2;
    }
    
	   public double multiply() {
	       return value1 * value2;
	   }
	   
	   public double divide( ) {
	       return value1/value2; 
	   }
	   
	   public double substract( ) {
	       return value1-value2; 
	   }
}
