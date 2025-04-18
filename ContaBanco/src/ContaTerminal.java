import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Bancaria</h1>
 * Criação de conta bancaria e exibição dos dados pelo terminal
 * <p>
 * <b>Note:<b/> Leia atentamente a documentação desta classe para
 * desfrutar dos recursos oferecidos pelo autor
 * @author Jeferson Rodrigues
 * @version 1.0
 * @since 12/04/2025
 */

public class ContaTerminal{

    /**
     * Este método é usado para captar os dados do usuário e exibir na tela
     * @param args
     */
    public static void main(String[] args) {
        
        /*  ----- Etapas do desafio -----
            01 - Conhecer e importar a classe Scanner
            02 - Exibir as mensagens para o nosso usuário
            03 - obter pela scanner os valores digitados no terminal
            04 - Exibir a mensagem criada.
        */

        //Criando objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite a sua agencia:");
        String agencia = scanner.next();

        System.out.println("Agora, digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o seu nome completo:");
        String nomeCompleto = scanner.next();

        System.out.println("Informe o seu saldo bancario:");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados
        System.out.println("Olá " + nomeCompleto +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta +" e seu saldo " + saldo +" já está disponível para saque");

    }
}