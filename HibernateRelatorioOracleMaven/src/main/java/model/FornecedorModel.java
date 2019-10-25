package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FORNECEDOR")
public class FornecedorModel {

    @Id
    @Column(name = "FOR_CODIGO", nullable = true, precision = 10, scale = 0)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_FORNECEDOR")
    private int FOR_CODIGO;
    private String FOR_CONTATO;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "PES_CODIGO", unique = true, nullable = false)
    private PessoaModel pessoa;

    public FornecedorModel() {
        super();
    }

    public FornecedorModel(int fOR_CODIGO, String fOR_CONTATO) {
        super();
        FOR_CODIGO = fOR_CODIGO;
        FOR_CONTATO = fOR_CONTATO;
    }

    public int getFOR_CODIGO() {
        return FOR_CODIGO;
    }

    public void setFOR_CODIGO(int fOR_CODIGO) {
        FOR_CODIGO = fOR_CODIGO;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return pessoa.getPES_NOME();
    }
}
