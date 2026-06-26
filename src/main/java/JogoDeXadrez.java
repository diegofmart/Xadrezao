public class JogoDeXadrez implements Jogo {

    @Override
    public void iniciar() {

        Tabuleiro tabuleiro = new Tabuleiro();

        Jogador jogador1 = new JogadorHumano('b');
        Jogador jogador2 = new JogadorSintetico('p');

        while (!tabuleiro.acabouOJogo()) {

            jogador1.jogar(tabuleiro, "", 0);

            java.util.Scanner entrada = new java.util.Scanner(System.in);

            System.out.print("Deseja continuar jogando? (S/N): ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        JogoDeXadrez jogo = new JogoDeXadrez();

        jogo.iniciar();

        System.out.println("Feito por Diego F.");
    }
}