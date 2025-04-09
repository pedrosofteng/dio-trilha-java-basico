package br.com.iphone.service;

public interface NavegadorInternet {
    default void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    default void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    default void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
