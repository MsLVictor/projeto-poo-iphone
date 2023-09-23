package iphone;

import java.util.Scanner;

import funcionalidades.Celular;


public class Iphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();
    }

    private void pausar() {
        System.out.println("Pausando...");
    }
    
    private void tocar() {
        System.out.println("tocando música");
    }
    
    private void selecionarMusica() {
        System.out.println("Selecionando música");
    }
    
    private void atualizarPagina() {
        System.out.println("atualizando");
    }
    
    private void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador.");
    }
    
    private void exibirPagina() {
        System.out.println("Exibindo página.");
    }
    
    private void iniciarCorreioVoz() {
        System.out.println("Abrindo Correio de voz");
    }

    private void atender() {
        System.out.println("Atendendo chamada.");
    }
    
    private void ligar() {
        System.out.println("Iniciando chamada.");
    }
}
