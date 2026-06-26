import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XadrezTest {

    @Test
    void verificarJogoDeXadrez() {
        Assertions.assertNotNull(new JogoDeXadrez());
    }

    @Test
    void verificarJogadorHumano() {
        Assertions.assertNotNull(new JogadorHumano('b'));
    }

    @Test
    void verificarJogadorSintetico() {
        Assertions.assertNotNull(new JogadorSintetico('p'));
    }

    @Test
    void verificarTabuleiro() {
        Assertions.assertNotNull(new Tabuleiro());
    }

    @Test
    void verificarCasaLivre() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Assertions.assertTrue(tabuleiro.casaLivre("A3"));
    }

    @Test
    void verificarCasaOcupada() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Assertions.assertFalse(tabuleiro.casaLivre("A1"));
    }
}