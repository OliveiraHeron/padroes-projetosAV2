package Questao1.src;

import java.util.List;

public class PassagemRodoviaria extends Passagem {

    public PassagemRodoviaria(String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override public String getModal() { return "Rodoviaria"; }

    @Override protected double getPercentualTaxa() { return 0.03; }

    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletrônico (e-ticket)");
    }
}
