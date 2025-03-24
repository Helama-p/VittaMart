package domain;

import java.util.List;

public class Distribuidora {

    private long id;

    private String nome;

    private String cnpj;

    private String endereco;

    private String contato;

    private List<Produtos> produtosList;

    
    public Distribuidora(long id, String nome, String cnpj, String endereco, String contato,
            List<Produtos> produtosList) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.produtosList = produtosList;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    @Override
    public String toString() {
        return "Distribuidora [id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + endereco + ", contato="
                + contato + ", produtosList=" + produtosList + "]";
    }
    
    
    
}
