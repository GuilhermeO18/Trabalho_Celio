package controller;

import dao.VendaProdutoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.VendaProdutoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class VendaProdutoController implements GenericController<VendaProdutoModel> {

    VendaProdutoDao vendaProdutodao;

    public VendaProdutoController() {
        vendaProdutodao = new VendaProdutoDao();
    }

    @Override
    public void incluir(VendaProdutoModel obj) throws Exception{
        vendaProdutodao.incluir(obj);
    }

    @Override
    public void alterar(VendaProdutoModel obj) throws Exception{
        vendaProdutodao.alterar(obj);
    }

    @Override
    public void excluir(VendaProdutoModel obj) throws Exception{
        vendaProdutodao.excluir(obj);
    }

    @Override
    public ArrayList<VendaProdutoModel> consultar(String filtro) {
        return vendaProdutodao.consultar(filtro);
    }

    @Override
    public void gravar(VendaProdutoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

    @Override
    public Exception imprimir() {
        Exception retorno = null;
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioVendaProduto.jasper");
//        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N

        Map parametros = new HashMap();
        
        List dados = consultar("");
        
        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource(dados);

        try {
            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport("Vendas Produtos - Bean Collection Data Source", inputStream, parametros, ds);

        } catch (Exception ex) {
            retorno =  ex;
        }
        return retorno;
    }
}
