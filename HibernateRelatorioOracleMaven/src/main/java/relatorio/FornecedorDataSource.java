package relatorio;

import java.util.Iterator;
import java.util.List;
import model.FornecedorModel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.UsuarioModel;

public class FornecedorDataSource implements JRDataSource {

    private Iterator itrUsuarios;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    /**
     * @param campos
     * @param itr
     */
    public FornecedorDataSource(List lista) {
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
        FornecedorModel fornecedor = (FornecedorModel) valorAtual;

        if ("FOR_CODIGO".equals(campo.getName())) {
            valor = fornecedor.getFOR_CODIGO();
        } else if ("PES_CODIGO".equals(campo.getName())) {
            valor = fornecedor.getPessoa().getPES_CODIGO();
        }

        return valor;
    }
}