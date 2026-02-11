package OnePieceGame;

import OnePieceGame.account.InputUtilities;

public class OnePieceGameController {
    public void gameStarter() {
        System.out.println("Bem vindo ao nosso jogo :D !");

        do {
            int choice = InputUtilities.readIntNumbers("Deseja ser, 1 -> PIRATA OU 2 - MARINHEIRO:");

            switch (choice) {
                case 1:
                    criarPersonagemPirata();
                    break;
                case 2:
                    criarPersonagemMarinheiro();
                    break;
                default:
                    System.out.println("Apenas duas opções disponiveis no momento.");
            }
        }while (true);
    }

    public void criarPersonagemPirata() {

    }

    public void criarPersonagemMarinheiro() {

    }
}
