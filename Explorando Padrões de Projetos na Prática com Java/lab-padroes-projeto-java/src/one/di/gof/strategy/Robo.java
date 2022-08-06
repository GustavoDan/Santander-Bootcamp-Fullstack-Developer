package one.di.gof.strategy;

public class Robo {
	private IComportamento comportamento;

	public void setStrategy(IComportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
}
