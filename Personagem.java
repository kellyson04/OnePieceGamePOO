package OnePieceGame;

public class Personagem {
    private String nome;
    private Funcao funcao;

    public Personagem(String nome, Funcao funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


}
