package OnePieceGame.account;

import java.util.ArrayList;
import java.util.List;

public class AccountServices {

    List<User> listaUsuarios = new ArrayList<>();

    public void adicionarUsuario(User usuario) {
        listaUsuarios.add(usuario);
    }

    public int confirmarConta(String usuario, String senha) {
        for (User cadaUsuario : listaUsuarios) {
            if (usuario.equals(cadaUsuario.getUsuario())) {
                if (senha.equals(cadaUsuario.getSenha())) {
                    return 1;
                }else {
                    return 2;
                }
            }
        }
        return 3;
    }

    public boolean verificarUsuario (String usuario) {
        for (User cadaUsuario : listaUsuarios) {
            if (cadaUsuario.getUsuario().equals(usuario)) {
                return false;
            }
        }
        return true;
    }
}
