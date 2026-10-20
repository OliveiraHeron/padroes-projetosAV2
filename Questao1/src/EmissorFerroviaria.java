package Questao1.src;

public class EmissorFerroviaria extends EmissorPassagem {
    @Override
    protected EmissorFerroviaria criarPassagem(String passageiro, double tarifa) {
        return new EmissorFerroviaria();
    }
}