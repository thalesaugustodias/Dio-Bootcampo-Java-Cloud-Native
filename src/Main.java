import model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("iPhone X", "iOS 14");

        iphone.selecionarMusica("Shape of You");
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.pararMusica();

        iphone.fazerChamada("81993289243");
        iphone.receberChamada("81999998399");
        iphone.encerrarChamada();

        iphone.abrirPagina("https://www.github.com/thalesaugustodias");
        iphone.atualizarPagina();
        iphone.fecharPagina();
    }
}