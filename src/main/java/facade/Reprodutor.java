package facade;

public class Reprodutor {
    public void reproduzir(String filme) {
        System.out.println("Reproduzindo: " + filme + ".");
    }

    public void parar() {
        System.out.println("Reprodução encerrada.");
    }
}
