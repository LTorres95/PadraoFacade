package facade;

public class ExemploFacade {
    public static void main(String[] args) {
        CinemaEmCasaFacade cinema = new CinemaEmCasaFacade(
                new Projetor(), new SistemaDeSom(), new Reprodutor());

        cinema.assistirFilme("De Volta para o Futuro");
        System.out.println();
        cinema.encerrarSessao();
    }
}
