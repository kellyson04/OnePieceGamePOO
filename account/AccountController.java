package OnePieceGame.account;

import OnePieceGame.OnePieceGameController;

import java.util.Scanner;

public class AccountController {
    AccountRepository userRepository = new AccountRepository();
    AccountServices accountServices = new AccountServices();
    OnePieceGameController gameController = new OnePieceGameController();
    Scanner scanner = new Scanner(System.in);


    public void accountOptions () {
        do {
            int escolhaMenu = InputUtilities.readIntNumbers("Digite 1 para criar conta ou 2 para Logar:");

            switch (escolhaMenu) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountLogin();
                    break;
                default:
                    System.out.println("Apenas duas opções disponiveis");
            }
        }while (true);
    }

    public void createAccount() {
        System.out.println("Digite o usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();
        String cpf = InputUtilities.readCPF("Digite seu cpf:");

        User user = new User(usuario,senha,cpf);
        userRepository.salvarUsuario(user);
        accountServices.adicionarUsuario(user);

        System.out.println("Conta criada com sucesso!");
    }

    public void accountLogin() {
        System.out.println("Digite seu usuario:");
        String usuario = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        if (accountServices.confirmarConta(usuario,senha) == 1) {
            System.out.println("Usuario confirmado, Logando . . .");
            gameController.gameStarter();
        }else if (accountServices.confirmarConta(usuario,senha) == 2) {
            System.err.println("SENHA DIVERGE DO USUARIO.");
        }else {
            System.err.println("Usuario não encontrado.");
        }
    }
}
