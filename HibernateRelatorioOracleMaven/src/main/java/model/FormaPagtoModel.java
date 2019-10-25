package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FORMAPAGTO")
public class FormaPagtoModel implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FPG_CODIGO", nullable = true, precision = 10, scale = 0)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_FORMAPAGTO")
	private int FPG_CODIGO;

    @Column(name = "FPG_NOME", nullable = false, length = 30)
    private String FPG_NOME;


    @Column(name = "FPG_ATIVO", precision = 1)
    private int FPG_ATIVO;

    @Override
    public String toString() {
        return this.FPG_NOME;
    }

    public FormaPagtoModel() {
    }

    public FormaPagtoModel(int FPG_CODIGO, String FPG_NOME, int FPG_ATIVO) {
        this.FPG_CODIGO = FPG_CODIGO;
        this.FPG_NOME = FPG_NOME;
        this.FPG_ATIVO = FPG_ATIVO;
    }

    public int getFPG_CODIGO() {
        return this.FPG_CODIGO;
    }

    public void setFPG_CODIGO(int FPG_CODIGO) {
        this.FPG_CODIGO = FPG_CODIGO;
    }

    public String getFPG_NOME() {
        return this.FPG_NOME;
    }

    public void setFPG_NOME(String FPG_NOME) {
        this.FPG_NOME = FPG_NOME;
    }

    public int getFPG_ATIVO() {
        return this.FPG_ATIVO;
    }

    public void setFPG_ATIVO(int FPG_ATIVO) {
        this.FPG_ATIVO = FPG_ATIVO;
    }
}
