package domain;

public class GerenteEstoque extends Funcionario {

    public GerenteEstoque(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return super.toString() + "GerenteEstoque []";
    }
    
    
}
