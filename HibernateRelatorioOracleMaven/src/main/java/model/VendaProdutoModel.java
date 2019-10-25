package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA_PRODUTO")
public class VendaProdutoModel implements java.io.Serializable {

    @Id
    @Column(name = "VEP_CODIGO", nullable = true, precision = 10, scale = 0)
    private int VEP_CODIGO;

    public VendaModel getVENDA() {
        return VENDA;
    }

    public void setVENDA(VendaModel VENDA) {
        this.VENDA = VENDA;
    }

    public ProdutoModel getPRODUTO() {
        return PRODUTO;
    }

    public void setPRODUTO(ProdutoModel PRODUTO) {
        this.PRODUTO = PRODUTO;
    }

    public double getVEP_QTDE() {
        return VEP_QTDE;
    }

    public void setVEP_QTDE(double VEP_QTDE) {
        this.VEP_QTDE = VEP_QTDE;
    }

    public double getVEP_PRECO() {
        return VEP_PRECO;
    }

    public void setVEP_PRECO(double VEP_PRECO) {
        this.VEP_PRECO = VEP_PRECO;
    }

    public double getVEP_DESCONTO() {
        return VEP_DESCONTO;
    }

    public void setVEP_DESCONTO(double VEP_DESCONTO) {
        this.VEP_DESCONTO = VEP_DESCONTO;
    }

    public double getVEP_TOTAL() {
        return VEP_TOTAL;
    }

    public void setVEP_TOTAL(double VEP_TOTAL) {
        this.VEP_TOTAL = VEP_TOTAL;
    }
    
    private VendaModel VENDA;
    private ProdutoModel PRODUTO;

    @Column(name = "VEP_QTDE", nullable = true, precision = 18, scale = 4)
    private double VEP_QTDE;

    @Column(name = "VEP_PRECO", nullable = true, precision = 18, scale = 2)
    private double VEP_PRECO;

    @Column(name = "VEP_DESCONTO", nullable = true, precision = 18, scale = 2)
    private double VEP_DESCONTO;

    @Column(name = "VEP_TOTAL", nullable = true, precision = 18, scale = 2)
    private double VEP_TOTAL;

    @Override
    public String toString() {
        return "";
    }

    public VendaProdutoModel() {
    }

    public VendaProdutoModel(int VEP_CODIGO,VendaModel VENDA, ProdutoModel PRODUTO,double VEP_QTDE, double VEP_PRECO, double VEP_DESCONTO, double VEP_TOTAL) {
        this.VEP_CODIGO = VEP_CODIGO;
        this.VENDA = VENDA;
        this.PRODUTO = PRODUTO;
        this.VEP_QTDE = VEP_QTDE;
        this.VEP_PRECO = VEP_PRECO;
        this.VEP_DESCONTO = VEP_DESCONTO;
        this.VEP_TOTAL = VEP_TOTAL;
    }

    public int getVEP_CODIGO() {
        return this.VEP_CODIGO;
    }

    public void setVEP_CODIGO(int VEP_CODIGO) {
        this.VEP_CODIGO = VEP_CODIGO;
    }
}
