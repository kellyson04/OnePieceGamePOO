package OnePieceGame.game;

import OnePieceGame.InputUtilities;


public class OnePieceGameController {
    OnePieceGameService service = new OnePieceGameService();
    OnePieceGameRepository repository = new OnePieceGameRepository();
    public void gameStarter() {
        System.out.println("Bem vindo ao nosso jogo :D !");
        boolean continuar = true;
        do {
            int escolha = InputUtilities.readIntNumbers("Deseja ser, 1 -> PIRATA, 2 - MARINHEIRO  3 - MENU DE OPÇÕES, 4 - SAIR");

            switch (escolha) {
                case 1:
                    criarPersonagemPirata();
                    break;
                case 2:
                    criarPersonagemMarinheiro();
                    break;
                case 3:
                    menuDeOpcoes();
                    break;
                case 4:
                    continuar = false;
                default:
                    System.out.println("Apenas tres opções disponiveis no momento.");
            }
        }while (continuar);
    }

    private void criarPersonagemPirata() {
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

    private void criarPersonagemMarinheiro() {
        String nomePersonagemMarinheiro = InputUtilities.apenasNomes("Insira o nome do seu Marinheiro");
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

    private void inicioJornada(Personagem personagem) {
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

    private void eastBlue(Personagem personagem) {
        DialogosNPCS.dialogoAlvida(personagem);

        InimigoNPC alvida = new InimigoNPC("Alvida",80," Esta preparando seu enorme machado ","Machado espinhoso");

        SistemaCombate combate = new SistemaCombate();

        combate.iniciarCombate(personagem,alvida);
    }

    private void northBlue(Personagem personagem) {
        DialogosNPCS.dialogoBellamy(personagem);

        InimigoNPC bellamy = new InimigoNPC("Bellamy",90," Esta saltando de um lado para o outro ","Spring Hopper");

        SistemaCombate combate = new SistemaCombate();

        combate.iniciarCombate(personagem,bellamy);
    }

    private void westBlue(Personagem personagem) {
        DialogosNPCS.dialogoCaponeBege(personagem);

        InimigoNPC caponeBege = new InimigoNPC("Capone Bege",95," Virou uma enorme fortaleza ","Big Father");

        SistemaCombate combate = new SistemaCombate();

        combate.iniciarCombate(personagem,caponeBege);
    }

    private void southBlue(Personagem personagem) {
       DialogosNPCS.dialogoEustassKid(personagem);

       InimigoNPC eustassKid = new InimigoNPC("Eustass KID",99," Esta preparando seu canhão para te exterminar ","Damned PUUUNNKKKKKKKK");

       SistemaCombate combate = new SistemaCombate();

       combate.iniciarCombate(personagem,eustassKid);
    }

    private void menuDeOpcoes() {
        boolean continuar = true;
        do {
            int escolha = InputUtilities.readIntNumbers("1 Mudar nome do Personagem, 2 -> Mudar função (se tornar traira),");

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
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.err.println("Opção não existente.");

            }
        }while (continuar);
    }
}
