package one.di.gof.strategy;

public class ComportamentoDefensivo implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Se movendo defensivamente.");
	}

}
