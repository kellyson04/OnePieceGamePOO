package OnePieceGame;

import OnePieceGame.account.InputUtilities;

public class OnePieceGameController {
    OnePieceGameRepository repository = new OnePieceGameRepository();
    public void gameStarter() {
        System.out.println("Bem vindo ao nosso jogo :D !");
        int choice = 0;
        do {
            choice = InputUtilities.readIntNumbers("Deseja ser, 1 -> PIRATA, 2 - MARINHEIRO OU 3 - SAIR");

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
        }while (choice != 3);
    }

    public void criarPersonagemPirata() {
        String nomePersonagemPirata = InputUtilities.apenasNomes("Insira o nome do seu Pirata:");
        int temAkumaNoMi = InputUtilities.readIntNumbers("Seu pirata ira possuir Akuma no Mi: 1 - Sim, 2 - Não");

        switch (temAkumaNoMi) {
            case 1:
                String nomeAkumaNoMi = InputUtilities.apenasNomes("Qual nome da sua Akuma no Mi:");
                Personagem novoPirataComFruta = new Personagem(nomePersonagemPirata,Funcao.Pirata,nomeAkumaNoMi);
                repository.salvarPersonagem(novoPirataComFruta);
                break;
            case 2:
                Personagem novoPirataSemFruta = new Personagem(nomePersonagemPirata,Funcao.Pirata);
                repository.salvarPersonagem(novoPirataSemFruta);
                break;
            default:
                System.err.println("Apenas 2 Opções!.");
        }
    }

    public void criarPersonagemMarinheiro() {
        String nomePersonagemMarinheiro = InputUtilities.apenasNomes("Insira o nome do seu Marinhero");
        int temAkumaNoMi = InputUtilities.readIntNumbers("Seu Marinheiro ira possuir Akuma no Mi: 1 - Sim, 2 - Não");

        switch (temAkumaNoMi) {
            case 1:
                String nomeAkumaNoMi = InputUtilities.apenasNomes("Qual nome da sua Akuma no Mi:");
                Personagem novoMarinheiroComFruta = new Personagem(nomePersonagemMarinheiro,Funcao.Marinheiro,nomeAkumaNoMi);
                break;
            case 2:
                Personagem novoMarinheiroSemFruta = new Personagem(nomePersonagemMarinheiro,Funcao.Marinheiro);
                break;
            default:
                System.err.println("Apenas 2 Opções!.");
        }
    }
}
