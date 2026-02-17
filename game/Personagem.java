package OnePieceGame.game;

import java.util.ArrayList;
import java.util.List;

public class Personagem implements Ataque {
    private String nome;
    private Funcao funcao;
    private String nomeFruta;
    private List<String> habilidadesEspeciais = new ArrayList<>();

    public Personagem(String nome, Funcao funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public Personagem(String nome,Funcao funcao,String nomeFruta) {
        this.nome = nome;
        this.funcao = funcao;
        this.nomeFruta = nomeFruta;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public Funcao getFuncao() {
        return this.funcao;
    }

    public void setFuncao(Funcao novaFuncao) {
        this.funcao = novaFuncao;
    }

    public List<String> getHabilidadesEspeciais() {
        return this.habilidadesEspeciais;
    }

    public void adicionarHabilidadeEspecial(String nomeHabilidade) {
        this.habilidadesEspeciais.add(nomeHabilidade);
    }

    @Override
    public void atacar() {
        if (this.funcao == Funcao.Pirata) {
            System.out.println(this.nome + " O Pirata esta atacando!");
        }else if (this.funcao == Funcao.Marinheiro) {
            System.out.println(this.nome + " O Marinheiro esta atacando!");
        }
    }

    @Override
    public void habilidadeEspecial(String habilidadeEspecial) {
        if (habilidadeEspecial.length() <= 1) {
            System.err.println("NOME INVALIDO,SEM CARACTERES ENCONTRADOS. ");
        }
        System.out.println(this.nome + " Usou " + habilidadeEspecial);
    }

}
