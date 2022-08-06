import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private static List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static List<Cliente> listaClientes() {
		List<Cliente> clientes = new ArrayList<>();
		for (Conta conta : contas) {
			if(!clientes.contains(conta.cliente)) {				
				clientes.add(conta.cliente);
			}
		}
		
		return clientes;
	}

	public static void addConta(Conta conta) {
		Banco.contas.add(conta);
	}
}
