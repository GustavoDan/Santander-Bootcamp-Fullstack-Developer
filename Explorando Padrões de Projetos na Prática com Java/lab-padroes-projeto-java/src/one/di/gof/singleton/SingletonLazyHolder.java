package one.di.gof.singleton;

public class SingletonLazyHolder {
	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	
	private SingletonLazyHolder() {
	}
	
	public static SingletonLazyHolder getInstancia() {		
		return instancia;
	}
}
