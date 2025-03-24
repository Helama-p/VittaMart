package domain;

import java.util.List;

public class Estoque {

    private long id;

    private List<Produtos> produtosList;

    private long lote;

    private int quantidade;

    public Estoque (long id, List<Produtos> produtosList, long lote, int quantidade) {
        this.id = id;
        this.produtosList = produtosList;
        this.lote = lote;
        this.quantidade = quantidade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Produtos> getProdutosList() {
        return produtosList;
    }

    public void setProdutosList(List<Produtos> produtosList) {
        this.produtosList = produtosList;
    }

    public long getLote() {
        return lote;
    }

    public void setLote(long lote) {
        this.lote = lote;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Estoque [id=" + id + ", produtosList=" + produtosList + ", lote=" + lote + ", quantidade=" 
                + quantidade + "]";
    }
    
    
}
