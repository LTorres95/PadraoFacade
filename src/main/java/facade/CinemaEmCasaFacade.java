package facade;

/** Oferece uma interface simples para coordenar os aparelhos do cinema em casa. */
public class CinemaEmCasaFacade {
    private final Projetor projetor;
    private final SistemaDeSom som;
    private final Reprodutor reprodutor;

    public CinemaEmCasaFacade(Projetor projetor, SistemaDeSom som, Reprodutor reprodutor) {
        this.projetor = projetor;
        this.som = som;
        this.reprodutor = reprodutor;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando a sessão de cinema...");
        projetor.ligar();
        som.ligar();
        som.ajustarVolume(20);
        reprodutor.reproduzir(filme);
    }

    public void encerrarSessao() {
        System.out.println("Encerrando a sessão de cinema...");
        reprodutor.parar();
        som.desligar();
        projetor.desligar();
    }
}
