package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VendaModel;

public class VendaTableModel extends AbstractTableModel {

    private ArrayList<VendaModel> linhas;
    String[] colunas = {"ID", "Login", "Nome", "Senha", "Ativo"};

    public VendaTableModel(ArrayList<VendaModel> arrayvenda) {
        linhas = arrayvenda;
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
        VendaModel venda = (VendaModel) linhas.get(row);
        switch (col) {
            case 0:
                return venda.getVDA_CODIGO();              
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de VendaModel
    public void addLista(ArrayList<VendaModel> venda) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(venda);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}