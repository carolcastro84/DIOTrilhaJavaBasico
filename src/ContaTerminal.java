import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta !");
        String conta = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo da conta !");
        float saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}