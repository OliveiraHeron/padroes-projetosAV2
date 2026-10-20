package Questao1.src;

public class EmissorAereo extends EmissorPassagem {
    @Override
    protected PassagemAerea criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
