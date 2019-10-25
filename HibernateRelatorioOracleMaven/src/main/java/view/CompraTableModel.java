package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.CompraModel;

public class CompraTableModel extends AbstractTableModel {

    private ArrayList<CompraModel> linhas;
    String[] colunas = {"ID", "Login", "Nome", "Senha", "Ativo"};

    public CompraTableModel(ArrayList<CompraModel> arraycompra) {
        linhas = arraycompra;
    }

    //Retorna a quantidade de colunas do modelo, que no caso será fixa
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    //Retorna a quantidade de linhas atual do objeto, que no caso é o tamnho da lista
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    //Retorna o nome da coluna, recebendo seu índice
    @Override
    public String getColumnName(int indiceColuna) {
        return colunas[indiceColuna];
    }

    @Override
    public Object getValueAt(int row, int col) {
        CompraModel compra = (CompraModel) linhas.get(row);
        switch (col) {
            case 0:
                return compra.getCPR_CODIGO();            
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de CompraModel
    public void addLista(ArrayList<CompraModel> compra) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(compra);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}