public class FabricaBrasil implements FabricaMatricula {
    @Override public DocumentoFiscal criarDocumentoFiscal(double valor) { return new NFSe(valor); }
    @Override public Pagamento criarPagamento(double valor) { return new PagamentoPix(valor); }
    @Override public Comprovante criarComprovante(String aluno, String identificacao) {
        return new ComprovanteBrasil(aluno, identificacao);
    }
}
