package OnePieceGame.account;

public class User {
    private String usuario;
    private String senha;
    private String cpf;

    public User(String usuario, String senha, String cpf) {
        this.usuario = usuario;
        this.senha = senha;
        this.cpf = cpf;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getCpf() {
        return cpf;
    }
}
