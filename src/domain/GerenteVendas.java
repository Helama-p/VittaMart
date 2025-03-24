package domain;

public class GerenteVendas extends Funcionario {

    public GerenteVendas(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }

    public void reabastecer () {
        // Desenvolver o código necessário para o gerente realizar um pedido à distribudora. 
    }

    @Override
    public String toString() {
        return super.toString() + "GerenteVendas []";
    }

    
}
