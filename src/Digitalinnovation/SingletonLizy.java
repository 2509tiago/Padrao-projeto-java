package Digitalinnovation;

/** Singleton "preguiçoso".
 * 
 * @author 2509tiago
 *
 */

public class SingletonLizy {
	
	private static SingletonLizy instancia;
	
	
	private SingletonLizy() {
		super();
	}
	
	public static  SingletonLizy getInstancia() {
		
		if(instancia == null) {
			instancia = new SingletonLizy();
		}
		return instancia;
	}
	
	

}
