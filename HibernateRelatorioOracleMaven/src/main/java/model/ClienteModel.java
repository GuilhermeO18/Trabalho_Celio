package model;

import java.io.Serializable;
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
@Table(name = "CLIENTE")
public class ClienteModel implements Serializable {

    @Id
    @Column(name = "CLI_CODIGO", nullable = true, precision = 10, scale = 0)
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    //@SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_CLIENTE")
    private int CLI_CODIGO;

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "PES_CODIGO", unique = true, nullable = true)
    private PessoaModel pessoa;

    @Column(name = "CLI_LIMITECRED", nullable = true, precision = 18, scale = 2)
    private Double CLI_LIMITECRED;

    public ClienteModel() {
        
    }

    public ClienteModel(int cLI_CODIGO, Double cLI_LIMITECRED) {
        
        CLI_CODIGO = cLI_CODIGO;
        CLI_LIMITECRED = cLI_LIMITECRED;
    }

    public int getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    public void setCLI_CODIGO(int cLI_CODIGO) {
        CLI_CODIGO = cLI_CODIGO;
    }

    public PessoaModel getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaModel pessoa) {
        this.pessoa = pessoa;
    }

    public Double getCLI_LIMITECRED() {
        return CLI_LIMITECRED;
    }

    public void setCLI_LIMITECRED(Double cLI_LIMITECRED) {
        CLI_LIMITECRED = cLI_LIMITECRED;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return pessoa.getPES_NOME();
    }
}
