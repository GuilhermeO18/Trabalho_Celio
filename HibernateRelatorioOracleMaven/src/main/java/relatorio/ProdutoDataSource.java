package relatorio;

import java.util.Iterator;
import java.util.List;
import model.FormaPagtoModel;
import model.ProdutoModel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.UsuarioModel;

public class ProdutoDataSource implements JRDataSource {

    private Iterator itrUsuarios;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    /**
     * @param campos
     * @param itr
     */
    public ProdutoDataSource(List lista) {
        super();
        this.itrUsuarios = lista.iterator();
    }

    public boolean next() throws JRException {
        valorAtual = itrUsuarios.hasNext() ? itrUsuarios.next() : null;
        irParaProximoAluno = (valorAtual != null);
        return irParaProximoAluno;
    }

    public Object getFieldValue(JRField campo) throws JRException {
        Object valor = null;
        ProdutoModel produto = (ProdutoModel) valorAtual;

        if ("PRO_CODIGO".equals(campo.getName())) {
            valor = produto.getPRO_CODIGO();
        } else if ("PRO_NOME".equals(campo.getName())) {
            valor = produto.getPRO_NOME();
        } else if ("PRO_CUSTO".equals(campo.getName())) {
            valor = produto.getPRO_CUSTO();
        }

        return valor;
    }
}