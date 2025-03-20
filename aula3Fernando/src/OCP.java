// Violação do OCP (Open/Closed Principle)
// Sempre que um novo tipo de desconto for adicionado, essa classe precisará ser modificada
class DescontoIncorreto {
    public double calcularPrecoComDesconto(String tipoProduto, double preco) {
        if (tipoProduto.equals("eletronico")) {
            return preco * 0.9; // 10% de desconto
        } else if (tipoProduto.equals("roupa")) {
            return preco * 0.8; // 20% de desconto
        }
        return preco;
    }
}

// Correção do OCP
// Criamos uma interface que permite extensão sem modificar a classe original
interface Desconto {
    double aplicarDesconto(double preco);
}

class DescontoEletronico implements Desconto {
    public double aplicarDesconto(double preco) {
        return preco * 0.9;
    }
}

class DescontoRoupa implements Desconto {
    public double aplicarDesconto(double preco) {
        return preco * 0.8;
    }
}

public class OCP {
    public static void main(String[] args) throws Exception {
    }
}
