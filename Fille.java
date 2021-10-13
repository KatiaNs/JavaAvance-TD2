package fr.dauphine.javaavance.td2;

import java.io.IOException;

public class Fille extends Mere {

	//	protected static int meth() {
	//		return 24;
	//	}

	//public int meth = 24;


	// -------------------------------------------------------------------------------
	void miage() {System.out.println("Miage");}

	// EX2- 3-- redifinition method (méthode de redefinition)
	public void a() {System.out.println("Fille_a"); }

	// EX2- 3-- redifinition method (méthode de redefinition)
	/**
	 * @param fille
	 */
	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}

	// EX2- 3-- redifinition method (méthode de redefinition)
	/**
	 * @param mere
	 */
	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
	/**
	 * 
	 * @param b
	 */
	void c(Fille b) {System.out.println("Fille_c(Fille)"); }

	// EX2- 3-- redifinition method (méthode de redefinition)
	static void d() {System.out.println("static Fille_d");}

	// EX2- 3-- overlord method (méthode de surchage)
	/**
	 * 
	 * @param mere
	 */
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}

	// EX2- 1-- We cannot create a private method on a child class.
	//private void e() {System.out.println("Fille_e");}

	// EX2- 3-- redifinition method (méthode de redefinition)
	protected void f() {System.out.println("Fille_f");}

	// EX2- 3-- redifinition method (méthode de redefinition)
	String g() {System.out.println("Fille_g"); return "c";}

	// EX2 1-- This method is a type of char, cannot return a String type.
	//char h() {System.out.println("Fille_h"); return "c";}
	
	
	//int i() {System.out.println("Fille_i"); return 3; }

	// EX2- 3-- redifinition method (méthode de redefinition)
	void j() throws IOException {System.out.println("Fille_j"); }
	
	
	// EX2- 1-- We cannot use the throws exception, we need to change it to IOException. 
	void k() throws IOException {System.out.println("Fille_k"); }

	// EX2- 3-- redifinition method (méthode de redefinition)
	void l() {System.out.println("Fille_l");}
	// EX2- 3-- redifinition method (méthode de redefinition)
	/**
	 * @throws IOException, IllegalArgumentException
	 */
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }




}
