package domain;

import java.util.List;

public class RedeMercado {

    private long id;

    private String rede;

    private String cnpj;

    private String endereco;

    private List<Funcionario> funcionarios;

    public RedeMercado(long id, String rede, String cnpj, String endereco, List<Funcionario> funcionarios) {
        this.id = id;
        this.rede = rede;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.funcionarios = funcionarios;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return "RedeMercado [id=" + id + ", rede=" + rede + ", cnpj=" + cnpj + ", endereco=" + endereco
                + ", funcionarios=" + funcionarios + "]";
    }
    
    
}
