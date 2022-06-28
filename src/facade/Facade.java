package facade;

import subsistema1crm.CrmService;
import subsistema2cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepAPI.getInstancia().recuperaCidade(cep);
        String estado = CepAPI.getInstancia().recuperaEstado(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
