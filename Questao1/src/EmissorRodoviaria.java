package Questao1.src;

public class EmissorRodoviaria extends EmissorPassagem {
    @Override
    protected PassagemRodoviaria criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
