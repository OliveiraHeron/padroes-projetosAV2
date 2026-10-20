
public interface FabricaMatricula {
    DocumentoFiscal criarDocumentoFiscal(double valor);
    Pagamento criarPagamento(double valor);
    Comprovante criarComprovante(String aluno, String identificacao);
}
