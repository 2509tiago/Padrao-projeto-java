package DioStrategy;

import Digitalinnovation.SingletonEager;
import Digitalinnovation.SingletonHolder;
import Digitalinnovation.SingletonLizy;
import Facade.Facade;

public class Test {
	
     // Testes relacionados ao Design Patter Singleton:
	
	public static void main(String[] args) {
		SingletonLizy lazy = SingletonLizy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLizy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonHolder holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonHolder.getInstancia();
		System.out.println(holder);
		
		// Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Tiago", "098275377-42");
			 
		
	}

}
