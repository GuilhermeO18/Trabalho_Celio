package view;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.FormaPagtoModel;

public class FormaPagtoTableModel extends AbstractTableModel {

    private ArrayList<FormaPagtoModel> linhas;
    String[] colunas = {"ID", "Nome", "Ativo"};

    public FormaPagtoTableModel(ArrayList<FormaPagtoModel> arrayformaPagto) {
        linhas = arrayformaPagto;
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
        FormaPagtoModel formaPagto = (FormaPagtoModel) linhas.get(row);
        switch (col) {
            case 0:
                return formaPagto.getFPG_CODIGO();
            case 1:
                return formaPagto.getFPG_NOME();
            case 3:
                return formaPagto.getFPG_ATIVO();                
            default:
                return null;
        }
    }

    //Adicionamos várias linhas na tabela de uma vez, recebendo um List de FormaPagtoModel
    public void addLista(ArrayList<FormaPagtoModel> formaPagto) {
        int tamanhoAntigo = getRowCount();

        //Adiciona os usuários
        linhas.addAll(formaPagto);

        //Aqui reportamos a mudança para o JTable, assim ele pode se redesenhar, para visualizarmos a alteração
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }
}