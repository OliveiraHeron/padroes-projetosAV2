package Questao1.src;


import java.util.List;
import java.util.Locale;

public abstract class  Passagem {

   protected String passageiro;
   protected double tarifa;

    

    protected Passagem(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getPassageiro() { return passageiro; }

    public double getTarifa() { return tarifa; }

    public abstract String getModal();

    
    protected abstract double getPercentualTaxa();

    public abstract List<String> getDocumentosExigidos();

    public double calcularTaxaEmbarque() {
        return tarifa * getPercentualTaxa();
    }

    public String resumo() {
        return "Modal: %s%nPassageiro: %s%nTaxa de embarque: R$ %.2f%nDocumentos exigidos: %s"+
            getModal(), passageiro, calcularTaxaEmbarque(),
            String.join(", ", getDocumentosExigidos()));
    }
}
