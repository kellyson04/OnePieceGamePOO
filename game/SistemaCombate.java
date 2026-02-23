package OnePieceGame.game;

import OnePieceGame.InputUtilities;

public class SistemaCombate {

    public void iniciarCombate(Personagem personagem,InimigoNPC inimigoNPC) {
        double playerHP = 100;

        while (playerHP > 0 && inimigoNPC.getHp() > 0) {

            System.out.println(personagem.getNome() + " " + playerHP + " VS " + inimigoNPC.getNome() + " HP " + inimigoNPC.getHp());

            int acaoDoPlayer = InputUtilities.readIntNumbers("1 - Ataque Basico, 2 - Golpe Especial");

            if (acaoDoPlayer == 1) {
                inimigoNPC.setHp(inimigoNPC.getHp() - 8);
                playerHP = playerHP - 6;

                if (inimigoNPC.getHp() > 0 && playerHP > 0) {
                    System.out.println(inimigoNPC.getNome() + " Esta atacando!");
                    timer();
                    System.out.println(personagem.getNome() + " Esta atacando!");
                    timer();
                }
            }else if (acaoDoPlayer == 2) {
                inimigoNPC.setHp(inimigoNPC.getHp() - 30);
                playerHP = playerHP - 25;

                if (inimigoNPC.getHp() > 0 && playerHP > 0) {
                    System.out.println(personagem.getNome() + " Usou " + personagem.getHabilidadesEspeciais());
                    timer();
                    System.out.println(inimigoNPC.getNome() + inimigoNPC.getMensagemAtaque() + inimigoNPC.getHabilidadeEspecial());
                    timer();
                }

            }

            if (inimigoNPC.getHp() <= 0 || playerHP <= 0) {
                System.out.println(finalizarCombate(personagem,inimigoNPC,playerHP));
            }
       }
    }


    public String finalizarCombate(Personagem personagem, InimigoNPC inimigoNPC,double playerHP) {
        if (playerHP <= 0) {
            return personagem.getNome() + " Perdeu o duelo inicial, tente novamente.";
        }else if (inimigoNPC.getHp() <= 0) {
            return personagem.getNome() + " Parabéns voce acaba de derrotar o seu primeiro BOSS " + inimigoNPC.getNome() + "!";
        }
        return ":D";
    }

    public void timer() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

