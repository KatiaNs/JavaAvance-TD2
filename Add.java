package fr.dauphine.javaavance.td2;

public class Add implements Expr {
	private Value value;
	private Expr expr;


	/**
	 * 
	 * @param value that stores the first value
	 * @param expr that stores the second value (expresion)
	 */
	public Add(Value value, Expr expr) {
		this.value = value;
		this.expr = expr;
		
	}
	
	// EX3 1-- method eval() that adds the value and the expr 
	/**
	 * @return the addition of the two values
	 */
	public double eval() {
		return value.eval() + expr.eval();
	}

}
