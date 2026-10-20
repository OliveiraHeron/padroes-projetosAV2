public class ComprovanteChile implements Comprovante {
    private final String aluno;
    private final String rut;

    public ComprovanteChile(String aluno, String rut) { this.aluno = aluno; this.rut = rut; }

    @Override public String descrever() {
        return "Comprobante de matrícula | aluno: " + aluno + " | RUT: " + rut;
    }
}
