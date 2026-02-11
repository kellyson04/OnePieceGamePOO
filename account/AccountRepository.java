package OnePieceGame.account;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class AccountRepository {


    public void salvarUsuario(User user) {
        try (FileOutputStream fos = new FileOutputStream("usersOP.txt", true);
             OutputStreamWriter osw = new OutputStreamWriter(fos);
             BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("-> " + user.getUsuario() + "," + user.getSenha() + "," + user.getCpf());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Erro no disco.");
        }
    }
}
