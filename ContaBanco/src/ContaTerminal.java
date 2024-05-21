import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agenciaBanco = scanner.next();

        System.out.println("Digite sua conta do banco, sem o digito");
        Integer conta = scanner.nextInt();

        System.out.println("Informe seu nome completo sem abreviações");
        String nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println("Informe seu saldo");
        Double saldoBancario = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agenciaBanco + ", conta " + conta + " e seu saldo " + saldoBancario + " já está disponível para saque");

    }

}
