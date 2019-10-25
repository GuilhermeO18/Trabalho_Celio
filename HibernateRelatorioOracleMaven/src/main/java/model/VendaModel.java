package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VENDA")
public class VendaModel implements java.io.Serializable {

    @Id
    @Column(name = "VDA_CODIGO", nullable = true, precision = 10, scale = 0)
    private int VDA_CODIGO;
    
    private UsuarioModel USUARIO;

    public UsuarioModel getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(UsuarioModel USUARIO) {
        this.USUARIO = USUARIO;
    }

    public ClienteModel getCLIENTE() {
        return CLIENTE;
    }

    public void setCLIENTE(ClienteModel CLIENTE) {
        this.CLIENTE = CLIENTE;
    }

    public String getVDA_DATA() {
        return VDA_DATA;
    }

    public void setVDA_DATA(String VDA_DATA) {
        this.VDA_DATA = VDA_DATA;
    }

    public double getVDA_VALOR() {
        return VDA_VALOR;
    }

    public void setVDA_VALOR(double VDA_VALOR) {
        this.VDA_VALOR = VDA_VALOR;
    }

    public double getVDA_DESCONTO() {
        return VDA_DESCONTO;
    }

    public void setVDA_DESCONTO(double VDA_DESCONTO) {
        this.VDA_DESCONTO = VDA_DESCONTO;
    }

    public double getVDA_TOTAL() {
        return VDA_TOTAL;
    }

    public void setVDA_TOTAL(double VDA_TOTAL) {
        this.VDA_TOTAL = VDA_TOTAL;
    }

    public String getVDA_OBS() {
        return VDA_OBS;
    }

    public void setVDA_OBS(String VDA_OBS) {
        this.VDA_OBS = VDA_OBS;
    }
    private ClienteModel CLIENTE;
    
    @Column(name = "VDA_DATA", nullable = true, length = 10)
    private String VDA_DATA;
    
    @Column(name = "VDA_VALOR", nullable = true, precision = 18, scale = 2)
    private double VDA_VALOR;
    
    @Column(name = "VDA_DESCONTO", nullable = true, precision = 18, scale = 2)
    private double VDA_DESCONTO;
    
    @Column(name = "VDA_TOTAL", nullable = true, precision = 18, scale = 2)
    private double VDA_TOTAL;
    
    @Column(name = "VDA_OBS", nullable = true, length = 80)
    private String VDA_OBS;
    


    @Override
    public String toString() {
        return this.VDA_DATA;
    }

    public VendaModel() {
    }

    public VendaModel(int VDA_CODIGO, UsuarioModel USUARIO, ClienteModel CLIENTE, String VDA_DATA, double VDA_VALOR, double VDA_DESCONTO, double VDA_TOTAL, String VDA_OBS) {
        this.VDA_CODIGO = VDA_CODIGO;
        this.USUARIO = USUARIO;
        this.CLIENTE = CLIENTE;
        this.VDA_DATA = VDA_DATA;
        this.VDA_VALOR = VDA_VALOR;
        this.VDA_DESCONTO = VDA_DESCONTO;
        this.VDA_TOTAL = VDA_TOTAL;
        this.VDA_OBS = VDA_OBS;
    }

    public int getVDA_CODIGO() {
        return this.VDA_CODIGO;
    }

    public void setVDA_CODIGO(int VDA_CODIGO) {
        this.VDA_CODIGO = VDA_CODIGO;
    }

}
