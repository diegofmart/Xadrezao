import java.util.Scanner;

public class JogadorHumano extends Jogador {

    public JogadorHumano(char cor) {
        super(cor);
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual peça você quer mover? ");
        String peca = entrada.nextLine();

        System.out.print("Para qual casa você deseja mover? ");
        String casa = entrada.nextLine();

        if (tabuleiro.moverPeca(peca, casa)) {

            System.out.println("\nPeça movida com sucesso!\n");
            tabuleiro.mostrar();
            return true;

        } else {

            System.out.println("\nNão foi possível mover a peça. A casa está ocupada ou a peça não existe.\n");
            return false;
        }
    }
}