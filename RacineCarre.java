package fr.dauphine.javaavance.td2;

public class RacineCarre implements Expr {
	private Value value;
	
	/**
	 * 
	 * @param value that stores the value
	 */
	public RacineCarre(Value value) {
		this.value = value;
	}
	
	// EX3- 4-- eval() method to calculate the square root
	/**
	 * @return the square root of the value
	 */
	public double eval() {
		return Math.sqrt(this.value.eval());
	}

}
