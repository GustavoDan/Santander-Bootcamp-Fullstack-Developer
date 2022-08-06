package one.di.gof;

import one.di.gof.facade.Facade;
import one.di.gof.singleton.SingletonEager;
import one.di.gof.singleton.SingletonLazy;
import one.di.gof.singleton.SingletonLazyHolder;
import one.di.gof.strategy.ComportamentoAgressivo;
import one.di.gof.strategy.ComportamentoDefensivo;
import one.di.gof.strategy.ComportamentoNormal;
import one.di.gof.strategy.IComportamento;
import one.di.gof.strategy.Robo;

public class Main {
	public static void main(String[] args) {
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		IComportamento normal = new ComportamentoNormal();
		IComportamento defensivo = new ComportamentoDefensivo();
		IComportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
		robo.setStrategy(agressivo);
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Gustavo", "12345");
	}
	
}
