package facade;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CinemaEmCasaFacadeTest {
    @Test
    void deveCoordenarSubsistemasParaAssistirEEncerrarFilme() {
        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        PrintStream saidaOriginal = System.out;
        try {
            System.setOut(new PrintStream(saida, true, StandardCharsets.UTF_8));
            CinemaEmCasaFacade cinema = new CinemaEmCasaFacade(
                    new Projetor(), new SistemaDeSom(), new Reprodutor());

            cinema.assistirFilme("Filme de teste");
            cinema.encerrarSessao();
        } finally {
            System.setOut(saidaOriginal);
        }

        String resultado = saida.toString(StandardCharsets.UTF_8);
        assertTrue(resultado.contains("Projetor ligado."));
        assertTrue(resultado.contains("Volume ajustado para 20."));
        assertTrue(resultado.contains("Reproduzindo: Filme de teste."));
        assertTrue(resultado.contains("Reprodução encerrada."));
        assertTrue(resultado.contains("Projetor desligado."));
    }
}
