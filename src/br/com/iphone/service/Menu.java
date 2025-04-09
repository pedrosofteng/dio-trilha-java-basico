package br.com.iphone.service;

import java.util.Scanner;

public class Menu {

    public void executar() {
        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual número deseja ligar? (xx) x xxxx-xxxx");
        aparelho.ligar(scanner.nextLine());
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        System.out.println("Qual página da web deseja acessar? URL");
        aparelho.exibirPagina(scanner.nextLine());
        aparelho.adicionarNovaAba();
        aparelho.atualizarPagina();

        System.out.println("\nEntrando no Reprodutor Musical\n");
        System.out.print("Selecione uma música: ");
        reprodutor.selecionarMusica(scanner.nextLine());
        reprodutor.pausar();
        reprodutor.tocar();
    }
}
