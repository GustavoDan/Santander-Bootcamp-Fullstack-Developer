package subsistema2.cep;

public class CepApi {
	private static class InstanceHolder {
		public static CepApi instancia = new CepApi();
	}
	
	private CepApi() {
	}
	
	public static CepApi getInstancia() {		
		return InstanceHolder.instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
