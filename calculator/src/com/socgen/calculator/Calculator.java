package com.socgen.calculator;

public enum Calculator {
    ADD {
	@Override
	public double getResult(Calculate calculate) {
	    // TODO Auto-generated method stub
	    return calculate.add();
	}
    },SUBSTRACT {
	@Override
	public double getResult(Calculate calculate) {
	    // TODO Auto-generated method stub
	    return calculate.substract();
	}
    },MULTIPLY {
	@Override
	public double getResult(Calculate calculate) {
	    // TODO Auto-generated method stub
	    return calculate.multiply();
	}
    },DIVIDE {
	@Override
	public double getResult(Calculate calculate) {
	    // TODO Auto-generated method stub
	    return calculate.divide();
	}
    };


public abstract double getResult(Calculate calculate);
}
