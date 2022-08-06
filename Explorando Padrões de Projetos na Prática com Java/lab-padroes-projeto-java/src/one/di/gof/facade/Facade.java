package one.di.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	public void migrarCliente(String nome,String cep) {
		CepApi cepApi = CepApi.getInstancia();
		String estado = cepApi.recuperarEstado(cep);
		String cidade = cepApi.recuperarCidade(cep);
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
	}
}
