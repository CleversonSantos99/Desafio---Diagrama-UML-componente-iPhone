package main;

import dispositivos.IPhone;

public class Main {
    public static void main(String[] args) {

        //instanciando meu iPhone
        IPhone iPhone = new IPhone();

        //funcções de reprodutor musical
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        //funções de aparelho telefônico
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        //funções de navegador de internet
        iPhone.adicionarPagina();
        iPhone.exibirPagina();
        iPhone.atualizarPagina();
    }
}
