package domain;

import java.util.List;

public class Reabastecimento {

   private long id;
   
   private List<Produtos> lote;

   private double valor;
   
   private GerenteVendas responsavel;

   private Distribuidora distribuidora;

   private FormaPagamento formaPagamento;

public Reabastecimento(long id, List<Produtos> lote, double valor, GerenteVendas responsavel,
        Distribuidora distribuidora, FormaPagamento formaPagamento) {
    this.id = id;
    this.lote = lote;
    this.valor = valor;
    this.responsavel = responsavel;
    this.distribuidora = distribuidora;
    this.formaPagamento = formaPagamento;
}

public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public List<Produtos> getLote() {
    return lote;
}

public void setLote(List<Produtos> lote) {
    this.lote = lote;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public GerenteVendas getResponsavel() {
    return responsavel;
}

public void setResponsavel(GerenteVendas responsavel) {
    this.responsavel = responsavel;
}

public Distribuidora getDistribuidora() {
    return distribuidora;
}

public void setDistribuidora(Distribuidora distribuidora) {
    this.distribuidora = distribuidora;
}

public FormaPagamento getFormaPagamento() {
    return formaPagamento;
}

public void setFormaPagamento(FormaPagamento formaPagamento) {
    this.formaPagamento = formaPagamento;
}

@Override
public String toString() {
    return "Reabastecimento [id=" + id + ", lote=" + lote + ", valor=" + valor + ", responsavel=" + responsavel
            + ", distribuidora=" + distribuidora + ", formaPagamento=" + formaPagamento + "]";
}
    
}
