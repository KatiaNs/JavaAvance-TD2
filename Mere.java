package fr.dauphine.javaavance.td2;

import java.io.IOException;

public class Mere {

	//	protected static int meth() {
	//		return 42;
	//	}
	//	
	//	public void printMeth() {
	//		System.out.println(meth());
	//	}

//	protected int meth=42;
//
//	public void printMeth() {
//		System.out.println(meth); 
//	}

	// ------------------------------------------------------------------------------
	
	public void a() {System.out.println("Mere_a"); }
	/**
	 * 
	 * @param fille
	 */
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}

	
	// EX2 2-- overload method (méthode de surcharge)
	void c() {System.out.println("Mere_c");}
	
	/**
	 * 
	 * @param mere
	 */
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }

	static void d() {System.out.println("static Mere_d");}

	protected void e() {System.out.println("Mere_e");}
	private void f() {System.out.println("Mere_f");}
	public void printF() { f(); }

	/**
	 * 
	 * @return the value of the object g that is 2
	 */
	Object g() {System.out.println("Mere_g"); return 2;}
	
	/**
	 * 
	 * @return the value of the int h that is 2
	 */
	int h() {System.out.println("Mere_h"); return 2;}
	void i() {System.out.println("Mere_i");}

	/**
	 * 
	 * @throws Exception
	 */
	void j() throws Exception {System.out.println("Mere_j"); }
	
	/**
	 * 
	 * @throws IOException
	 */
	void k() throws IOException {System.out.println("Mere_k"); }
	
	/**
	 * 
	 * @throws Exception
	 */
	void l() throws Exception {System.out.println("Mere_l"); }
	
	/**
	 * 
	 * @throws Exception
	 * @throws ArrayIndexOutOfBoundsException
	 */
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m");


	}
}



