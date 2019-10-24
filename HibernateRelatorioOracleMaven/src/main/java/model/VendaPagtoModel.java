package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA_PAGTO")
public class VendaPagtoModel implements java.io.Serializable {

    @Id
    @Column(name = "VDP_CODIGO", nullable = false, precision = 10, scale = 0)
    private int VDP_CODIGO;

    public VendaModel getVENDA() {
        return VENDA;
    }

    public void setVENDA(VendaModel VENDA) {
        this.VENDA = VENDA;
    }

    public FormaPagtoModel getFORMAPAGTO() {
        return FORMAPAGTO;
    }

    public void setFORMAPAGTO(FormaPagtoModel FORMAPAGTO) {
        this.FORMAPAGTO = FORMAPAGTO;
    }

    public double getVDP_VALOR() {
        return VDP_VALOR;
    }

    public void setVDP_VALOR(double VDP_VALOR) {
        this.VDP_VALOR = VDP_VALOR;
    }
    
    private VendaModel VENDA;
    private FormaPagtoModel FORMAPAGTO;
    
    @Column(name = "VDP_VALOR", nullable = false, precision = 18, scale = 2)
    private double VDP_VALOR;


    @Override
    public String toString() {
        return "";
    }

    public VendaPagtoModel() {
    }

    public VendaPagtoModel(int VDP_CODIGO, VendaModel VENDA, FormaPagtoModel FORMAPAGTO, double VDP_VALOR) {
        this.VDP_CODIGO = VDP_CODIGO;
        this.VENDA = VENDA;
        this.FORMAPAGTO = FORMAPAGTO;
        this.VDP_VALOR = VDP_VALOR;
    }

    public int getVDP_CODIGO() {
        return this.VDP_CODIGO;
    }

    public void setVDP_CODIGO(int VDP_CODIGO) {
        this.VDP_CODIGO = VDP_CODIGO;
    }

}
