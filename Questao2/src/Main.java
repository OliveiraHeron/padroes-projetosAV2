import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        Matricula brasil = new Matricula(new FabricaBrasil(),
            "Ingrid Oliveira", "123.456.789-09", "Java Avançado", 1000.00);
        Matricula chile = new Matricula(new FabricaChile(),
            "Adriana oliveira", "12.345.678-5", "Java Avançado", 50000);

        brasil.imprimirRelatorio();
        chile.imprimirRelatorio();
    }
}
