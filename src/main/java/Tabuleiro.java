public class Tabuleiro {

    private String[][] casas = new String[8][8];

    public Tabuleiro() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                casas[i][j] = "   ";
            }
        }

        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {

        // Peças pretas
        casas[0][0] = "T1p";
        casas[0][1] = "H1p";
        casas[0][2] = "B1p";
        casas[0][3] = "Q0p";
        casas[0][4] = "K0p";
        casas[0][5] = "B2p";
        casas[0][6] = "H2p";
        casas[0][7] = "T2p";

        for (int i = 0; i < 8; i++) {
            casas[1][i] = "P" + (i + 1) + "p";
        }

        // Peças brancas
        for (int i = 0; i < 8; i++) {
            casas[6][i] = "P" + (i + 1) + "b";
        }

        casas[7][0] = "T1b";
        casas[7][1] = "H1b";
        casas[7][2] = "B1b";
        casas[7][3] = "Q0b";
        casas[7][4] = "K0b";
        casas[7][5] = "B2b";
        casas[7][6] = "H2b";
        casas[7][7] = "T2b";
    }

    public void mostrar() {

        System.out.println("    A    B    C    D    E    F    G    H");

        for (int i = 0; i < 8; i++) {

            System.out.print((8 - i) + " ");

            for (int j = 0; j < 8; j++) {

                System.out.print("[" + casas[i][j] + "]");
            }

            System.out.println(" " + (8 - i));
        }

        System.out.println("    A    B    C    D    E    F    G    H");
    }

    public boolean casaLivre(String casa) {

        char coluna = Character.toUpperCase(casa.charAt(0));
        int linha = Character.getNumericValue(casa.charAt(1));

        int colunaIndice = coluna - 'A';
        int linhaIndice = 8 - linha;

        return casas[linhaIndice][colunaIndice].equals("   ");
    }

    public boolean moverPeca(String nomePeca, String casaDestino) {

        if (!casaLivre(casaDestino)) {
            return false;
        }

        int origemLinha = -1;
        int origemColuna = -1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (casas[i][j].equals(nomePeca)) {
                    origemLinha = i;
                    origemColuna = j;
                }
            }
        }

        if (origemLinha == -1) {
            return false;
        }

        char coluna = Character.toUpperCase(casaDestino.charAt(0));
        int linha = Character.getNumericValue(casaDestino.charAt(1));

        int colunaDestino = coluna - 'A';
        int linhaDestino = 8 - linha;

        casas[linhaDestino][colunaDestino] = nomePeca;
        casas[origemLinha][origemColuna] = "   ";

        return true;
    }

    public boolean acabouOJogo() {
        return false;
    }
}