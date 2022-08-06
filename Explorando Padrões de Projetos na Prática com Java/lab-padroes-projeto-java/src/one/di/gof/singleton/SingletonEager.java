package one.di.gof.singleton;

public class SingletonEager {
	private static class InstanceHolder {
		public static SingletonEager instancia = new SingletonEager();
	}
	
	private SingletonEager() {
	}
	
	public static SingletonEager getInstancia() {		
		return InstanceHolder.instancia;
	}
}
