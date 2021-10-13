package fr.dauphine.javaavance.td2;
/**
 * 
 * @author katia
 *
 */
public class MainArth {

	public static void main(String[] args) {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		Expr m = new Multiplication(new Value(30.0), val);
		System.out.println(m.eval()); //affiche 40110.0
		Expr r = new RacineCarre(new Value(25.0));
		System.out.println(r.eval()); //affiche 5.0
		


	}

}
