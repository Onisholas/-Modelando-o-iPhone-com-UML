package main;


public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o reprodutor musical
        meuIphone.selecionarMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o navegador
        meuIphone.exibirPagina("https://open.spotify.com/intl-pt/track/3MkdA6vwF0ifRl86yzTlJW");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}