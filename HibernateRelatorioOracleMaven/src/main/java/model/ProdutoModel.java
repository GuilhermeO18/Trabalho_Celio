package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUTO")
public class ProdutoModel implements java.io.Serializable {

    @Id
    @Column(name = "PRO_CODIGO", nullable = true, precision = 10, scale = 0)
    private int PRO_CODIGO;

    @Column(name = "PRO_NOME", nullable = false, length = 80)
    private String PRO_NOME;

    @Column(name = "PRO_ESTOQUE", nullable = true, precision = 18, scale = 4)
    private double PRO_ESTOQUE;

    @Column(name = "PRO_UNIDADE", nullable = true, length = 5)
    private String PRO_UNIDADE;

    @Column(name = "PRO_PRECO", nullable = true, precision = 18, scale = 2)
    private double PRO_PRECO;

    @Column(name = "PRO_CUSTO", nullable = true, precision = 18, scale = 2)
    private double PRO_CUSTO;

    @Column(name = "PRO_ATACADO", nullable = true, precision = 18, scale = 2)
    private double PRO_ATACADO;

    @Column(name = "PRO_MIN", nullable = true, precision = 18, scale = 4)
    private double PRO_MIN;

    @Column(name = "PRO_MAX", nullable = true, precision = 18, scale = 4)
    private double PRO_MAX;

    @Column(name = "PRO_EMBALAGEM", nullable = true, precision = 9, scale = 0)
    private double PRO_EMBALAGEM;

    @Column(name = "PRO_PESO", nullable = true, precision = 18, scale = 4)
    private double PRO_PESO;

    @Column(name = "PRO_DTCADASTRO", nullable = true, length = 10)
    private String PRO_DTCADASTRO;

    @Column(name = "PRO_OBS", nullable = true, length = 80)
    private String PRO_OBS;

    @Column(name = "PRO_ATIVO", precision = 1)
    private int PRO_ATIVO;
    
    @Column(name = "PRO_TIPO", nullable = true, length = 1)
    private String PRO_TIPO;

    @Override
    public String toString() {
        return this.PRO_NOME;
    }

    public ProdutoModel() {
    }

    public ProdutoModel(int PRO_CODIGO, String PRO_NOME, double PRO_ESTOQUE, String PRO_UNIDADE, double PRO_PRECO, double PRO_CUSTO, double PRO_ATACADO, double PRO_MIN, double PRO_MAX, double PRO_EMBALAGEM, double PRO_PESO, String PRO_DTCADASTRO, String PRO_OBS, int PRO_ATIVO, String PRO_TIPO) {
        this.PRO_CODIGO = PRO_CODIGO;
        this.PRO_NOME = PRO_NOME;
        this.PRO_ESTOQUE = PRO_ESTOQUE;
        this.PRO_UNIDADE = PRO_UNIDADE;
        this.PRO_PRECO = PRO_PRECO;
        this.PRO_CUSTO = PRO_CUSTO;
        this.PRO_ATACADO = PRO_ATACADO;
        this.PRO_MIN = PRO_MIN;
        this.PRO_MAX = PRO_MAX;
        this.PRO_EMBALAGEM = PRO_EMBALAGEM;
        this.PRO_PESO = PRO_PESO;
        this.PRO_DTCADASTRO = PRO_DTCADASTRO;
        this.PRO_OBS = PRO_OBS ;
        this.PRO_ATIVO = PRO_ATIVO;
        
    }

    public int getPRO_CODIGO() {
        return this.PRO_CODIGO;
    }

    public void setPRO_CODIGO(int PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }

    public String getPRO_NOME() {
        return this.PRO_NOME;
    }

    public void setPRO_NOME(String PRO_NOME) {
        this.PRO_NOME = PRO_NOME;
    }

    public double getPRO_ESTOQUE() {
        return PRO_ESTOQUE;
    }

    public void setPRO_ESTOQUE(double PRO_ESTOQUE) {
        this.PRO_ESTOQUE = PRO_ESTOQUE;
    }

    public String getPRO_UNIDADE() {
        return PRO_UNIDADE;
    }

    public void setPRO_UNIDADE(String PRO_UNIDADE) {
        this.PRO_UNIDADE = PRO_UNIDADE;
    }

    public double getPRO_PRECO() {
        return PRO_PRECO;
    }

    public void setPRO_PRECO(double PRO_PRECO) {
        this.PRO_PRECO = PRO_PRECO;
    }

    public double getPRO_CUSTO() {
        return PRO_CUSTO;
    }

    public void setPRO_CUSTO(double PRO_CUSTO) {
        this.PRO_CUSTO = PRO_CUSTO;
    }

    public double getPRO_ATACADO() {
        return PRO_ATACADO;
    }

    public void setPRO_ATACADO(double PRO_ATACADO) {
        this.PRO_ATACADO = PRO_ATACADO;
    }

    public double getPRO_MIN() {
        return PRO_MIN;
    }

    public void setPRO_MIN(double PRO_MIN) {
        this.PRO_MIN = PRO_MIN;
    }

    public double getPRO_MAX() {
        return PRO_MAX;
    }

    public void setPRO_MAX(double PRO_MAX) {
        this.PRO_MAX = PRO_MAX;
    }

    public double getPRO_EMBALAGEM() {
        return PRO_EMBALAGEM;
    }

    public void setPRO_EMBALAGEM(double PRO_EMBALAGEM) {
        this.PRO_EMBALAGEM = PRO_EMBALAGEM;
    }

    public double getPRO_PESO() {
        return PRO_PESO;
    }

    public void setPRO_PESO(double PRO_PESO) {
        this.PRO_PESO = PRO_PESO;
    }

    public String getPRO_DTCADASTRO() {
        return PRO_DTCADASTRO;
    }

    public void setPRO_DTCADASTRO(String PRO_DTCADASTRO) {
        this.PRO_DTCADASTRO = PRO_DTCADASTRO;
    }

    public String getPRO_OBS() {
        return PRO_OBS;
    }

    public void setPRO_OBS(String PRO_OBS) {
        this.PRO_OBS = PRO_OBS;
    }

    public String getPRO_TIPO() {
        return PRO_TIPO;
    }

    public void setPRO_TIPO(String PRO_TIPO) {
        this.PRO_TIPO = PRO_TIPO;
    }

    public int getPRO_ATIVO() {
        return this.PRO_ATIVO;
    }

    public void setPRO_ATIVO(int PRO_ATIVO) {
        this.PRO_ATIVO = PRO_ATIVO;
    }
}
