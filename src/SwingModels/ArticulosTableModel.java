package SwingModels;

import model.Articulos;

import java.util.List;

public class ArticulosTableModel extends AbstractDAOTableModel {
    public final String[] columnNames = new String[]{"Ref", "Nombre", "Precio"};
    private List<Articulos> articulosList;

    public ArticulosTableModel(List<Articulos> articulosList) {
        this.articulosList = articulosList;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public boolean isTableEditable() {
        return false;
    }

    public List<Articulos> getArticulosList() {
        return articulosList;
    }

    @Override
    public int getRowCount() {
        return articulosList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return articulosList.get(rowIndex).getReferart();
            case 1:
                return articulosList.get(rowIndex).getNomart();
            case 2:
                return articulosList.get(rowIndex).getPrecio();
            default:
                return null;
        }
    }
}
