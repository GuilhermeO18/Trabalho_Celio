package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class ClienteModel implements java.io.Serializable {

    @Id
    @Column(name = "CLI_CODIGO", nullable = false, precision = 10, scale = 0)
    private int CLI_CODIGO;

    public PessoaModel getPESSOA() {
        return PESSOA;
    }

    public void setPESSOA(PessoaModel PESSOA) {
        this.PESSOA = PESSOA;
    }

    public double getCLI_LIMITECRED() {
        return CLI_LIMITECRED;
    }

    public void setCLI_LIMITECRED(double CLI_LIMITECRED) {
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }
    
    private PessoaModel PESSOA;

    @Column(name = "CLI_CODIGO", nullable = false, precision = 18, scale = 2)
    private double CLI_LIMITECRED;
    
    @Override
    public String toString() {
        return "";
    }

    public ClienteModel() {
    }

    public ClienteModel(int CLI_CODIGO, PessoaModel PESSOA, double CLI_LIMITECRED) {
        this.CLI_CODIGO = CLI_CODIGO;
        this.PESSOA = PESSOA;
        this.CLI_LIMITECRED = CLI_LIMITECRED;
    }

    public int getCLI_CODIGO() {
        return this.CLI_CODIGO;
    }

    public void setCLI_CODIGO(int CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }

}
