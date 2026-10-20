
public class Matricula {
    private final String aluno;
    private final String curso;
    private final DocumentoFiscal documentoFiscal;
    private final Pagamento pagamento;
    private final Comprovante comprovante;

    public Matricula(FabricaMatricula fabrica, String aluno, String identificacao,
                     String curso, double valor) {
        this.aluno = aluno;
        this.curso = curso;
        this.documentoFiscal = fabrica.criarDocumentoFiscal(valor);
        this.pagamento = fabrica.criarPagamento(valor);
        this.comprovante = fabrica.criarComprovante(aluno, identificacao);
    }

    public void imprimirRelatorio() {
        System.out.println("=== Matrícula confirmada: " + aluno + " | curso: " + curso + " ===");
        System.out.println("Documento fiscal : " + documentoFiscal.descrever());
        System.out.println("Pagamento        : " + pagamento.descrever());
        System.out.println("Comprovante      : " + comprovante.descrever());
        System.out.println();
    }
}
