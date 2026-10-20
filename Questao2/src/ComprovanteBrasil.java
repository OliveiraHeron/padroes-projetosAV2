public class ComprovanteBrasil implements Comprovante {
    private final String aluno;
    private final String cpf;

    public ComprovanteBrasil(String aluno, String cpf) { this.aluno = aluno; this.cpf = cpf; }

    @Override public String descrever() {
        return "Comprovante de matrícula | aluno: " + aluno + " | CPF: " + cpf;
    }
}
