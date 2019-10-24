package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDOR")
public class FornecedorModel implements java.io.Serializable {

    @Id
    @Column(name = "FOR_CODIGO", nullable = false, precision = 10, scale = 0)
    private int FOR_CODIGO;

    @Column(name = "FOR_CONTATO", nullable = false, length = 80)
    private String FOR_CONTATO;

    private PessoaModel PESSOA;

    public PessoaModel getPESSOA() {
        return PESSOA;
    }

    public void setPESSOA(PessoaModel PESSOA) {
        this.PESSOA = PESSOA;
    }

    @Override
    public String toString() {
        return this.FOR_CONTATO;
    }

    public FornecedorModel() {
    }

    public FornecedorModel(int FOR_CODIGO, String FOR_CONTATO, PessoaModel PESSOA) {
        this.FOR_CODIGO = FOR_CODIGO;
        this.FOR_CONTATO = FOR_CONTATO;
        this.PESSOA = PESSOA;
    }

    public int getFOR_CODIGO() {
        return this.FOR_CODIGO;
    }

    public void setFOR_CODIGO(int FOR_CODIGO) {
        this.FOR_CODIGO = FOR_CODIGO;
    }

    public String getFOR_CONTATO() {
        return this.FOR_CONTATO;
    }

    public void setFOR_CONTATO(String FOR_CONTATO) {
        this.FOR_CONTATO = FOR_CONTATO;
    }

}
