package OnePieceGame.game;

public class InimigoNPC implements Ataque {
    private String nome;
    private int hp;
    private String mensagemAtaque;
    private String habilidadeEspecial;

    public InimigoNPC(String nome,int hp,String mensagemAtaque,String habilidadeEspecial) {
        this.nome = nome;
        this.hp = hp;
        this.mensagemAtaque = mensagemAtaque;
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public String getNome() {
        return this.nome;
    }

    public int getHp() {
        return this.hp;
    }

    public String getMensagemAtaque() {
        return this.mensagemAtaque;
    }

    public String getHabilidadeEspecial() {
        return this.habilidadeEspecial;
    }

    public void setHp(int novoHp) {
        this.hp = novoHp;
    }

    @Override
    public void atacar() {
        System.out.println(this.nome + "Atacou voce");
    }

    @Override
    public void habilidadeEspecial(String nomeDaHabilidade) {
        System.out.println(this.nome + " Acaba de usar o golpe especial " + this.habilidadeEspecial);
    }
}
