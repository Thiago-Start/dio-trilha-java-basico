public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarDeCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void avançarCanal() {
        canal ++;
    }

    public void retrocederCanal() {
        canal --;
    }

    public void aumentarVolume() {
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
