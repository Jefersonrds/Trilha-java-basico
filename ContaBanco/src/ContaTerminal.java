import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) {
        
        //Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem criada.

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