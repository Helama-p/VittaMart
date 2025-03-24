package domain;

public class OperadorCaixa extends Funcionario {

public OperadorCaixa(String nome, long cpf, double salario) {
    super(nome, cpf, salario);
}

@Override
public String toString() {
    return super.toString()+"OperadorCaixa []";
}

   
    
}
