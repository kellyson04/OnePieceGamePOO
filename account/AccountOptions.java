package OnePieceGame.account;

public enum AccountOptions {
    CRIAR(1),
    LOGAR(2);

    private final int escolha;

    AccountOptions(int escolha) {
        this.escolha = escolha;
    }

    public int getEscolha() {
        return escolha;
    }
}
