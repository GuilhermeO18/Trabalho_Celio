package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRA_PRODUTO")
public class CompraProdutoModel implements java.io.Serializable {

    @Id
    @Column(name = "CPP_CODIGO", nullable = true, precision = 10, scale = 0)
    private int CPP_CODIGO;

    public CompraModel getCOMPRA() {
        return COMPRA;
    }

    public void setCOMPRA(CompraModel COMPRA) {
        this.COMPRA = COMPRA;
    }

    public ProdutoModel getPRODUTO() {
        return PRODUTO;
    }

    public void setPRODUTO(ProdutoModel PRODUTO) {
        this.PRODUTO = PRODUTO;
    }

    public double getCPR_QTDE() {
        return CPR_QTDE;
    }

    public void setCPR_QTDE(double CPR_QTDE) {
        this.CPR_QTDE = CPR_QTDE;
    }

    public double getCPR_PRECO() {
        return CPR_PRECO;
    }

    public void setCPR_PRECO(double CPR_PRECO) {
        this.CPR_PRECO = CPR_PRECO;
    }

    public double getCPR_DESCONTO() {
        return CPR_DESCONTO;
    }

    public void setCPR_DESCONTO(double CPR_DESCONTO) {
        this.CPR_DESCONTO = CPR_DESCONTO;
    }

    public double getCPR_TOTAL() {
        return CPR_TOTAL;
    }

    public void setCPR_TOTAL(double CPR_TOTAL) {
        this.CPR_TOTAL = CPR_TOTAL;
    }
    
    private CompraModel COMPRA;
    private ProdutoModel PRODUTO;

    @Column(name = "CPR_QTDE", nullable = false, precision = 18, scale = 4)
    private double CPR_QTDE;

    @Column(name = "CPR_PRECO", nullable = false, precision = 18, scale = 2)
    private double CPR_PRECO;

    @Column(name = "CPR_DESCONTO", nullable = true, precision = 18, scale = 2)
    private double CPR_DESCONTO;

    @Column(name = "CPR_TOTAL", nullable = true, precision = 18, scale = 2)
    private double CPR_TOTAL;

    @Override
    public String toString() {
        return "";
    }

    public CompraProdutoModel() {
    }

    public CompraProdutoModel(int CPP_CODIGO,CompraModel COMPRA, ProdutoModel PRODUTO,double CPR_QTDE, double CPR_PRECO, double CPR_DESCONTO, double CPR_TOTAL) {
        this.CPP_CODIGO = CPP_CODIGO;
        this.COMPRA = COMPRA;
        this.PRODUTO = PRODUTO;
        this.CPR_QTDE = CPR_QTDE;
        this.CPR_PRECO = CPR_PRECO;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
    }

    public int getCPP_CODIGO() {
        return this.CPP_CODIGO;
    }

    public void setCPP_CODIGO(int CPP_CODIGO) {
        this.CPP_CODIGO = CPP_CODIGO;
    }
}
