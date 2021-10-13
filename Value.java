package fr.dauphine.javaavance.td2;

public class Value implements Expr{
	double value = 0;
	
	/**
	 * 
	 * @param value that stores the value
	 */
	public Value(double value) {
		this.value = value;
	}
	
	// EX3 1-- methos eval() that returns the value
	/**
	 * @return the value
	 */
	public double eval() {
		return this.value;
	}

}
