package SwingModels;

import model.Familias;

import java.util.List;

public class FamiliasTableModel extends AbstractDAOTableModel {

    public static String[] columnNames = new String[]{"Código", "Nombre"};
    @SuppressWarnings("FieldMayBeFinal")
    private List<Familias> familiasList;

    public FamiliasTableModel(List<Familias> familiasList) {
        this.familiasList = familiasList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex <= 0) return false;
        return isTableEditable;
    }

    @Override
    @SuppressWarnings("unused")
    public boolean isTableEditable() {
        return isTableEditable;
    }

    @Override
    public int getRowCount() {
        return familiasList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return familiasList.get(rowIndex).getCodfam();
            case 1:
                return familiasList.get(rowIndex).getNomfam();
            default:
                return null;
        }
    }

    public List<Familias> getFamiliasList() {
        return familiasList;
    }
}
