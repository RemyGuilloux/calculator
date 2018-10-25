package com.socgen.calculator;

public class Application {

    public static void main(String[] args) {
	 
		
		String str = args[0];
		String[] parts = str.split("\\+");
		if (str.split("\\+").equals(true)) {
		    
		    System.out.println(parts[0] );
		} else if (str.split("\\-").equals(true)) {
		    System.out.println(parts[0]  ); 
		} else if (str.split("\\*") .equals(true)) {
		    System.out.println(parts[0]  ); 
		} else if (str.split("\\/").equals(true)) {
		    System.out.println(parts[0]  );
		}
//		int  par= str.lastIndexOf('+',parts.length -1);
	//	
//		str.charAt(par);
//		System.out.println(parts[0]);
//		System.out.println(parts[1]);
		
		Calculate calc = new Calculate(1, 1);
		System.out.println(Calculator.ADD.getResult(calc));

    }

}
