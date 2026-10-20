import java.util.List;

public class PassagemAerea extends Passagem {

    public PassagemAerea(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override public String getModal() { return "Aéreo"; }

    @Override protected double getPercentualTaxa() { return 0.08; }

    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletrônico (e-ticket)");
    }
}
