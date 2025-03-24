package domain;

public class Produtos {

    private long id;

    private String nome;

    private Setor setor;

    private double valor;

    private String codigoBarra;

    public Produtos(long id, String nome, Setor setor, double valor, String codigoBarra) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.valor = valor;
        this.codigoBarra = codigoBarra;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public String toString () {
        return "Produtos [id=" + id + ", nome=" + nome + ", setor=" + setor 
                + ", valor=" + valor + ", codigo de barra=" + codigoBarra + "]";
    }
    
}
