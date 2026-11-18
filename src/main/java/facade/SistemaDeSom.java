package facade;

public class SistemaDeSom {
    public void ligar() {
        System.out.println("Sistema de som ligado.");
    }

    public void ajustarVolume(int volume) {
        System.out.println("Volume ajustado para " + volume + ".");
    }

    public void desligar() {
        System.out.println("Sistema de som desligado.");
    }
}
