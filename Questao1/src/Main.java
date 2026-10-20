import java.io.PrintStream;
import java.nio.charset.StandardCharsets;


public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        EmissorPassagem[] emissores = {
            new EmissorAereo(),
            new EmissorRodoviario(),
            new EmissorFerroviario()
        };
        double[] tarifas = { 1200.00, 150.00, 300.00 };
        String[] passageiros = { "Adriana oliveira", "Ingrid Oliveira", "Heron filho" };

        for (int i = 0; i < emissores.length; i++) {
            emissores[i].emitir(passageiros[i], tarifas[i]);
        }
    }
}
