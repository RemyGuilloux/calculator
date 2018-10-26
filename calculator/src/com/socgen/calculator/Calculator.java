package com.socgen.calculator;

public enum Calculator {
    
 // Assignation de l'opérateur +,-,/,*
    
    ADD {
	@Override
	public double operation(double value1, double value2) {
	    // TODO Auto-generated method stub
	    return value1+ value2;
	}
    } 
   	
       ,SUBSTRACT {
	@Override
	public double operation(double value1, double value2) {
	    // TODO Auto-generated method stub
	    return value1 - value2;
	}
    } 
   	
   	
       ,MULTIPLY {
	@Override
	public double operation(double value1, double value2) {
	    // TODO Auto-generated method stub
	    return value1 * value2;
	}
    } 
   	
       ,DIVIDE {
	@Override
	public double operation(double value1, double value2) {
	    // TODO Auto-generated method stub
	    return value1/value2;
	}
    }
   	
       ;


   public abstract double operation(double value1,double value2);
}
