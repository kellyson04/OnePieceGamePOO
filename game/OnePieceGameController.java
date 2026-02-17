package OnePieceGame.game;

import OnePieceGame.account.InputUtilities;

public class OnePieceGameController {
    OnePieceGameService service = new OnePieceGameService();
    OnePieceGameRepository repository = new OnePieceGameRepository();
    public void gameStarter() {
        System.out.println("Bem vindo ao nosso jogo :D !");
        int choice = 0;
        do {
            choice = InputUtilities.readIntNumbers("Deseja ser, 1 -> PIRATA, 2 - MARINHEIRO  3 - MENU DE OPÇÕES, 4 - SAIR");

            switch (choice) {
                case 1:
                    criarPersonagemPirata();
                    break;
                case 2:
                    criarPersonagemMarinheiro();
                    break;
                case 3:
                    menuDeOpcoes();
                    break;
                default:
                    System.out.println("Apenas tres opções disponiveis no momento.");
            }
        }while (choice != 4);
    }

    public void criarPersonagemPirata() {
        String nomePersonagemPirata = InputUtilities.apenasNomes("Insira o nome do seu Pirata:");
        int temAkumaNoMi = InputUtilities.readIntNumbers("Seu pirata ira possuir Akuma no Mi: 1 - Sim, 2 - Não");

        switch (temAkumaNoMi) {
            case 1:
                String nomeAkumaNoMi = InputUtilities.apenasNomes("Qual nome da sua Akuma no Mi:");
                Personagem novoPirataComFruta = new Personagem(nomePersonagemPirata, Funcao.Pirata,nomeAkumaNoMi);
                repository.salvarPersonagem(novoPirataComFruta);
                service.adicionarPersonagemNaLista(novoPirataComFruta);
                inicioJornada(novoPirataComFruta);
                break;
            case 2:
                Personagem novoPirataSemFruta = new Personagem(nomePersonagemPirata,Funcao.Pirata);
                repository.salvarPersonagem(novoPirataSemFruta);
                service.adicionarPersonagemNaLista(novoPirataSemFruta);
                inicioJornada(novoPirataSemFruta);
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
                service.adicionarPersonagemNaLista(novoMarinheiroComFruta);
                inicioJornada(novoMarinheiroComFruta);
                break;
            case 2:
                Personagem novoMarinheiroSemFruta = new Personagem(nomePersonagemMarinheiro,Funcao.Marinheiro);
                service.adicionarPersonagemNaLista(novoMarinheiroSemFruta);
                inicioJornada(novoMarinheiroSemFruta);
                break;
            default:
                System.err.println("Apenas 2 Opções!.");
        }
    }

    public void inicioJornada(Personagem personagem) {
        System.out.println("Nos primeiros leveis voce só tem direito a 1 ataque especial o resto sao ataques basicos.");

        String nomeHabilidadeEspecial = InputUtilities.apenasNomes("Para começar a jornada preciso que voce digite o nome do golpe especial inicial que ira utilizar");

        personagem.adicionarHabilidadeEspecial(nomeHabilidadeEspecial);
        System.out.println("Habilidade salva com sucesso!");

        int escolhaSpawnMapa = InputUtilities.readIntNumbers("Deseja começar a sua jornada por qual parte do mapa -> 1 - East Blue, 2 -> North Blue, 3 -> West Blue, 4 -> South Blue:");

        switch (escolhaSpawnMapa) {
            case 1:
                eastBlue(personagem);
                break;
            case 2:
                northBlue(personagem);
                break;
            case 3:
                westBlue(personagem);
                break;
            case 4:
                southBlue(personagem);
                break;
            default:
                System.err.println("Apenas 4 opções Disponiveis no Mapa!");
        }
    }

    public void eastBlue(Personagem personagem) {
        System.out.println("Seja bem vindo ao East Blue!");
    }

    public void northBlue(Personagem personagem) {
        System.out.println("Seja bem vindo ao North Blue!");
    }

    public void westBlue(Personagem personagem) {
        System.out.println("Seja bem vindo ao West Blue!");
    }

    public void southBlue(Personagem personagem) {
        System.out.println("Seja bem vindo ao South Blue!");
    }

    public void menuDeOpcoes() {
        int escolha = 10;
        do {
            escolha = InputUtilities.readIntNumbers("1 Mudar nome do Personagem, 2 -> Mudar função (se tornar traira),");

            switch (escolha) {
                case 1:
                    String nomeAtual = InputUtilities.apenasNomes("Digite o nome atual do seu Personagem:");
                    String novoNome = InputUtilities.apenasNomes("Digite o novo nome Desejado:");
                    if (service.mudarNome(nomeAtual,novoNome)) {
                        System.out.println("Troca efetuada com sucesso!");
                    }else {
                        System.err.println("Nome inserido não corresponde com nossa lista de nomes.");
                    }
                    break;
                case 2:


            }
        }while (escolha != 5);
    }



}
