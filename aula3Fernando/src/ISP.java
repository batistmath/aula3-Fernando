// Violação do ISP (Interface Segregation Principle)
// Interface grande obriga classes a implementarem métodos desnecessários
interface TrabalhadorIncorreto {
    void trabalhar();
    void comer();
}

class Robo implements TrabalhadorIncorreto {
    public void trabalhar() {
        System.out.println("Robô trabalhando");
    }
    
    // Esse método não faz sentido para um robô
    public void comer() {
        throw new UnsupportedOperationException("Robôs não comem");
    }
}

// Correção do ISP
// Interfaces separadas para evitar métodos desnecessários
interface Trabalhador {
    void trabalhar();
}

interface SerVivo {
    void comer();
}

class Humano implements Trabalhador, SerVivo {
    public void trabalhar() {
        System.out.println("Humano trabalhando");
    }
    
    public void comer() {
        System.out.println("Humano comendo");
    }
}

class RoboCorreto implements Trabalhador {
    public void trabalhar() {
        System.out.println("Robô trabalhando");
    }
}

public class ISP {
    public static void main(String[] args) throws Exception {
    }
}
