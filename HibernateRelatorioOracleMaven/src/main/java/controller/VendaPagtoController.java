package controller;

import dao.VendaPagtoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.VendaPagtoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class VendaPagtoController implements GenericController<VendaPagtoModel> {

    VendaPagtoDao vendaPagtodao;

    public VendaPagtoController() {
        vendaPagtodao = new VendaPagtoDao();
    }

    @Override
    public void incluir(VendaPagtoModel obj) throws Exception{
        vendaPagtodao.incluir(obj);
    }

    @Override
    public void alterar(VendaPagtoModel obj) throws Exception{
        vendaPagtodao.alterar(obj);
    }

    @Override
    public void excluir(VendaPagtoModel obj) throws Exception{
        vendaPagtodao.excluir(obj);
    }

    @Override
    public ArrayList<VendaPagtoModel> consultar(String filtro) {
        return vendaPagtodao.consultar(filtro);
    }

    @Override
    public void gravar(VendaPagtoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

    @Override
    public Exception imprimir() {
        Exception retorno = null;
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioVendaPagto.jasper");
//        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N

        Map parametros = new HashMap();
        
        List dados = consultar("");
        
        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource(dados);

        try {
            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport("Vendas Pagamentos - Bean Collection Data Source", inputStream, parametros, ds);

        } catch (Exception ex) {
            retorno =  ex;
        }
        return retorno;
    }
}
