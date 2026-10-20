package Questao1.src;

import java.util.List;

public class PassagemFerroviaria extends Passagem {

    public PassagemFerroviaria  (String passageiro, double tarifa) { super(passageiro, tarifa); }

    @Override public String getModal() { return "Ferroviaria"; }

    @Override protected double getPercentualTaxa() { return 0.05; }

    @Override public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletrônico (e-ticket)");
    }
}
