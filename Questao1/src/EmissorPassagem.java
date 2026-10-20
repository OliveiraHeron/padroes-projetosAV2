package Questao1.src;

public abstract class EmissorPassagem {

    /** Factory Method: cada emissor especializado decide qual passagem criar. */
    protected abstract EmissorFerroviaria criarPassagem(String passageiro, double tarifa);

    public final Passagem emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);   
        passagem.calcularTaxaEmbarque();                         
        System.out.println(passagem.resumo());                   
        System.out.println();
        return passagem;
    }
}