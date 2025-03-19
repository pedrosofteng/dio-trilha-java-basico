import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("---------------\nCONTA BANCÁRIA\n---------------");
        System.out.print("Informe o número da conta(4 números): ");
        numero = scanner.nextInt();
        System.out.print("Informe a agência com dígito(xxx-x): ");
        scanner.nextLine();
        /* Não estava lendo o próximo scanner, coloquei este para
        suprir uma quebra */
        agencia = scanner.nextLine();
        System.out.print("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite o saldo: R$ ");
        saldo = scanner.nextDouble();

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência" +
                " é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
    }
}