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
@Table(name = "PESSOA")
public class PessoaModel implements Serializable{

	@Id
	@Column(name = "PES_CODIGO", nullable = true, precision = 10, scale = 0)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_PESSOA")
	private int PES_CODIGO;
	
	@Column(name = "PES_NOME", length = 80)
	private String PES_NOME;
	
	@Column(name = "PES_FANTASIA", length = 80)
	private String PES_FANTASIA;
	
	@Column(name = "PES_FISICA", precision = 1)
	private String PES_FISICA;
	
	@Column(name = "PES_CPFCNPJ", length = 80)
	private String PES_CPFCNPJ;
	
	@Column(name = "PES_RGIE", length = 20)
	private String PES_RGIE;
	
	@Column(name = "PES_CADASTRO", length = 10)
	private String PES_CADASTRO;
	
	@Column(name = "PES_ENDERECO", length = 120)
	private String PES_ENDERECO;
	
	@Column(name = "PES_NUMERO", length = 10)
	private String PES_NUMERO;
	
	@Column(name = "PES_COMPLEMENTO", length = 30)
	private String PES_COMPLEMENTO;
	
	@Column(name = "PES_BAIRRO", length = 50)
	private String PES_BAIRRO;
	
	@Column(name = "PES_CIDADE", length = 80)
	private String PES_CIDADE;
	
	@Column(name = "PES_UF", length = 2)
	private String PES_UF;
	
	@Column(name = "PES_CEP", length = 9)
	private String PES_CEP;
	
	@Column(name = "PES_FONE1", length = 16)
	private String PES_FONE1;
	
	@Column(name = "PES_FONE2", length = 16)
	private String PES_FONE2;
	
	@Column(name = "PES_CELULAR", length = 16)
	private String PES_CELULAR;
	
	@Column(name = "PES_SITE", length = 200)
	private String PES_SITE;
	
	@Column(name = "PES_EMAIL", length = 200)
	private String PES_EMAIL;
	
	@Column(name = "PES_ATIVO", precision = 1)
	private String PES_ATIVO;
	
	
	public PessoaModel() {
		super();
	}

	public PessoaModel(int pES_CODIGO, String pES_NOME, String pES_FANTASIA, String pES_FISICA, String pES_CPFCNPJ,
			String pES_RGIE, String pES_CADASTRO, String pES_ENDERECO, String pES_NUMERO, String pES_COMPLEMENTO,
			String pES_BAIRRO, String pES_CIDADE, String pES_UF, String pES_CEP, String pES_FONE1, String pES_FONE2,
			String pES_CELULAR, String pES_SITE, String pES_EMAIL, String pES_ATIVO) {
		super();
		PES_CODIGO = pES_CODIGO;
		PES_NOME = pES_NOME;
		PES_FANTASIA = pES_FANTASIA;
		PES_FISICA = pES_FISICA;
		PES_CPFCNPJ = pES_CPFCNPJ;
		PES_RGIE = pES_RGIE;
		PES_CADASTRO = pES_CADASTRO;
		PES_ENDERECO = pES_ENDERECO;
		PES_NUMERO = pES_NUMERO;
		PES_COMPLEMENTO = pES_COMPLEMENTO;
		PES_BAIRRO = pES_BAIRRO;
		PES_CIDADE = pES_CIDADE;
		PES_UF = pES_UF;
		PES_CEP = pES_CEP;
		PES_FONE1 = pES_FONE1;
		PES_FONE2 = pES_FONE2;
		PES_CELULAR = pES_CELULAR;
		PES_SITE = pES_SITE;
		PES_EMAIL = pES_EMAIL;
		PES_ATIVO = pES_ATIVO;
	}

	public int getPES_CODIGO() {
		return PES_CODIGO;
	}

	public void setPES_CODIGO(int pES_CODIGO) {
		PES_CODIGO = pES_CODIGO;
	}

	public String getPES_NOME() {
		return PES_NOME;
	}

	public void setPES_NOME(String pES_NOME) {
		PES_NOME = pES_NOME;
	}

	public String getPES_FANTASIA() {
		return PES_FANTASIA;
	}

	public void setPES_FANTASIA(String pES_FANTASIA) {
		PES_FANTASIA = pES_FANTASIA;
	}

	public String getPES_FISICA() {
		return PES_FISICA;
	}

	public void setPES_FISICA(String pES_FISICA) {
		PES_FISICA = pES_FISICA;
	}

	public String getPES_CPFCNPJ() {
		return PES_CPFCNPJ;
	}

	public void setPES_CPFCNPJ(String pES_CPFCNPJ) {
		PES_CPFCNPJ = pES_CPFCNPJ;
	}

	public String getPES_RGIE() {
		return PES_RGIE;
	}

	public void setPES_RGIE(String pES_RGIE) {
		PES_RGIE = pES_RGIE;
	}

	public String getPES_CADASTRO() {
		return PES_CADASTRO;
	}

	public void setPES_CADASTRO(String pES_CADASTRO) {
		PES_CADASTRO = pES_CADASTRO;
	}

	public String getPES_ENDERECO() {
		return PES_ENDERECO;
	}

	public void setPES_ENDERECO(String pES_ENDERECO) {
		PES_ENDERECO = pES_ENDERECO;
	}

	public String getPES_NUMERO() {
		return PES_NUMERO;
	}

	public void setPES_NUMERO(String pES_NUMERO) {
		PES_NUMERO = pES_NUMERO;
	}

	public String getPES_COMPLEMENTO() {
		return PES_COMPLEMENTO;
	}

	public void setPES_COMPLEMENTO(String pES_COMPLEMENTO) {
		PES_COMPLEMENTO = pES_COMPLEMENTO;
	}

	public String getPES_BAIRRO() {
		return PES_BAIRRO;
	}

	public void setPES_BAIRRO(String pES_BAIRRO) {
		PES_BAIRRO = pES_BAIRRO;
	}

	public String getPES_CIDADE() {
		return PES_CIDADE;
	}

	public void setPES_CIDADE(String pES_CIDADE) {
		PES_CIDADE = pES_CIDADE;
	}

	public String getPES_UF() {
		return PES_UF;
	}

	public void setPES_UF(String pES_UF) {
		PES_UF = pES_UF;
	}

	public String getPES_CEP() {
		return PES_CEP;
	}

	public void setPES_CEP(String pES_CEP) {
		PES_CEP = pES_CEP;
	}

	public String getPES_FONE1() {
		return PES_FONE1;
	}

	public void setPES_FONE1(String pES_FONE1) {
		PES_FONE1 = pES_FONE1;
	}

	public String getPES_FONE2() {
		return PES_FONE2;
	}

	public void setPES_FONE2(String pES_FONE2) {
		PES_FONE2 = pES_FONE2;
	}

	public String getPES_CELULAR() {
		return PES_CELULAR;
	}

	public void setPES_CELULAR(String pES_CELULAR) {
		PES_CELULAR = pES_CELULAR;
	}

	public String getPES_SITE() {
		return PES_SITE;
	}

	public void setPES_SITE(String pES_SITE) {
		PES_SITE = pES_SITE;
	}

	public String getPES_EMAIL() {
		return PES_EMAIL;
	}

	public void setPES_EMAIL(String pES_EMAIL) {
		PES_EMAIL = pES_EMAIL;
	}

	public String getPES_ATIVO() {
		return PES_ATIVO;
	}

	public void setPES_ATIVO(String pES_ATIVO) {
		PES_ATIVO = pES_ATIVO;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getPES_NOME();
	}
}
