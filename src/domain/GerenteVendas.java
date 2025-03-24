package domain;

public class GerenteVendas extends Funcionario {

    public GerenteVendas(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return super.toString() + "GerenteVendas []";
    }
    
    
}
