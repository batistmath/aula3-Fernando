class MotoristaIncorreto {
    private Carro carro;

    public MotoristaIncorreto() {
        this.carro = new Carro(); // Dependência concreta
    }

    public void dirigir() {
        carro.ligar();
    }
}

class Carro {
    public void ligar() {
        System.out.println("Carro ligado");
    }
}

// Correção do DIP
// Agora dependemos de uma abstração (interface) em vez de uma implementação concreta
interface Veiculo {
    void ligar();
}

class CarroCorreto implements Veiculo {
    public void ligar() {
        System.out.println("Carro ligado");
    }
}

class Moto implements Veiculo {
    public void ligar() {
        System.out.println("Moto ligada");
    }
}

class MotoristaCorreto {
    private Veiculo veiculo;

    public MotoristaCorreto(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void dirigir() {
        veiculo.ligar();
    }
}


public class DIP {
    public static void main(String[] args) throws Exception {
    }
}
