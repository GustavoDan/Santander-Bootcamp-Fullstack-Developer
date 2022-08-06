package one.di.gof.strategy;

public class ComportamentoAgressivo implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Se movendo agressivamente.");
	}

}
