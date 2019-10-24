package controller;

import dao.CompraProdutoDao;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.CompraProdutoModel;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import util.ReportUtils;

public class CompraProdutoController implements GenericController<CompraProdutoModel> {

    CompraProdutoDao compraProdutodao;

    public CompraProdutoController() {
        compraProdutodao = new CompraProdutoDao();
    }

    @Override
    public void incluir(CompraProdutoModel obj) throws Exception{
        compraProdutodao.incluir(obj);
    }

    @Override
    public void alterar(CompraProdutoModel obj) throws Exception{
        compraProdutodao.alterar(obj);
    }

    @Override
    public void excluir(CompraProdutoModel obj) throws Exception{
        compraProdutodao.excluir(obj);
    }

    @Override
    public ArrayList<CompraProdutoModel> consultar(String filtro) {
        return compraProdutodao.consultar(filtro);
    }

    @Override
    public void gravar(CompraProdutoModel obj, String operacao) throws Exception{
        if (operacao.equals("incluir")) {
            incluir(obj);
        } else {
            alterar(obj);
        }
    }

    @Override
    public Exception imprimir() {
        Exception retorno = null;
        InputStream inputStream = getClass().getResourceAsStream("/relatorios/RelatorioCompraProduto.jasper");
//        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N

        Map parametros = new HashMap();
        
        List dados = consultar("");
        
        // criando o datasource com os dados criados
        JRDataSource ds = new JRBeanCollectionDataSource(dados);

        try {
            // passando o datasource para o método de criação e exibição do relatório
            ReportUtils.openReport("compras Produtos - Bean Collection Data Source", inputStream, parametros, ds);

        } catch (Exception ex) {
            retorno =  ex;
        }
        return retorno;
    }
}
