package fr.dauphine.javaavance.td2;

/**
 * 
 * @author katia
 *
 */
public class Main {

	// ajouter java doc dans le projet pour le td2


	public static void main(String[] args) {
		//		Mere mere = new Mere();
		//		System.out.println(mere.meth());
		//		mere.printMeth();
		//		
		//		Fille fille = new Fille();
		//		System.out.println(fille.meth());
		//		fille.printMeth();
		//		
		//		Mere mereFille = new Fille();
		//		System.out.println(mereFille.meth());
		//		mereFille.printMeth();

		//		Mere mere = new Mere();
		//		System.out.println(mere.meth);
		//		mere.printMeth();
		//
		//		Fille fille = new Fille();
		//		System.out.println(fille.meth);
		//		fille.printMeth();
		//
		//		Mere mereFille = new Fille();
		//		System.out.println(mereFille.meth);
		//		mereFille.printMeth();




		// EX1- 1-- When we create an instance of the class Mere, we access the method meth() of the class Mere that returns
		// the nb 42. Same thing for the method printMeth().
		// When we create an instance of the class Fille that inherent from the class Mere, we access the method meth()
		// of the class Fille that returns the nb 24. For the method printMeth(), because the class Fille inherent from the class
		// Mere, it prints the method meth() of the class Mere but with the value of the class Fille that is 24.
		// When we create an instance of the class Fille of type Mere, we access the method meth() of the class Fille
		// that returns the nb 24. For the method printMeth(), because the class Fille inherent from the class
		// Mere, it prints the method meth() of the class Mere but with the value of the class Fille that is 24.
		// The values are: 42 42 24 24 24 24.




		// EX1- 2-- If we are at the class Fille, we can call 2 methods of meth() because the class Fille inherent from the class
		// Mere, so we can call the method meth() of the class Mere that is the super.meth() and also the method meth() of the 
		// class Fille.
		// If we are at the class Main, it depends of the object that we use to call the method. Here it is the class Fille so one.




		// EX1- 3-- When we create an instance of the class Mere, we access the method meth() of the class Mere that returns
		// the nb 42. Same thing for the method printMeth(). 
		// When we create an instance of the class Fille that inherent from the class Mere, we access the method meth()
		// of the class Fille that returns the nb 24. For the method printMeth(), because the class Fille inherent from the class
		// Mere and the method meth() is static, it prints the method meth() with the value of the class Mere that is 42.
		// When we create an instance of the class Fille of type Mere, because the method meth() is static, it will refere
		// on the type so here at the class Mere so it returns the value of the class Mere that is 42. Same thing for the
		// method printMeth().
		// The values are: 42 42 24 42 42 42


		// EX1- 4-- When we create an instance of the class Mere, we access the variable meth of the class Mere that contains
		// the value of 42. Same thing for the method printMeth().
		// When we create an instance of the class Fille that inherent from the class Mere, we can access the variable meth
		// of the class Fille that contains the value 24. For the method printMeth(), because the class Fille inherent
		// from the class Mere it prints the variable meth with the value of the class Mere that is 42 because it overrides
		// the value of the class Fille.
		// When we create an instance of the class Fille of type Mere, the variable will refere to the type so here
		// at the class Mere so it returns the value of the class Mere that is 42. Same thing for the method printMeth().
		// The values are: 42 42 24 42 42 42



		// ----------------------------------------------------------------------------------
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();

		// EX2- 1-- The instance of the class Mere cannot call the method miage() because the method is only defined in the
		// child class that is the class Fille, so it cannot access it.
		//mere.miage();
		fille.miage();

		// EX2 1-- the instance of the class Fille of type Mere also cannot call the method miage because it refers on the type
		// so class Mere does not have this method.
		//mereFille.miage();
		((Fille)mereFille).miage();

		mere.a();
		mereFille.a();
		fille.a();
		((Mere)mereFille).a();
		mereFille.b(null);

		mereFille.c();
		mereFille.c(mere);
		mereFille.c(mereFille);
		mereFille.c(fille);
		fille.c(fille);

		mere.d();
		mereFille.d();

		mere.printF();
		mereFille.printF();

		try {
			mereFille.j();
			mereFille.k();
			mereFille.l();
			mereFille.m();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// EX2- 3-- A redifinition method (redifinition) is a method that has the same name and the same parameter
		// of another method but with different content.
		// An overload method (surchage) is a method that has the same name of the method but with different parameters.
		// The method c of the class Mere is an overload method.
		// The methods a b c d (without params) f g j l m are an redefinition method
		// The method d (with params) is an overload method


		// EX2- 4-- The instance of the class Fille calls the method miage() that returns the value Miage.
		// The instance of the type Mere is converted to the type Fille so we can access the method miage().
		// The instance of the class Mere calls the method a() that returns Mere_a.
		// The instance of the class Fille will call the method a() of the child class not of the Mere class,
		// so it returns Fille_a.
		// The instance of the class Fille calls the method a() of its class and returns Fille_a.
		// THe instance of the class Fille of type Mere call the method a() of the class Fille even if its cast
		// to Mere so it returns Fille_a.
		// The instance of the class Fille of type Mere call the method b() of the class Fille so it returns Fille_b(Fille).
		// The instance of the class Fille of type Mere will call the method c() of the class Mere because Fille doesnt have
		// a method c() without params, so it returns Mere_c.
		// The instance of class Fille of type Mere calls the method c() of the class Fille because it has a method
		// with the same params of type Mere so it returns Fille_c(Mere). Same with the next one.
		// The instance of the class Mere calls the static method d that will return Mere_d.
		// The instance of the class Fille of type Mere will return the method d() of the class Mere, because its 
		// a static method so it refers to its type of class so it returns Mere_d
		// The instance of the class Mere calls the method printF() of its class so it returns Mere_f.
		// Same for the next one.
		// The instance of the class Fille of type Mere call the method j() of the class Fille so it returns Fille_j. Same thing
		// for the rest.
		// The values are: Miage Miage Mere_a Fille_a Fille_a Fille_a Fille_b(Fille) Mere_c Fille_c(Mere) Fille_c(Mere)
		// Fille_c(Mere) Fille_c(Fille) static Mere_d static Mere_d Mere_f Mere_f Fille_j Fille_k Fille_l Fille_m
	}

}
