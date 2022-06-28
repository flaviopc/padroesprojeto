package subsistema2cep;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstancia() {
        return instancia;
    }

    public String recuperaCidade(String cep) {
        return "Aracaju";
    }

    public String recuperaEstado(String cep) {
        return "Sergipe";
    }
}
