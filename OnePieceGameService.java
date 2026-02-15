package OnePieceGame;

import java.util.ArrayList;
import java.util.List;

public class OnePieceGameService {
    List <Personagem> listaPersonagens = new ArrayList<>();
    List<String> ListaHabilidadesEspeciais = new ArrayList<>();

    public void escolherAtaque(Ataque ataque,String nomeDaHabilidadeEspecial) {
        ataque.atacar();
        ataque.habilidadeEspecial(nomeDaHabilidadeEspecial);
    }

    public void adicionarPersonagemNaLista(Personagem personagem) {
        listaPersonagens.add(personagem);
    }

    public boolean mudarNome(String nomeAtual,String novoNome) {
        for (Personagem cadaPersonagem : listaPersonagens) {
            if (cadaPersonagem.getNome().equals(nomeAtual)) {
                cadaPersonagem.setNome(novoNome);
                return true;
            }
        }
        return false;
    }


}
