package domain;

import java.util.List;

public class VendaCaixa {

    private long id;

    private List<Produtos> produtosList;

    private double valor;

    private String cpfCliente;

    private FormaPagamento formaPagamento;

    public VendaCaixa(long id, List<Produtos> produtosList, double valor, String cpfCliente,
            FormaPagamento formaPagamento) {
        this.id = id;
        this.produtosList = produtosList;
        this.valor = valor;
        this.cpfCliente = cpfCliente;
        this.formaPagamento = formaPagamento;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    @Override
    public String toString() {
        return "VendaCaixa [id=" + id + ", produtosList=" + produtosList + ", valor=" + valor + ", cpfCliente="
                + cpfCliente + ", formaPagamento=" + formaPagamento + "]";
    }

    
    
}
