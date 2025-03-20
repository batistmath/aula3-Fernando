// Violação do SRP (Single Responsability Principle)
// Essa classe tem duas responsabilidades, que são gerenciar os dados do funcionário e calcular o salário. Por isso, ela está incorreta
class FuncionarioIncorreto {
    private String nome;
    private double salarioBase;

    public FuncionarioIncorreto(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    // Esse método mistura regras de negócio com os dados do funcionário, ferindo o SRP
    public double calcularSalarioLiquido() {
        return salarioBase - (salarioBase * 0.2); // Subtrai impostos
    }
}

// Correção do SRP
// Agora temos uma classe para os dados do funcionário e outra para a regra de cálculo. Estando assim correta.
class FuncionarioCorreto {
    private String nome;
    private double salarioBase;

    public FuncionarioCorreto(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}

// Classe separada para calcular o salário líquido, seguindo os princípios de SRP.
class CalculadoraSalario {
    public double calcularSalarioLiquido(FuncionarioCorreto funcionario) {
        return funcionario.getSalarioBase() - (funcionario.getSalarioBase() * 0.2);
    }
}

public class SRP {
    public static void main(String[] args) throws Exception {
    }
}
