package br.com.iphone.service;

public class AparelhoTelefonico implements NavegadorInternet {
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz...");
    }
}
