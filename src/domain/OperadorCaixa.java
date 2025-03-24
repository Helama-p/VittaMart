package domain;

public class OperadorCaixa extends Funcionario {

public OperadorCaixa(String nome, long cpf, double salario) {
    super(nome, cpf, salario);
}

   public double venda () {
    // Desenvolver o código necessário para realizar a venda na frente de caixa.
    return 0.00;
   }
    
@Override
public String toString() {
    return super.toString()+"OperadorCaixa []";
}

}
