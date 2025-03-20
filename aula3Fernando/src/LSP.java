// Violação do LSP (Liskov Substitution Principle)
// A classe Retangulo e Quadrado possuem comportamentos inconsistentes
class RetanguloIncorreto {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }
}

class QuadradoIncorreto extends RetanguloIncorreto {
    @Override
    public void setLargura(int largura) {
        this.largura = largura;
        this.altura = largura;
    }

    @Override
    public void setAltura(int altura) {
        this.largura = altura;
        this.altura = altura;
    }
}

// Correção do LSP
// Criamos uma hierarquia separada para garantir comportamentos esperados
abstract class Forma {
    abstract int getArea();
}

class RetanguloCorreto extends Forma {
    private int largura;
    private int altura;

    public RetanguloCorreto(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }
}

class QuadradoCorreto extends Forma {
    private int lado;

    public QuadradoCorreto(int lado) {
        this.lado = lado;
    }

    public int getArea() {
        return lado * lado;
    }
}

public class LSP {
    public static void main(String[] args) throws Exception {
    }
}
