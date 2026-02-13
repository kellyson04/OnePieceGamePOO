package OnePieceGame;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OnePieceGameRepository {
    public void salvarPersonagem(Personagem personagem) {
        try(FileOutputStream fos = new FileOutputStream("personagens.txt", true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("-> " + personagem.getNome() + ", " + personagem.getFuncao());
            bw.newLine();
        }catch (IOException e) {
            System.err.println("ERRO NO DISCO AO SALVAR PERSONAGEM.");
        }
    }
}
