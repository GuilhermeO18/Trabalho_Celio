package relatorio;

import java.util.Iterator;
import java.util.List;
import model.FormaPagtoModel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.UsuarioModel;

public class FormaPagtoDataSource implements JRDataSource {

    private Iterator itrUsuarios;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    /**
     * @param campos
     * @param itr
     */
    public FormaPagtoDataSource(List lista) {
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
        FormaPagtoModel formaPagto = (FormaPagtoModel) valorAtual;

        if ("FPG_CODIGO".equals(campo.getName())) {
            valor = formaPagto.getFPG_CODIGO();
        } else if ("FPG_NOME".equals(campo.getName())) {
            valor = formaPagto.getFPG_NOME();
        }

        return valor;
    }
}