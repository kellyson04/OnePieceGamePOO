package OnePieceGame.game;

public class DialogosNPCS {

    public static String dialogoAlvida(Personagem p) {
        return "--- ⚓ EAST BLUE: NAVIO DA ALVIDA ---\n" +
                "Primeiro combate: ALVIDA, A DONA DA CLAVA!\n" +
                "Uma sombra gigante surge à frente do seu barco e uma clava enorme bate na água!\n" +
                "Alvida: 'HA HA HA! Mas o que temos aqui? Um fracote chamado " + p.getNome() + " tentando ser " + p.getFuncao() + "?'\n" +
                "Alvida: 'Eu sou Alvida, a mulher mais bela de todos os oceanos! Quem não se curvar diante de mim conhecerá o peso da minha justiça!'\n" +
                "Alvida: 'Me derrote agora ou vire meu escravo de convés para sempre!'";
    }

    public static String dialogoBellamy(Personagem p) {
        return "--- ❄️ NORTH BLUE ---\n" +
                "Primeiro combate: BELLAMY A HIENA!\n" +
                "Um homem loiro com uma cicatriz no olho cospe no chão ao te ver passar.\n" +
                "Bellamy: 'Ei, " + p.getNome() + "! Ouvi dizer que você anda falando de sonhos por aí...'\n" +
                "Bellamy: 'Essa era de sonhadores já acabou, seu lixo! Aqui no North Blue, quem não tem força não tem lugar na nova era.'";
    }

    public static String dialogoCaponeBege(Personagem p) {
        return "--- 🥃 WEST BLUE ---\n" +
                "Primeiro combate: CAPONE BEGE!\n" +
                "Capone Bege: 'Nada pessoal, garoto(a), mas você entrou no meu território sem pagar o dízimo.'\n" +
                "Capone Bege: 'Escute bem, " + p.getNome() + ", no West Blue as coisas funcionam com ordem e respeito ao Chefe.'\n" +
                "Capone Bege: 'Seus modos são terríveis. Meus subordinados vão te ensinar a se comportar... ou vão te enterrar agora mesmo.'";
    }

    public static String dialogoEustassKid(Personagem p) {
        return "--- ⚓ SOUTH BLUE ---\n" +
                "Primeiro combate: EUSTASS KID!\n" +
                "Eustass Kid: 'HA! Mais um verme tentando brincar de " + p.getFuncao() + "?'\n" +
                "Eustass Kid: '" + p.getNome() + "... esse nome não significa nada! No South Blue, só os fortes escrevem a própria história com sangue.'\n" +
                "Eustass Kid: 'Eu vou esmagar o seu navio e fazer um trono com os destroços. PREPARE-SE PARA MORRER!'";
    }
}
