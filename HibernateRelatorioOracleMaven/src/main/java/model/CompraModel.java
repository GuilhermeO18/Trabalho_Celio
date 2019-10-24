package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPRA")
public class CompraModel implements java.io.Serializable {

    @Id
    @Column(name = "CPR_CODIGO", nullable = false, precision = 10, scale = 0)
    private int CPR_CODIGO;
    
    private UsuarioModel USUARIO;
    
    private FornecedorModel FORNECEDOR;

    @Column(name = "CPR_EMISSAO", nullable = false, length = 10)
    private String CPR_EMISSAO;

    @Column(name = "CPR_VALOR", nullable = false, precision = 18, scale = 2)
    private double CPR_VALOR;
    
    @Column(name = "CPR_DESCONTO", nullable = false, precision = 18, scale = 2)
    private double CPR_DESCONTO;
    
    @Column(name = "CPR_TOTAL", nullable = false, precision = 18, scale = 2)
    private double CPR_TOTAL;
    
    @Column(name = "CPR_DTENTRADA", nullable = false, length = 10)
    private String CPR_DTENTRADA;

    @Column(name = "CPR_OBS", nullable = false, length = 80)
    private String CPR_OBS;


    @Override
    public String toString() {
        return this.CPR_EMISSAO;
    }

    public CompraModel() {
    }

    public CompraModel(int CPR_CODIGO, UsuarioModel USUARIO, FornecedorModel FORNECEDOR, String CPR_EMISSAO, double CPR_VALOR, double CPR_DESCONTO, double CPR_TOTAL, String CPR_DTENTRADA, String CPR_OBS) {
        this.CPR_CODIGO = CPR_CODIGO;
        this.USUARIO = USUARIO;
        this.FORNECEDOR = FORNECEDOR;
        this.CPR_EMISSAO = CPR_EMISSAO;
        this.CPR_VALOR = CPR_VALOR;
        this.CPR_DESCONTO = CPR_DESCONTO;
        this.CPR_TOTAL = CPR_TOTAL;
        this.CPR_DTENTRADA = CPR_DTENTRADA;
        this.CPR_OBS = CPR_OBS;
    }

    public int getCPR_CODIGO() {
        return this.CPR_CODIGO;
    }

    public void setCPR_CODIGO(int CPR_CODIGO) {
        this.CPR_CODIGO = CPR_CODIGO;
    }

    public String getCPR_EMISSAO() {
        return this.CPR_EMISSAO;
    }

    public void setCPR_EMISSAO(String CPR_EMISSAO) {
        this.CPR_EMISSAO = CPR_EMISSAO;
    }

    public String getCPR_DTENTRADA() {
        return this.CPR_DTENTRADA;
    }

    public void setCPR_DTENTRADA(String CPR_DTENTRADA) {
        this.CPR_DTENTRADA = CPR_DTENTRADA;
    }

    public UsuarioModel getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(UsuarioModel USUARIO) {
        this.USUARIO = USUARIO;
    }

    public FornecedorModel getFORNECEDOR() {
        return FORNECEDOR;
    }

    public void setFORNECEDOR(FornecedorModel FORNECEDOR) {
        this.FORNECEDOR = FORNECEDOR;
    }

    public double getCPR_VALOR() {
        return CPR_VALOR;
    }

    public void setCPR_VALOR(double CPR_VALOR) {
        this.CPR_VALOR = CPR_VALOR;
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

    public String getCPR_OBS() {
        return this.CPR_OBS;
    }

    public void setCPR_OBS(String CPR_OBS) {
        this.CPR_OBS = CPR_OBS;
    }

}
