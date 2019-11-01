package relatorio;

import java.util.Iterator;
import java.util.List;
import model.ClienteModel;
import model.FornecedorModel;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import model.UsuarioModel;

public class ClienteDataSource implements JRDataSource {

    private Iterator itrUsuarios;
    private Object valorAtual;

    private int i = 0;

    private boolean irParaProximoAluno = true;

    /**
     * @param campos
     * @param itr
     */
    public ClienteDataSource(List lista) {
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
        ClienteModel cliente = (ClienteModel) valorAtual;

        if ("FOR_CODIGO".equals(campo.getName())) {
            valor = cliente.getCLI_CODIGO();
        } else if ("PES_CODIGO".equals(campo.getName())) {
            valor = cliente.getPessoa().getPES_CODIGO();
        } else if ("CLI_LIMITECRED".equals(campo.getName())) {
            valor = cliente.getCLI_LIMITECRED();
        }

        return valor;
    }
}