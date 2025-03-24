package domain;

public class GerenteEstoque extends Funcionario {

    public GerenteEstoque(String nome, long cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return super.toString() + "GerenteEstoque []";
    }
    
    public void adicionarEstoque (Produtos prod) {
        // Desenvolver o código para adicionar produtos ao estoque.
    }

    public void retirarEstoque (Produtos prod) {
        // Desenvolver o código para editar os produtos adicionados ao estoque.
    }
}
