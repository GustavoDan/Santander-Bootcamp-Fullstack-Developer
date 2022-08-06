
public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Gustavo");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta poupanca = new ContaPoupanca(cliente1);
		
		cc.depositar(100);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("\nClientes do banco: ");
		for (Cliente cliente: Banco.listaClientes()) {
			System.out.println(cliente.getNome());
		}
	}

}
