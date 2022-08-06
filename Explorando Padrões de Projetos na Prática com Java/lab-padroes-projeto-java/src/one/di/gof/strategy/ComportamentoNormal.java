package one.di.gof.strategy;

public class ComportamentoNormal implements IComportamento {

	@Override
	public void mover() {
		System.out.println("Se movendo normalmente.");
	}

}
