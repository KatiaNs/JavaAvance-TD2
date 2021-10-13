package fr.dauphine.javaavance.td2;

public class Multiplication implements Expr {
	private Value value;
	private Expr expr;
	
	// EX3- 3-- Created a new class multiplication that implements the eval() method and do the multiplication
	/**
	 * 
	 * @param value that stores the first value
	 * @param expr that stores the second value
	 */
	public Multiplication(Value value, Expr expr) {
		this.value = value;
		this.expr = expr;
	}
	
	/**
	 * @return the multiplication of the two values
	 */
	public double eval() {
		return value.eval() * expr.eval();
	}

}
