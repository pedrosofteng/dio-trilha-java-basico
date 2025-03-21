package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("\nDigite o primeiro número: ");
            int parametroUm = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();

            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve " +
                        "ser maior que o primeiro.");
            }

            for (; parametroUm < parametroDois + 1; parametroUm++) {
                System.out.println("Imprimindo o número: " + parametroUm);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}
